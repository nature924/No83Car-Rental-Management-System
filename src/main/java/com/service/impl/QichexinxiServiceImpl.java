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


import com.dao.QichexinxiDao;
import com.entity.QichexinxiEntity;
import com.service.QichexinxiService;
import com.entity.vo.QichexinxiVO;
import com.entity.view.QichexinxiView;

@Service("qichexinxiService")
public class QichexinxiServiceImpl extends ServiceImpl<QichexinxiDao, QichexinxiEntity> implements QichexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichexinxiEntity> page = this.selectPage(
                new Query<QichexinxiEntity>(params).getPage(),
                new EntityWrapper<QichexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichexinxiEntity> wrapper) {
		  Page<QichexinxiView> page =new Query<QichexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichexinxiVO> selectListVO(Wrapper<QichexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichexinxiVO selectVO(Wrapper<QichexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichexinxiView> selectListView(Wrapper<QichexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichexinxiView selectView(Wrapper<QichexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
