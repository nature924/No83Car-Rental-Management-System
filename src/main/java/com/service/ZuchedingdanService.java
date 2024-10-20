package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuchedingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuchedingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuchedingdanView;


/**
 * 租车订单
 *
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface ZuchedingdanService extends IService<ZuchedingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuchedingdanVO> selectListVO(Wrapper<ZuchedingdanEntity> wrapper);
   	
   	ZuchedingdanVO selectVO(@Param("ew") Wrapper<ZuchedingdanEntity> wrapper);
   	
   	List<ZuchedingdanView> selectListView(Wrapper<ZuchedingdanEntity> wrapper);
   	
   	ZuchedingdanView selectView(@Param("ew") Wrapper<ZuchedingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuchedingdanEntity> wrapper);
   	

}

