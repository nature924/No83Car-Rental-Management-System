package com.entity.view;

import com.entity.ZuchedingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租车订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
@TableName("zuchedingdan")
public class ZuchedingdanView  extends ZuchedingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuchedingdanView(){
	}
 
 	public ZuchedingdanView(ZuchedingdanEntity zuchedingdanEntity){
 	try {
			BeanUtils.copyProperties(this, zuchedingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
