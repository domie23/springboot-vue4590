package com.entity.view;

import com.entity.CheliangweizhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆违章
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
@TableName("cheliangweizhang")
public class CheliangweizhangView  extends CheliangweizhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangweizhangView(){
	}
 
 	public CheliangweizhangView(CheliangweizhangEntity cheliangweizhangEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangweizhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
