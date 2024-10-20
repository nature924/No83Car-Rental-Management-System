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


import com.dao.HaichexinxiDao;
import com.entity.HaichexinxiEntity;
import com.service.HaichexinxiService;
import com.entity.vo.HaichexinxiVO;
import com.entity.view.HaichexinxiView;

@Service("haichexinxiService")
public class HaichexinxiServiceImpl extends ServiceImpl<HaichexinxiDao, HaichexinxiEntity> implements HaichexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaichexinxiEntity> page = this.selectPage(
                new Query<HaichexinxiEntity>(params).getPage(),
                new EntityWrapper<HaichexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaichexinxiEntity> wrapper) {
		  Page<HaichexinxiView> page =new Query<HaichexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaichexinxiVO> selectListVO(Wrapper<HaichexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaichexinxiVO selectVO(Wrapper<HaichexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaichexinxiView> selectListView(Wrapper<HaichexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaichexinxiView selectView(Wrapper<HaichexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
