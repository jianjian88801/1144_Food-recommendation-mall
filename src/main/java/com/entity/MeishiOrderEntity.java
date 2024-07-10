package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 美食订单
 *
 * @author 
 * @email
 */
@TableName("meishi_order")
public class MeishiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeishiOrderEntity() {

	}

	public MeishiOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 订单号
     */
    @TableField(value = "meishi_order_uuid_number")

    private String meishiOrderUuidNumber;


    /**
     * 美食
     */
    @TableField(value = "meishi_id")

    private Integer meishiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 购买数量
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 实付价格
     */
    @TableField(value = "meishi_order_true_price")

    private Double meishiOrderTruePrice;


    /**
     * 订单类型
     */
    @TableField(value = "meishi_order_types")

    private Integer meishiOrderTypes;


    /**
     * 支付类型
     */
    @TableField(value = "meishi_order_payment_types")

    private Integer meishiOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：订单号
	 */
    public String getMeishiOrderUuidNumber() {
        return meishiOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setMeishiOrderUuidNumber(String meishiOrderUuidNumber) {
        this.meishiOrderUuidNumber = meishiOrderUuidNumber;
    }
    /**
	 * 设置：美食
	 */
    public Integer getMeishiId() {
        return meishiId;
    }


    /**
	 * 获取：美食
	 */

    public void setMeishiId(Integer meishiId) {
        this.meishiId = meishiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getMeishiOrderTruePrice() {
        return meishiOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setMeishiOrderTruePrice(Double meishiOrderTruePrice) {
        this.meishiOrderTruePrice = meishiOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getMeishiOrderTypes() {
        return meishiOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setMeishiOrderTypes(Integer meishiOrderTypes) {
        this.meishiOrderTypes = meishiOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getMeishiOrderPaymentTypes() {
        return meishiOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setMeishiOrderPaymentTypes(Integer meishiOrderPaymentTypes) {
        this.meishiOrderPaymentTypes = meishiOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "MeishiOrder{" +
            "id=" + id +
            ", meishiOrderUuidNumber=" + meishiOrderUuidNumber +
            ", meishiId=" + meishiId +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", meishiOrderTruePrice=" + meishiOrderTruePrice +
            ", meishiOrderTypes=" + meishiOrderTypes +
            ", meishiOrderPaymentTypes=" + meishiOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
