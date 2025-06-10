package com.dao;

import com.entity.ChecixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChecixinxiVO;
import com.entity.view.ChecixinxiView;


/**
 * 车次信息
 * 
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface ChecixinxiDao extends BaseMapper<ChecixinxiEntity> {
	
	List<ChecixinxiVO> selectListVO(@Param("ew") Wrapper<ChecixinxiEntity> wrapper);
	
	ChecixinxiVO selectVO(@Param("ew") Wrapper<ChecixinxiEntity> wrapper);
	
	List<ChecixinxiView> selectListView(@Param("ew") Wrapper<ChecixinxiEntity> wrapper);

	List<ChecixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChecixinxiEntity> wrapper);
	
	ChecixinxiView selectView(@Param("ew") Wrapper<ChecixinxiEntity> wrapper);
	
}
