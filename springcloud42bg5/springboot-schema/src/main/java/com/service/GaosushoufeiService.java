package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GaosushoufeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GaosushoufeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GaosushoufeiView;


/**
 * 高速收费
 *
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
public interface GaosushoufeiService extends IService<GaosushoufeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GaosushoufeiVO> selectListVO(Wrapper<GaosushoufeiEntity> wrapper);
   	
   	GaosushoufeiVO selectVO(@Param("ew") Wrapper<GaosushoufeiEntity> wrapper);
   	
   	List<GaosushoufeiView> selectListView(Wrapper<GaosushoufeiEntity> wrapper);
   	
   	GaosushoufeiView selectView(@Param("ew") Wrapper<GaosushoufeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GaosushoufeiEntity> wrapper);
   	

}

