package com.entity.vo;

import com.entity.ChexingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车型信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public class ChexingxinxiVO  implements Serializable {
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
