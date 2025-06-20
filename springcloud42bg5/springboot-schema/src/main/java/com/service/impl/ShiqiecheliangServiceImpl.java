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


import com.dao.ShiqiecheliangDao;
import com.entity.ShiqiecheliangEntity;
import com.service.ShiqiecheliangService;
import com.entity.vo.ShiqiecheliangVO;
import com.entity.view.ShiqiecheliangView;

@Service("shiqiecheliangService")
public class ShiqiecheliangServiceImpl extends ServiceImpl<ShiqiecheliangDao, ShiqiecheliangEntity> implements ShiqiecheliangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiqiecheliangEntity> page = this.selectPage(
                new Query<ShiqiecheliangEntity>(params).getPage(),
                new EntityWrapper<ShiqiecheliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiqiecheliangEntity> wrapper) {
		  Page<ShiqiecheliangView> page =new Query<ShiqiecheliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiqiecheliangVO> selectListVO(Wrapper<ShiqiecheliangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiqiecheliangVO selectVO(Wrapper<ShiqiecheliangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiqiecheliangView> selectListView(Wrapper<ShiqiecheliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiqiecheliangView selectView(Wrapper<ShiqiecheliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
