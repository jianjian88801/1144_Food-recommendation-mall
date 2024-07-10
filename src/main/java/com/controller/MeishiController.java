
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 美食
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/meishi")
public class MeishiController {
    private static final Logger logger = LoggerFactory.getLogger(MeishiController.class);

    @Autowired
    private MeishiService meishiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private ShangjiaService shangjiaService;

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("商家".equals(role))
            params.put("shangjiaId",request.getSession().getAttribute("userId"));
        params.put("meishiDeleteStart",1);params.put("meishiDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","meishi_clicknum");
        }
        PageUtils page = meishiService.queryPage(params);

        //字典表数据转换
        List<MeishiView> list =(List<MeishiView>)page.getList();
        for(MeishiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        MeishiEntity meishi = meishiService.selectById(id);
        if(meishi !=null){
            //entity转view
            MeishiView view = new MeishiView();
            BeanUtils.copyProperties( meishi , view );//把实体数据重构到view中

                //级联表
                ShangjiaEntity shangjia = shangjiaService.selectById(meishi.getShangjiaId());
                if(shangjia != null){
                    BeanUtils.copyProperties( shangjia , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShangjiaId(shangjia.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody MeishiEntity meishi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,meishi:{}",this.getClass().getName(),meishi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("商家".equals(role))
            meishi.setShangjiaId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<MeishiEntity> queryWrapper = new EntityWrapper<MeishiEntity>()
            .eq("shangjia_id", meishi.getShangjiaId())
            .eq("meishi_name", meishi.getMeishiName())
            .eq("meishi_types", meishi.getMeishiTypes())
            .eq("meishi_kucun_number", meishi.getMeishiKucunNumber())
            .eq("meishi_price", meishi.getMeishiPrice())
            .eq("meishi_clicknum", meishi.getMeishiClicknum())
            .eq("shangxia_types", meishi.getShangxiaTypes())
            .eq("meishi_delete", meishi.getMeishiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MeishiEntity meishiEntity = meishiService.selectOne(queryWrapper);
        if(meishiEntity==null){
            meishi.setMeishiClicknum(1);
            meishi.setShangxiaTypes(1);
            meishi.setMeishiDelete(1);
            meishi.setCreateTime(new Date());
            meishiService.insert(meishi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody MeishiEntity meishi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,meishi:{}",this.getClass().getName(),meishi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("商家".equals(role))
//            meishi.setShangjiaId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<MeishiEntity> queryWrapper = new EntityWrapper<MeishiEntity>()
            .notIn("id",meishi.getId())
            .andNew()
            .eq("shangjia_id", meishi.getShangjiaId())
            .eq("meishi_name", meishi.getMeishiName())
            .eq("meishi_types", meishi.getMeishiTypes())
            .eq("meishi_kucun_number", meishi.getMeishiKucunNumber())
            .eq("meishi_price", meishi.getMeishiPrice())
            .eq("meishi_clicknum", meishi.getMeishiClicknum())
            .eq("shangxia_types", meishi.getShangxiaTypes())
            .eq("meishi_delete", meishi.getMeishiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MeishiEntity meishiEntity = meishiService.selectOne(queryWrapper);
        if("".equals(meishi.getMeishiPhoto()) || "null".equals(meishi.getMeishiPhoto())){
                meishi.setMeishiPhoto(null);
        }
        if(meishiEntity==null){
            meishiService.updateById(meishi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<MeishiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            MeishiEntity meishiEntity = new MeishiEntity();
            meishiEntity.setId(id);
            meishiEntity.setMeishiDelete(2);
            list.add(meishiEntity);
        }
        if(list != null && list.size() >0){
            meishiService.updateBatchById(list);
        }
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<MeishiEntity> meishiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            MeishiEntity meishiEntity = new MeishiEntity();
//                            meishiEntity.setShangjiaId(Integer.valueOf(data.get(0)));   //商家 要改的
//                            meishiEntity.setMeishiName(data.get(0));                    //美食名称 要改的
//                            meishiEntity.setMeishiPhoto("");//照片
//                            meishiEntity.setMeishiTypes(Integer.valueOf(data.get(0)));   //美食类型 要改的
//                            meishiEntity.setMeishiKucunNumber(Integer.valueOf(data.get(0)));   //美食库存 要改的
//                            meishiEntity.setMeishiPrice(Integer.valueOf(data.get(0)));   //购买获得积分 要改的
//                            meishiEntity.setMeishiOldMoney(data.get(0));                    //美食原价 要改的
//                            meishiEntity.setMeishiNewMoney(data.get(0));                    //现价 要改的
//                            meishiEntity.setMeishiClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            meishiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            meishiEntity.setMeishiDelete(1);//逻辑删除字段
//                            meishiEntity.setMeishiContent("");//照片
//                            meishiEntity.setCreateTime(date);//时间
                            meishiList.add(meishiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        meishiService.insertBatch(meishiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","meishi_clicknum");
        }
        PageUtils page = meishiService.queryPage(params);

        //字典表数据转换
        List<MeishiView> list =(List<MeishiView>)page.getList();
        for(MeishiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        MeishiEntity meishi = meishiService.selectById(id);
            if(meishi !=null){

                //点击数量加1
                meishi.setMeishiClicknum(meishi.getMeishiClicknum()+1);
                meishiService.updateById(meishi);

                //entity转view
                MeishiView view = new MeishiView();
                BeanUtils.copyProperties( meishi , view );//把实体数据重构到view中

                //级联表
                    ShangjiaEntity shangjia = shangjiaService.selectById(meishi.getShangjiaId());
                if(shangjia != null){
                    BeanUtils.copyProperties( shangjia , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setShangjiaId(shangjia.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody MeishiEntity meishi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,meishi:{}",this.getClass().getName(),meishi.toString());
        Wrapper<MeishiEntity> queryWrapper = new EntityWrapper<MeishiEntity>()
            .eq("shangjia_id", meishi.getShangjiaId())
            .eq("meishi_name", meishi.getMeishiName())
            .eq("meishi_types", meishi.getMeishiTypes())
            .eq("meishi_kucun_number", meishi.getMeishiKucunNumber())
            .eq("meishi_price", meishi.getMeishiPrice())
            .eq("meishi_clicknum", meishi.getMeishiClicknum())
            .eq("shangxia_types", meishi.getShangxiaTypes())
            .eq("meishi_delete", meishi.getMeishiDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MeishiEntity meishiEntity = meishiService.selectOne(queryWrapper);
        if(meishiEntity==null){
            meishi.setMeishiDelete(1);
            meishi.setCreateTime(new Date());
        meishiService.insert(meishi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
