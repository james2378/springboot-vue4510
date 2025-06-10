package com.entity.view;

import com.entity.ChexingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车型信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
@TableName("chexingxinxi")
public class ChexingxinxiView  extends ChexingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChexingxinxiView(){
	}
 
 	public ChexingxinxiView(ChexingxinxiEntity chexingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, chexingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
