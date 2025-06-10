package com.entity.view;

import com.entity.ChecixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车次信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
@TableName("checixinxi")
public class ChecixinxiView  extends ChecixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChecixinxiView(){
	}
 
 	public ChecixinxiView(ChecixinxiEntity checixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, checixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
