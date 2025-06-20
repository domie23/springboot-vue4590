package com.dao;

import com.entity.ShiqiecheliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiqiecheliangVO;
import com.entity.view.ShiqiecheliangView;


/**
 * 失窃车辆
 * 
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
public interface ShiqiecheliangDao extends BaseMapper<ShiqiecheliangEntity> {
	
	List<ShiqiecheliangVO> selectListVO(@Param("ew") Wrapper<ShiqiecheliangEntity> wrapper);
	
	ShiqiecheliangVO selectVO(@Param("ew") Wrapper<ShiqiecheliangEntity> wrapper);
	
	List<ShiqiecheliangView> selectListView(@Param("ew") Wrapper<ShiqiecheliangEntity> wrapper);

	List<ShiqiecheliangView> selectListView(Pagination page,@Param("ew") Wrapper<ShiqiecheliangEntity> wrapper);
	
	ShiqiecheliangView selectView(@Param("ew") Wrapper<ShiqiecheliangEntity> wrapper);
	

}
