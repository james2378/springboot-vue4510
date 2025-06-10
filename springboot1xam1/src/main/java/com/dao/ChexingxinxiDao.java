package com.dao;

import com.entity.ChexingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChexingxinxiVO;
import com.entity.view.ChexingxinxiView;


/**
 * 车型信息
 * 
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface ChexingxinxiDao extends BaseMapper<ChexingxinxiEntity> {
	
	List<ChexingxinxiVO> selectListVO(@Param("ew") Wrapper<ChexingxinxiEntity> wrapper);
	
	ChexingxinxiVO selectVO(@Param("ew") Wrapper<ChexingxinxiEntity> wrapper);
	
	List<ChexingxinxiView> selectListView(@Param("ew") Wrapper<ChexingxinxiEntity> wrapper);

	List<ChexingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChexingxinxiEntity> wrapper);
	
	ChexingxinxiView selectView(@Param("ew") Wrapper<ChexingxinxiEntity> wrapper);
	
}
