package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QichezixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QichezixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QichezixunView;


/**
 * 汽车资讯
 *
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public interface QichezixunService extends IService<QichezixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QichezixunVO> selectListVO(Wrapper<QichezixunEntity> wrapper);
   	
   	QichezixunVO selectVO(@Param("ew") Wrapper<QichezixunEntity> wrapper);
   	
   	List<QichezixunView> selectListView(Wrapper<QichezixunEntity> wrapper);
   	
   	QichezixunView selectView(@Param("ew") Wrapper<QichezixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QichezixunEntity> wrapper);
   	

}

