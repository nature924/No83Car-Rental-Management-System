package com.dao;

import com.entity.QicheleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QicheleibieVO;
import com.entity.view.QicheleibieView;


/**
 * 汽车类别
 * 
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface QicheleibieDao extends BaseMapper<QicheleibieEntity> {
	
	List<QicheleibieVO> selectListVO(@Param("ew") Wrapper<QicheleibieEntity> wrapper);
	
	QicheleibieVO selectVO(@Param("ew") Wrapper<QicheleibieEntity> wrapper);
	
	List<QicheleibieView> selectListView(@Param("ew") Wrapper<QicheleibieEntity> wrapper);

	List<QicheleibieView> selectListView(Pagination page,@Param("ew") Wrapper<QicheleibieEntity> wrapper);
	
	QicheleibieView selectView(@Param("ew") Wrapper<QicheleibieEntity> wrapper);
	

}
