package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoupiaodingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoupiaodingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoupiaodingdanView;


/**
 * 购票订单
 *
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface GoupiaodingdanService extends IService<GoupiaodingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoupiaodingdanVO> selectListVO(Wrapper<GoupiaodingdanEntity> wrapper);
   	
   	GoupiaodingdanVO selectVO(@Param("ew") Wrapper<GoupiaodingdanEntity> wrapper);
   	
   	List<GoupiaodingdanView> selectListView(Wrapper<GoupiaodingdanEntity> wrapper);
   	
   	GoupiaodingdanView selectView(@Param("ew") Wrapper<GoupiaodingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoupiaodingdanEntity> wrapper);
   	
}

