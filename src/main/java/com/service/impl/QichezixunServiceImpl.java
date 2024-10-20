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


import com.dao.QichezixunDao;
import com.entity.QichezixunEntity;
import com.service.QichezixunService;
import com.entity.vo.QichezixunVO;
import com.entity.view.QichezixunView;

@Service("qichezixunService")
public class QichezixunServiceImpl extends ServiceImpl<QichezixunDao, QichezixunEntity> implements QichezixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QichezixunEntity> page = this.selectPage(
                new Query<QichezixunEntity>(params).getPage(),
                new EntityWrapper<QichezixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QichezixunEntity> wrapper) {
		  Page<QichezixunView> page =new Query<QichezixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QichezixunVO> selectListVO(Wrapper<QichezixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QichezixunVO selectVO(Wrapper<QichezixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QichezixunView> selectListView(Wrapper<QichezixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QichezixunView selectView(Wrapper<QichezixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
