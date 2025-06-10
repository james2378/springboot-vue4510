package com.entity.model;

import com.entity.ChexingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车型信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public class ChexingxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 火车名称
	 */
	
	private String huochemingcheng;
		
	/**
	 * 时速
	 */
	
	private String shisu;
		
	/**
	 * 座位数
	 */
	
	private String zuoweishu;
		
	/**
	 * 车牌
	 */
	
	private String chepai;
				
	
	/**
	 * 设置：火车名称
	 */
	 
	public void setHuochemingcheng(String huochemingcheng) {
		this.huochemingcheng = huochemingcheng;
	}
	
	/**
	 * 获取：火车名称
	 */
	public String getHuochemingcheng() {
		return huochemingcheng;
	}
				
	
	/**
	 * 设置：时速
	 */
	 
	public void setShisu(String shisu) {
		this.shisu = shisu;
	}
	
	/**
	 * 获取：时速
	 */
	public String getShisu() {
		return shisu;
	}
				
	
	/**
	 * 设置：座位数
	 */
	 
	public void setZuoweishu(String zuoweishu) {
		this.zuoweishu = zuoweishu;
	}
	
	/**
	 * 获取：座位数
	 */
	public String getZuoweishu() {
		return zuoweishu;
	}
				
	
	/**
	 * 设置：车牌
	 */
	 
	public void setChepai(String chepai) {
		this.chepai = chepai;
	}
	
	/**
	 * 获取：车牌
	 */
	public String getChepai() {
		return chepai;
	}
			
}
