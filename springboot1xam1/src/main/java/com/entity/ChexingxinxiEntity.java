package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 车型信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
@TableName("chexingxinxi")
public class ChexingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChexingxinxiEntity() {
		
	}
	
	public ChexingxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 火车编号
	 */
					
	private String huochebianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：火车编号
	 */
	public void setHuochebianhao(String huochebianhao) {
		this.huochebianhao = huochebianhao;
	}
	/**
	 * 获取：火车编号
	 */
	public String getHuochebianhao() {
		return huochebianhao;
	}
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
