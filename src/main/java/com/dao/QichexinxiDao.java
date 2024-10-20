package com.dao;

import com.entity.QichexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichexinxiVO;
import com.entity.view.QichexinxiView;


/**
 * 汽车信息
 * 
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface QichexinxiDao extends BaseMapper<QichexinxiEntity> {
	
	List<QichexinxiVO> selectListVO(@Param("ew") Wrapper<QichexinxiEntity> wrapper);
	
	QichexinxiVO selectVO(@Param("ew") Wrapper<QichexinxiEntity> wrapper);
	
	List<QichexinxiView> selectListView(@Param("ew") Wrapper<QichexinxiEntity> wrapper);

	List<QichexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QichexinxiEntity> wrapper);
	
	QichexinxiView selectView(@Param("ew") Wrapper<QichexinxiEntity> wrapper);
	

}
