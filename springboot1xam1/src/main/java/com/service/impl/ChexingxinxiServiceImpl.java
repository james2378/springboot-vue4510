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


import com.dao.ChexingxinxiDao;
import com.entity.ChexingxinxiEntity;
import com.service.ChexingxinxiService;
import com.entity.vo.ChexingxinxiVO;
import com.entity.view.ChexingxinxiView;

@Service("chexingxinxiService")
public class ChexingxinxiServiceImpl extends ServiceImpl<ChexingxinxiDao, ChexingxinxiEntity> implements ChexingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChexingxinxiEntity> page = this.selectPage(
                new Query<ChexingxinxiEntity>(params).getPage(),
                new EntityWrapper<ChexingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChexingxinxiEntity> wrapper) {
		  Page<ChexingxinxiView> page =new Query<ChexingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChexingxinxiVO> selectListVO(Wrapper<ChexingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChexingxinxiVO selectVO(Wrapper<ChexingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChexingxinxiView> selectListView(Wrapper<ChexingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChexingxinxiView selectView(Wrapper<ChexingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
