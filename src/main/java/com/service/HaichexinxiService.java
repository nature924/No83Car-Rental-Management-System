package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaichexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaichexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaichexinxiView;


/**
 * 还车信息
 *
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface HaichexinxiService extends IService<HaichexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaichexinxiVO> selectListVO(Wrapper<HaichexinxiEntity> wrapper);
   	
   	HaichexinxiVO selectVO(@Param("ew") Wrapper<HaichexinxiEntity> wrapper);
   	
   	List<HaichexinxiView> selectListView(Wrapper<HaichexinxiEntity> wrapper);
   	
   	HaichexinxiView selectView(@Param("ew") Wrapper<HaichexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaichexinxiEntity> wrapper);
   	

}

