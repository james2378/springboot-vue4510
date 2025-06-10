package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChexingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChexingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChexingxinxiView;


/**
 * 车型信息
 *
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface ChexingxinxiService extends IService<ChexingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChexingxinxiVO> selectListVO(Wrapper<ChexingxinxiEntity> wrapper);
   	
   	ChexingxinxiVO selectVO(@Param("ew") Wrapper<ChexingxinxiEntity> wrapper);
   	
   	List<ChexingxinxiView> selectListView(Wrapper<ChexingxinxiEntity> wrapper);
   	
   	ChexingxinxiView selectView(@Param("ew") Wrapper<ChexingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChexingxinxiEntity> wrapper);
   	
}

