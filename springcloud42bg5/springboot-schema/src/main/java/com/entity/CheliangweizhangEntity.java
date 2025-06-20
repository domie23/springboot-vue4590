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
 * 车辆违章
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
@TableName("cheliangweizhang")
public class CheliangweizhangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheliangweizhangEntity() {
		
	}
	
	public CheliangweizhangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 违规照片
	 */
					
	private String weiguizhaopian;
	
	/**
	 * 罚款金额
	 */
					
	private Integer fakuanjine;
	
	/**
	 * 扣分
	 */
					
	private Integer koufen;
	
	/**
	 * 违章日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date weizhangriqi;
	
	/**
	 * 违章说明
	 */
					
	private String weizhangshuoming;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 用户手机
	 */
					
	private String yonghushouji;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 驾驶证
	 */
					
	private String jiashizheng;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：违规照片
	 */
	public void setWeiguizhaopian(String weiguizhaopian) {
		this.weiguizhaopian = weiguizhaopian;
	}
	/**
	 * 获取：违规照片
	 */
	public String getWeiguizhaopian() {
		return weiguizhaopian;
	}
	/**
	 * 设置：罚款金额
	 */
	public void setFakuanjine(Integer fakuanjine) {
		this.fakuanjine = fakuanjine;
	}
	/**
	 * 获取：罚款金额
	 */
	public Integer getFakuanjine() {
		return fakuanjine;
	}
	/**
	 * 设置：扣分
	 */
	public void setKoufen(Integer koufen) {
		this.koufen = koufen;
	}
	/**
	 * 获取：扣分
	 */
	public Integer getKoufen() {
		return koufen;
	}
	/**
	 * 设置：违章日期
	 */
	public void setWeizhangriqi(Date weizhangriqi) {
		this.weizhangriqi = weizhangriqi;
	}
	/**
	 * 获取：违章日期
	 */
	public Date getWeizhangriqi() {
		return weizhangriqi;
	}
	/**
	 * 设置：违章说明
	 */
	public void setWeizhangshuoming(String weizhangshuoming) {
		this.weizhangshuoming = weizhangshuoming;
	}
	/**
	 * 获取：违章说明
	 */
	public String getWeizhangshuoming() {
		return weizhangshuoming;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：用户手机
	 */
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
	/**
	 * 设置：驾驶证
	 */
	public void setJiashizheng(String jiashizheng) {
		this.jiashizheng = jiashizheng;
	}
	/**
	 * 获取：驾驶证
	 */
	public String getJiashizheng() {
		return jiashizheng;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
