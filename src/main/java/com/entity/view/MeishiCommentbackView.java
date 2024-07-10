package com.entity.view;

import com.entity.MeishiCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 美食评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("meishi_commentback")
public class MeishiCommentbackView extends MeishiCommentbackEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 meishi
			/**
			* 美食 的 商家
			*/
			private Integer meishiShangjiaId;
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
				* 美食类型的值
				*/
				private String meishiValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer meishiDelete;
			/**
			* 美食介绍
			*/
			private String meishiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 总积分
			*/
			private Double yonghuSumJifen;
			/**
			* 现积分
			*/
			private Double yonghuNewJifen;
			/**
			* 会员等级
			*/
			private Integer huiyuandengjiTypes;
				/**
				* 会员等级的值
				*/
				private String huiyuandengjiValue;

	public MeishiCommentbackView() {

	}

	public MeishiCommentbackView(MeishiCommentbackEntity meishiCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, meishiCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set meishi
					/**
					* 获取：美食 的 商家
					*/
					public Integer getMeishiShangjiaId() {
						return meishiShangjiaId;
					}
					/**
					* 设置：美食 的 商家
					*/
					public void setMeishiShangjiaId(Integer meishiShangjiaId) {
						this.meishiShangjiaId = meishiShangjiaId;
					}

					/**
					* 获取： 美食名称
					*/
					public String getMeishiName() {
						return meishiName;
					}
					/**
					* 设置： 美食名称
					*/
					public void setMeishiName(String meishiName) {
						this.meishiName = meishiName;
					}
					/**
					* 获取： 美食照片
					*/
					public String getMeishiPhoto() {
						return meishiPhoto;
					}
					/**
					* 设置： 美食照片
					*/
					public void setMeishiPhoto(String meishiPhoto) {
						this.meishiPhoto = meishiPhoto;
					}
					/**
					* 获取： 美食类型
					*/
					public Integer getMeishiTypes() {
						return meishiTypes;
					}
					/**
					* 设置： 美食类型
					*/
					public void setMeishiTypes(Integer meishiTypes) {
						this.meishiTypes = meishiTypes;
					}


						/**
						* 获取： 美食类型的值
						*/
						public String getMeishiValue() {
							return meishiValue;
						}
						/**
						* 设置： 美食类型的值
						*/
						public void setMeishiValue(String meishiValue) {
							this.meishiValue = meishiValue;
						}
					/**
					* 获取： 美食库存
					*/
					public Integer getMeishiKucunNumber() {
						return meishiKucunNumber;
					}
					/**
					* 设置： 美食库存
					*/
					public void setMeishiKucunNumber(Integer meishiKucunNumber) {
						this.meishiKucunNumber = meishiKucunNumber;
					}
					/**
					* 获取： 购买获得积分
					*/
					public Integer getMeishiPrice() {
						return meishiPrice;
					}
					/**
					* 设置： 购买获得积分
					*/
					public void setMeishiPrice(Integer meishiPrice) {
						this.meishiPrice = meishiPrice;
					}
					/**
					* 获取： 美食原价
					*/
					public Double getMeishiOldMoney() {
						return meishiOldMoney;
					}
					/**
					* 设置： 美食原价
					*/
					public void setMeishiOldMoney(Double meishiOldMoney) {
						this.meishiOldMoney = meishiOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getMeishiNewMoney() {
						return meishiNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setMeishiNewMoney(Double meishiNewMoney) {
						this.meishiNewMoney = meishiNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getMeishiClicknum() {
						return meishiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setMeishiClicknum(Integer meishiClicknum) {
						this.meishiClicknum = meishiClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getMeishiDelete() {
						return meishiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setMeishiDelete(Integer meishiDelete) {
						this.meishiDelete = meishiDelete;
					}
					/**
					* 获取： 美食介绍
					*/
					public String getMeishiContent() {
						return meishiContent;
					}
					/**
					* 设置： 美食介绍
					*/
					public void setMeishiContent(String meishiContent) {
						this.meishiContent = meishiContent;
					}
















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}
					/**
					* 获取： 总积分
					*/
					public Double getYonghuSumJifen() {
						return yonghuSumJifen;
					}
					/**
					* 设置： 总积分
					*/
					public void setYonghuSumJifen(Double yonghuSumJifen) {
						this.yonghuSumJifen = yonghuSumJifen;
					}
					/**
					* 获取： 现积分
					*/
					public Double getYonghuNewJifen() {
						return yonghuNewJifen;
					}
					/**
					* 设置： 现积分
					*/
					public void setYonghuNewJifen(Double yonghuNewJifen) {
						this.yonghuNewJifen = yonghuNewJifen;
					}
					/**
					* 获取： 会员等级
					*/
					public Integer getHuiyuandengjiTypes() {
						return huiyuandengjiTypes;
					}
					/**
					* 设置： 会员等级
					*/
					public void setHuiyuandengjiTypes(Integer huiyuandengjiTypes) {
						this.huiyuandengjiTypes = huiyuandengjiTypes;
					}


						/**
						* 获取： 会员等级的值
						*/
						public String getHuiyuandengjiValue() {
							return huiyuandengjiValue;
						}
						/**
						* 设置： 会员等级的值
						*/
						public void setHuiyuandengjiValue(String huiyuandengjiValue) {
							this.huiyuandengjiValue = huiyuandengjiValue;
						}



}
