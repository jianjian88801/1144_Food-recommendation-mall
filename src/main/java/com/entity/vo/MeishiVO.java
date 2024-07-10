package com.entity.vo;

import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 美食
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meishi")
public class MeishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商家
     */

    @TableField(value = "shangjia_id")
    private Integer shangjiaId;


    /**
     * 美食名称
     */

    @TableField(value = "meishi_name")
    private String meishiName;


    /**
     * 美食照片
     */

    @TableField(value = "meishi_photo")
    private String meishiPhoto;


    /**
     * 美食类型
     */

    @TableField(value = "meishi_types")
    private Integer meishiTypes;


    /**
     * 美食库存
     */

    @TableField(value = "meishi_kucun_number")
    private Integer meishiKucunNumber;


    /**
     * 购买获得积分
     */

    @TableField(value = "meishi_price")
    private Integer meishiPrice;


    /**
     * 美食原价
     */

    @TableField(value = "meishi_old_money")
    private Double meishiOldMoney;


    /**
     * 现价
     */

    @TableField(value = "meishi_new_money")
    private Double meishiNewMoney;


    /**
     * 点击次数
     */

    @TableField(value = "meishi_clicknum")
    private Integer meishiClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "meishi_delete")
    private Integer meishiDelete;


    /**
     * 美食介绍
     */

    @TableField(value = "meishi_content")
    private String meishiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }


    /**
	 * 获取：商家
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 设置：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }


    /**
	 * 获取：美食名称
	 */

    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 设置：美食照片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }


    /**
	 * 获取：美食照片
	 */

    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 设置：美食类型
	 */
    public Integer getMeishiTypes() {
        return meishiTypes;
    }


    /**
	 * 获取：美食类型
	 */

    public void setMeishiTypes(Integer meishiTypes) {
        this.meishiTypes = meishiTypes;
    }
    /**
	 * 设置：美食库存
	 */
    public Integer getMeishiKucunNumber() {
        return meishiKucunNumber;
    }


    /**
	 * 获取：美食库存
	 */

    public void setMeishiKucunNumber(Integer meishiKucunNumber) {
        this.meishiKucunNumber = meishiKucunNumber;
    }
    /**
	 * 设置：购买获得积分
	 */
    public Integer getMeishiPrice() {
        return meishiPrice;
    }


    /**
	 * 获取：购买获得积分
	 */

    public void setMeishiPrice(Integer meishiPrice) {
        this.meishiPrice = meishiPrice;
    }
    /**
	 * 设置：美食原价
	 */
    public Double getMeishiOldMoney() {
        return meishiOldMoney;
    }


    /**
	 * 获取：美食原价
	 */

    public void setMeishiOldMoney(Double meishiOldMoney) {
        this.meishiOldMoney = meishiOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getMeishiNewMoney() {
        return meishiNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setMeishiNewMoney(Double meishiNewMoney) {
        this.meishiNewMoney = meishiNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getMeishiClicknum() {
        return meishiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setMeishiClicknum(Integer meishiClicknum) {
        this.meishiClicknum = meishiClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getMeishiDelete() {
        return meishiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setMeishiDelete(Integer meishiDelete) {
        this.meishiDelete = meishiDelete;
    }
    /**
	 * 设置：美食介绍
	 */
    public String getMeishiContent() {
        return meishiContent;
    }


    /**
	 * 获取：美食介绍
	 */

    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
