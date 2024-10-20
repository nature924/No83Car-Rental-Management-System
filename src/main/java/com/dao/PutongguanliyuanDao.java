package com.dao;

import com.entity.PutongguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PutongguanliyuanVO;
import com.entity.view.PutongguanliyuanView;


/**
 * 普通管理员
 * 
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface PutongguanliyuanDao extends BaseMapper<PutongguanliyuanEntity> {
	
	List<PutongguanliyuanVO> selectListVO(@Param("ew") Wrapper<PutongguanliyuanEntity> wrapper);
	
	PutongguanliyuanVO selectVO(@Param("ew") Wrapper<PutongguanliyuanEntity> wrapper);
	
	List<PutongguanliyuanView> selectListView(@Param("ew") Wrapper<PutongguanliyuanEntity> wrapper);

	List<PutongguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<PutongguanliyuanEntity> wrapper);
	
	PutongguanliyuanView selectView(@Param("ew") Wrapper<PutongguanliyuanEntity> wrapper);
	

}
