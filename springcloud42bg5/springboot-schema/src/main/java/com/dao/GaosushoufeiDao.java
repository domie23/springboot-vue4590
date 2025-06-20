package com.dao;

import com.entity.GaosushoufeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GaosushoufeiVO;
import com.entity.view.GaosushoufeiView;


/**
 * 高速收费
 * 
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
public interface GaosushoufeiDao extends BaseMapper<GaosushoufeiEntity> {
	
	List<GaosushoufeiVO> selectListVO(@Param("ew") Wrapper<GaosushoufeiEntity> wrapper);
	
	GaosushoufeiVO selectVO(@Param("ew") Wrapper<GaosushoufeiEntity> wrapper);
	
	List<GaosushoufeiView> selectListView(@Param("ew") Wrapper<GaosushoufeiEntity> wrapper);

	List<GaosushoufeiView> selectListView(Pagination page,@Param("ew") Wrapper<GaosushoufeiEntity> wrapper);
	
	GaosushoufeiView selectView(@Param("ew") Wrapper<GaosushoufeiEntity> wrapper);
	

}
