package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GaiqiandingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GaiqiandingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GaiqiandingdanView;


/**
 * 改签订单
 *
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface GaiqiandingdanService extends IService<GaiqiandingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GaiqiandingdanVO> selectListVO(Wrapper<GaiqiandingdanEntity> wrapper);
   	
   	GaiqiandingdanVO selectVO(@Param("ew") Wrapper<GaiqiandingdanEntity> wrapper);
   	
   	List<GaiqiandingdanView> selectListView(Wrapper<GaiqiandingdanEntity> wrapper);
   	
   	GaiqiandingdanView selectView(@Param("ew") Wrapper<GaiqiandingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GaiqiandingdanEntity> wrapper);
   	
}

