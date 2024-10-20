package com.dao;

import com.entity.HaichexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaichexinxiVO;
import com.entity.view.HaichexinxiView;


/**
 * 还车信息
 * 
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface HaichexinxiDao extends BaseMapper<HaichexinxiEntity> {
	
	List<HaichexinxiVO> selectListVO(@Param("ew") Wrapper<HaichexinxiEntity> wrapper);
	
	HaichexinxiVO selectVO(@Param("ew") Wrapper<HaichexinxiEntity> wrapper);
	
	List<HaichexinxiView> selectListView(@Param("ew") Wrapper<HaichexinxiEntity> wrapper);

	List<HaichexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HaichexinxiEntity> wrapper);
	
	HaichexinxiView selectView(@Param("ew") Wrapper<HaichexinxiEntity> wrapper);
	

}
