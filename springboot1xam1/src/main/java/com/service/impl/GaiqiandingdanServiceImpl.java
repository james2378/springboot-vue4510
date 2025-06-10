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


import com.dao.GaiqiandingdanDao;
import com.entity.GaiqiandingdanEntity;
import com.service.GaiqiandingdanService;
import com.entity.vo.GaiqiandingdanVO;
import com.entity.view.GaiqiandingdanView;

@Service("gaiqiandingdanService")
public class GaiqiandingdanServiceImpl extends ServiceImpl<GaiqiandingdanDao, GaiqiandingdanEntity> implements GaiqiandingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GaiqiandingdanEntity> page = this.selectPage(
                new Query<GaiqiandingdanEntity>(params).getPage(),
                new EntityWrapper<GaiqiandingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GaiqiandingdanEntity> wrapper) {
		  Page<GaiqiandingdanView> page =new Query<GaiqiandingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GaiqiandingdanVO> selectListVO(Wrapper<GaiqiandingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GaiqiandingdanVO selectVO(Wrapper<GaiqiandingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GaiqiandingdanView> selectListView(Wrapper<GaiqiandingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GaiqiandingdanView selectView(Wrapper<GaiqiandingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
