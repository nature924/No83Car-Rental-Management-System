package com.dao;

import com.entity.QichezixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QichezixunVO;
import com.entity.view.QichezixunView;


/**
 * 汽车资讯
 * 
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface QichezixunDao extends BaseMapper<QichezixunEntity> {
	
	List<QichezixunVO> selectListVO(@Param("ew") Wrapper<QichezixunEntity> wrapper);
	
	QichezixunVO selectVO(@Param("ew") Wrapper<QichezixunEntity> wrapper);
	
	List<QichezixunView> selectListView(@Param("ew") Wrapper<QichezixunEntity> wrapper);

	List<QichezixunView> selectListView(Pagination page,@Param("ew") Wrapper<QichezixunEntity> wrapper);
	
	QichezixunView selectView(@Param("ew") Wrapper<QichezixunEntity> wrapper);
	

}
