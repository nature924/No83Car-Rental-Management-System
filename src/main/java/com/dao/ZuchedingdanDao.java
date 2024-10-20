package com.dao;

import com.entity.ZuchedingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuchedingdanVO;
import com.entity.view.ZuchedingdanView;


/**
 * 租车订单
 * 
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface ZuchedingdanDao extends BaseMapper<ZuchedingdanEntity> {
	
	List<ZuchedingdanVO> selectListVO(@Param("ew") Wrapper<ZuchedingdanEntity> wrapper);
	
	ZuchedingdanVO selectVO(@Param("ew") Wrapper<ZuchedingdanEntity> wrapper);
	
	List<ZuchedingdanView> selectListView(@Param("ew") Wrapper<ZuchedingdanEntity> wrapper);

	List<ZuchedingdanView> selectListView(Pagination page,@Param("ew") Wrapper<ZuchedingdanEntity> wrapper);
	
	ZuchedingdanView selectView(@Param("ew") Wrapper<ZuchedingdanEntity> wrapper);
	

}
