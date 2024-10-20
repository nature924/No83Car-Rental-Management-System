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


import com.dao.ZuchedingdanDao;
import com.entity.ZuchedingdanEntity;
import com.service.ZuchedingdanService;
import com.entity.vo.ZuchedingdanVO;
import com.entity.view.ZuchedingdanView;

@Service("zuchedingdanService")
public class ZuchedingdanServiceImpl extends ServiceImpl<ZuchedingdanDao, ZuchedingdanEntity> implements ZuchedingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuchedingdanEntity> page = this.selectPage(
                new Query<ZuchedingdanEntity>(params).getPage(),
                new EntityWrapper<ZuchedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuchedingdanEntity> wrapper) {
		  Page<ZuchedingdanView> page =new Query<ZuchedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuchedingdanVO> selectListVO(Wrapper<ZuchedingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuchedingdanVO selectVO(Wrapper<ZuchedingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuchedingdanView> selectListView(Wrapper<ZuchedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuchedingdanView selectView(Wrapper<ZuchedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
