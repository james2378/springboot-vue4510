package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuipiaodingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuipiaodingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuipiaodingdanView;


/**
 * 退票订单
 *
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface TuipiaodingdanService extends IService<TuipiaodingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuipiaodingdanVO> selectListVO(Wrapper<TuipiaodingdanEntity> wrapper);
   	
   	TuipiaodingdanVO selectVO(@Param("ew") Wrapper<TuipiaodingdanEntity> wrapper);
   	
   	List<TuipiaodingdanView> selectListView(Wrapper<TuipiaodingdanEntity> wrapper);
   	
   	TuipiaodingdanView selectView(@Param("ew") Wrapper<TuipiaodingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuipiaodingdanEntity> wrapper);
   	
}

