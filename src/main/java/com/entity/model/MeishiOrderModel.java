package com.entity.model;

import com.entity.MeishiOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 美食订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeishiOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String meishiOrderUuidNumber;


    /**
     * 美食
     */
    private Integer meishiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买数量
     */
    private Integer buyNumber;


    /**
     * 实付价格
     */
    private Double meishiOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer meishiOrderTypes;


    /**
     * 支付类型
     */
    private Integer meishiOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 获取：订单号
	 */
    public String getMeishiOrderUuidNumber() {
        return meishiOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setMeishiOrderUuidNumber(String meishiOrderUuidNumber) {
        this.meishiOrderUuidNumber = meishiOrderUuidNumber;
    }
    /**
	 * 获取：美食
	 */
    public Integer getMeishiId() {
        return meishiId;
    }


    /**
	 * 设置：美食
	 */
    public void setMeishiId(Integer meishiId) {
        this.meishiId = meishiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 设置：购买数量
	 */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getMeishiOrderTruePrice() {
        return meishiOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setMeishiOrderTruePrice(Double meishiOrderTruePrice) {
        this.meishiOrderTruePrice = meishiOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getMeishiOrderTypes() {
        return meishiOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setMeishiOrderTypes(Integer meishiOrderTypes) {
        this.meishiOrderTypes = meishiOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getMeishiOrderPaymentTypes() {
        return meishiOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setMeishiOrderPaymentTypes(Integer meishiOrderPaymentTypes) {
        this.meishiOrderPaymentTypes = meishiOrderPaymentTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
