package com.dao;

import com.entity.GoupiaodingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoupiaodingdanVO;
import com.entity.view.GoupiaodingdanView;


/**
 * 购票订单
 * 
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface GoupiaodingdanDao extends BaseMapper<GoupiaodingdanEntity> {
	
	List<GoupiaodingdanVO> selectListVO(@Param("ew") Wrapper<GoupiaodingdanEntity> wrapper);
	
	GoupiaodingdanVO selectVO(@Param("ew") Wrapper<GoupiaodingdanEntity> wrapper);
	
	List<GoupiaodingdanView> selectListView(@Param("ew") Wrapper<GoupiaodingdanEntity> wrapper);

	List<GoupiaodingdanView> selectListView(Pagination page,@Param("ew") Wrapper<GoupiaodingdanEntity> wrapper);
	
	GoupiaodingdanView selectView(@Param("ew") Wrapper<GoupiaodingdanEntity> wrapper);
	
}
