package com.entity.model;

import com.entity.MeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 美食
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商家
     */
    private Integer shangjiaId;


    /**
     * 美食名称
     */
    private String meishiName;


    /**
     * 美食照片
     */
    private String meishiPhoto;


    /**
     * 美食类型
     */
    private Integer meishiTypes;


    /**
     * 美食库存
     */
    private Integer meishiKucunNumber;


    /**
     * 购买获得积分
     */
    private Integer meishiPrice;


    /**
     * 美食原价
     */
    private Double meishiOldMoney;


    /**
     * 现价
     */
    private Double meishiNewMoney;


    /**
     * 点击次数
     */
    private Integer meishiClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer meishiDelete;


    /**
     * 美食介绍
     */
    private String meishiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }


    /**
	 * 设置：商家
	 */
    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 获取：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }


    /**
	 * 设置：美食名称
	 */
    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 获取：美食照片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }


    /**
	 * 设置：美食照片
	 */
    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 获取：美食类型
	 */
    public Integer getMeishiTypes() {
        return meishiTypes;
    }


    /**
	 * 设置：美食类型
	 */
    public void setMeishiTypes(Integer meishiTypes) {
        this.meishiTypes = meishiTypes;
    }
    /**
	 * 获取：美食库存
	 */
    public Integer getMeishiKucunNumber() {
        return meishiKucunNumber;
    }


    /**
	 * 设置：美食库存
	 */
    public void setMeishiKucunNumber(Integer meishiKucunNumber) {
        this.meishiKucunNumber = meishiKucunNumber;
    }
    /**
	 * 获取：购买获得积分
	 */
    public Integer getMeishiPrice() {
        return meishiPrice;
    }


    /**
	 * 设置：购买获得积分
	 */
    public void setMeishiPrice(Integer meishiPrice) {
        this.meishiPrice = meishiPrice;
    }
    /**
	 * 获取：美食原价
	 */
    public Double getMeishiOldMoney() {
        return meishiOldMoney;
    }


    /**
	 * 设置：美食原价
	 */
    public void setMeishiOldMoney(Double meishiOldMoney) {
        this.meishiOldMoney = meishiOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getMeishiNewMoney() {
        return meishiNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setMeishiNewMoney(Double meishiNewMoney) {
        this.meishiNewMoney = meishiNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getMeishiClicknum() {
        return meishiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setMeishiClicknum(Integer meishiClicknum) {
        this.meishiClicknum = meishiClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getMeishiDelete() {
        return meishiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setMeishiDelete(Integer meishiDelete) {
        this.meishiDelete = meishiDelete;
    }
    /**
	 * 获取：美食介绍
	 */
    public String getMeishiContent() {
        return meishiContent;
    }


    /**
	 * 设置：美食介绍
	 */
    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
