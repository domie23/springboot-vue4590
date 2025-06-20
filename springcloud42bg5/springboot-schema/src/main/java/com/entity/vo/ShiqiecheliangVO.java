package com.entity.vo;

import com.entity.ShiqiecheliangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 失窃车辆
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
public class ShiqiecheliangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 车辆类型
	 */
	
	private String cheliangleixing;
		
	/**
	 * 车辆照片
	 */
	
	private String cheliangzhaopian;
		
	/**
	 * 车辆颜色
	 */
	
	private String cheliangyanse;
		
	/**
	 * 换挡方式
	 */
	
	private String huandangfangshi;
		
	/**
	 * 失窃位置
	 */
	
	private String shiqieweizhi;
		
	/**
	 * 车座
	 */
	
	private String chezuo;
				
	
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
	 * 设置：车辆类型
	 */
	 
	public void setCheliangleixing(String cheliangleixing) {
		this.cheliangleixing = cheliangleixing;
	}
	
	/**
	 * 获取：车辆类型
	 */
	public String getCheliangleixing() {
		return cheliangleixing;
	}
				
	
	/**
	 * 设置：车辆照片
	 */
	 
	public void setCheliangzhaopian(String cheliangzhaopian) {
		this.cheliangzhaopian = cheliangzhaopian;
	}
	
	/**
	 * 获取：车辆照片
	 */
	public String getCheliangzhaopian() {
		return cheliangzhaopian;
	}
				
	
	/**
	 * 设置：车辆颜色
	 */
	 
	public void setCheliangyanse(String cheliangyanse) {
		this.cheliangyanse = cheliangyanse;
	}
	
	/**
	 * 获取：车辆颜色
	 */
	public String getCheliangyanse() {
		return cheliangyanse;
	}
				
	
	/**
	 * 设置：换挡方式
	 */
	 
	public void setHuandangfangshi(String huandangfangshi) {
		this.huandangfangshi = huandangfangshi;
	}
	
	/**
	 * 获取：换挡方式
	 */
	public String getHuandangfangshi() {
		return huandangfangshi;
	}
				
	
	/**
	 * 设置：失窃位置
	 */
	 
	public void setShiqieweizhi(String shiqieweizhi) {
		this.shiqieweizhi = shiqieweizhi;
	}
	
	/**
	 * 获取：失窃位置
	 */
	public String getShiqieweizhi() {
		return shiqieweizhi;
	}
				
	
	/**
	 * 设置：车座
	 */
	 
	public void setChezuo(String chezuo) {
		this.chezuo = chezuo;
	}
	
	/**
	 * 获取：车座
	 */
	public String getChezuo() {
		return chezuo;
	}
			
}
