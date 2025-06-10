package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChecixinxiDao;
import com.entity.ChecixinxiEntity;
import com.service.ChecixinxiService;
import com.entity.vo.ChecixinxiVO;
import com.entity.view.ChecixinxiView;

@Service("checixinxiService")
public class ChecixinxiServiceImpl extends ServiceImpl<ChecixinxiDao, ChecixinxiEntity> implements ChecixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChecixinxiEntity> page = this.selectPage(
                new Query<ChecixinxiEntity>(params).getPage(),
                new EntityWrapper<ChecixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChecixinxiEntity> wrapper) {
		  Page<ChecixinxiView> page =new Query<ChecixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChecixinxiVO> selectListVO(Wrapper<ChecixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChecixinxiVO selectVO(Wrapper<ChecixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChecixinxiView> selectListView(Wrapper<ChecixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChecixinxiView selectView(Wrapper<ChecixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
