package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChecixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChecixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChecixinxiView;


/**
 * 车次信息
 *
 * @author 
 * @email 
 * @date 2021-02-27 11:45:54
 */
public interface ChecixinxiService extends IService<ChecixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChecixinxiVO> selectListVO(Wrapper<ChecixinxiEntity> wrapper);
   	
   	ChecixinxiVO selectVO(@Param("ew") Wrapper<ChecixinxiEntity> wrapper);
   	
   	List<ChecixinxiView> selectListView(Wrapper<ChecixinxiEntity> wrapper);
   	
   	ChecixinxiView selectView(@Param("ew") Wrapper<ChecixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChecixinxiEntity> wrapper);
   	
}

