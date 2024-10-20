package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QicheleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QicheleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QicheleibieView;


/**
 * 汽车类别
 *
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface QicheleibieService extends IService<QicheleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QicheleibieVO> selectListVO(Wrapper<QicheleibieEntity> wrapper);
   	
   	QicheleibieVO selectVO(@Param("ew") Wrapper<QicheleibieEntity> wrapper);
   	
   	List<QicheleibieView> selectListView(Wrapper<QicheleibieEntity> wrapper);
   	
   	QicheleibieView selectView(@Param("ew") Wrapper<QicheleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QicheleibieEntity> wrapper);
   	

}

