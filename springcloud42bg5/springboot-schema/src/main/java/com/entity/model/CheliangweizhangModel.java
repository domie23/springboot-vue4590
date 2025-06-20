package com.entity.model;

import com.entity.CheliangweizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车辆违章
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
public class CheliangweizhangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
