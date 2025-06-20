package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangweizhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangweizhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangweizhangView;


/**
 * 车辆违章
 *
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
public interface CheliangweizhangService extends IService<CheliangweizhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangweizhangVO> selectListVO(Wrapper<CheliangweizhangEntity> wrapper);
   	
   	CheliangweizhangVO selectVO(@Param("ew") Wrapper<CheliangweizhangEntity> wrapper);
   	
   	List<CheliangweizhangView> selectListView(Wrapper<CheliangweizhangEntity> wrapper);
   	
   	CheliangweizhangView selectView(@Param("ew") Wrapper<CheliangweizhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangweizhangEntity> wrapper);
   	

}

