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


import com.dao.TuipiaodingdanDao;
import com.entity.TuipiaodingdanEntity;
import com.service.TuipiaodingdanService;
import com.entity.vo.TuipiaodingdanVO;
import com.entity.view.TuipiaodingdanView;

@Service("tuipiaodingdanService")
public class TuipiaodingdanServiceImpl extends ServiceImpl<TuipiaodingdanDao, TuipiaodingdanEntity> implements TuipiaodingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuipiaodingdanEntity> page = this.selectPage(
                new Query<TuipiaodingdanEntity>(params).getPage(),
                new EntityWrapper<TuipiaodingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuipiaodingdanEntity> wrapper) {
		  Page<TuipiaodingdanView> page =new Query<TuipiaodingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuipiaodingdanVO> selectListVO(Wrapper<TuipiaodingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuipiaodingdanVO selectVO(Wrapper<TuipiaodingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuipiaodingdanView> selectListView(Wrapper<TuipiaodingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuipiaodingdanView selectView(Wrapper<TuipiaodingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
