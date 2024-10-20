package com.entity.view;

import com.entity.QicheleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 汽车类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
@TableName("qicheleibie")
public class QicheleibieView  extends QicheleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QicheleibieView(){
	}
 
 	public QicheleibieView(QicheleibieEntity qicheleibieEntity){
 	try {
			BeanUtils.copyProperties(this, qicheleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
