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


import com.dao.QicheleibieDao;
import com.entity.QicheleibieEntity;
import com.service.QicheleibieService;
import com.entity.vo.QicheleibieVO;
import com.entity.view.QicheleibieView;

@Service("qicheleibieService")
public class QicheleibieServiceImpl extends ServiceImpl<QicheleibieDao, QicheleibieEntity> implements QicheleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QicheleibieEntity> page = this.selectPage(
                new Query<QicheleibieEntity>(params).getPage(),
                new EntityWrapper<QicheleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QicheleibieEntity> wrapper) {
		  Page<QicheleibieView> page =new Query<QicheleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QicheleibieVO> selectListVO(Wrapper<QicheleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QicheleibieVO selectVO(Wrapper<QicheleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QicheleibieView> selectListView(Wrapper<QicheleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QicheleibieView selectView(Wrapper<QicheleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
