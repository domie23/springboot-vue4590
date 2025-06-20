package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiqiecheliangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiqiecheliangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiqiecheliangView;


/**
 * 失窃车辆
 *
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
public interface ShiqiecheliangService extends IService<ShiqiecheliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiqiecheliangVO> selectListVO(Wrapper<ShiqiecheliangEntity> wrapper);
   	
   	ShiqiecheliangVO selectVO(@Param("ew") Wrapper<ShiqiecheliangEntity> wrapper);
   	
   	List<ShiqiecheliangView> selectListView(Wrapper<ShiqiecheliangEntity> wrapper);
   	
   	ShiqiecheliangView selectView(@Param("ew") Wrapper<ShiqiecheliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiqiecheliangEntity> wrapper);
   	

}

