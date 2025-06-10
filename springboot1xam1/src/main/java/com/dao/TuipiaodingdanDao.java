package com.dao;

import com.entity.TuipiaodingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuipiaodingdanVO;
import com.entity.view.TuipiaodingdanView;


/**
 * 退票订单
 * 
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface TuipiaodingdanDao extends BaseMapper<TuipiaodingdanEntity> {
	
	List<TuipiaodingdanVO> selectListVO(@Param("ew") Wrapper<TuipiaodingdanEntity> wrapper);
	
	TuipiaodingdanVO selectVO(@Param("ew") Wrapper<TuipiaodingdanEntity> wrapper);
	
	List<TuipiaodingdanView> selectListView(@Param("ew") Wrapper<TuipiaodingdanEntity> wrapper);

	List<TuipiaodingdanView> selectListView(Pagination page,@Param("ew") Wrapper<TuipiaodingdanEntity> wrapper);
	
	TuipiaodingdanView selectView(@Param("ew") Wrapper<TuipiaodingdanEntity> wrapper);
	
}
