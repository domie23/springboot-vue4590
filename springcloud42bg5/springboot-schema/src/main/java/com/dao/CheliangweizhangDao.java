package com.dao;

import com.entity.CheliangweizhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangweizhangVO;
import com.entity.view.CheliangweizhangView;


/**
 * 车辆违章
 * 
 * @author 
 * @email 
 * @date 2023-02-10 18:26:58
 */
public interface CheliangweizhangDao extends BaseMapper<CheliangweizhangEntity> {
	
	List<CheliangweizhangVO> selectListVO(@Param("ew") Wrapper<CheliangweizhangEntity> wrapper);
	
	CheliangweizhangVO selectVO(@Param("ew") Wrapper<CheliangweizhangEntity> wrapper);
	
	List<CheliangweizhangView> selectListView(@Param("ew") Wrapper<CheliangweizhangEntity> wrapper);

	List<CheliangweizhangView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangweizhangEntity> wrapper);
	
	CheliangweizhangView selectView(@Param("ew") Wrapper<CheliangweizhangEntity> wrapper);
	

}
