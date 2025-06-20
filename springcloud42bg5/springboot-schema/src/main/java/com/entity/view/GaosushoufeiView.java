package com.entity.view;

import com.entity.GaosushoufeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 高速收费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
@TableName("gaosushoufei")
public class GaosushoufeiView  extends GaosushoufeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GaosushoufeiView(){
	}
 
 	public GaosushoufeiView(GaosushoufeiEntity gaosushoufeiEntity){
 	try {
			BeanUtils.copyProperties(this, gaosushoufeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
