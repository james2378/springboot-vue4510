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


import com.dao.GoupiaodingdanDao;
import com.entity.GoupiaodingdanEntity;
import com.service.GoupiaodingdanService;
import com.entity.vo.GoupiaodingdanVO;
import com.entity.view.GoupiaodingdanView;

@Service("goupiaodingdanService")
public class GoupiaodingdanServiceImpl extends ServiceImpl<GoupiaodingdanDao, GoupiaodingdanEntity> implements GoupiaodingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoupiaodingdanEntity> page = this.selectPage(
                new Query<GoupiaodingdanEntity>(params).getPage(),
                new EntityWrapper<GoupiaodingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoupiaodingdanEntity> wrapper) {
		  Page<GoupiaodingdanView> page =new Query<GoupiaodingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoupiaodingdanVO> selectListVO(Wrapper<GoupiaodingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoupiaodingdanVO selectVO(Wrapper<GoupiaodingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoupiaodingdanView> selectListView(Wrapper<GoupiaodingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoupiaodingdanView selectView(Wrapper<GoupiaodingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
