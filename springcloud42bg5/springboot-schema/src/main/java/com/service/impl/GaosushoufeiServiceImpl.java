package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GaosushoufeiDao;
import com.entity.GaosushoufeiEntity;
import com.service.GaosushoufeiService;
import com.entity.vo.GaosushoufeiVO;
import com.entity.view.GaosushoufeiView;

@Service("gaosushoufeiService")
public class GaosushoufeiServiceImpl extends ServiceImpl<GaosushoufeiDao, GaosushoufeiEntity> implements GaosushoufeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GaosushoufeiEntity> page = this.selectPage(
                new Query<GaosushoufeiEntity>(params).getPage(),
                new EntityWrapper<GaosushoufeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GaosushoufeiEntity> wrapper) {
		  Page<GaosushoufeiView> page =new Query<GaosushoufeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GaosushoufeiVO> selectListVO(Wrapper<GaosushoufeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GaosushoufeiVO selectVO(Wrapper<GaosushoufeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GaosushoufeiView> selectListView(Wrapper<GaosushoufeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GaosushoufeiView selectView(Wrapper<GaosushoufeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
