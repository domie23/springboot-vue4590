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


import com.dao.CheliangweizhangDao;
import com.entity.CheliangweizhangEntity;
import com.service.CheliangweizhangService;
import com.entity.vo.CheliangweizhangVO;
import com.entity.view.CheliangweizhangView;

@Service("cheliangweizhangService")
public class CheliangweizhangServiceImpl extends ServiceImpl<CheliangweizhangDao, CheliangweizhangEntity> implements CheliangweizhangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangweizhangEntity> page = this.selectPage(
                new Query<CheliangweizhangEntity>(params).getPage(),
                new EntityWrapper<CheliangweizhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangweizhangEntity> wrapper) {
		  Page<CheliangweizhangView> page =new Query<CheliangweizhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangweizhangVO> selectListVO(Wrapper<CheliangweizhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangweizhangVO selectVO(Wrapper<CheliangweizhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangweizhangView> selectListView(Wrapper<CheliangweizhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangweizhangView selectView(Wrapper<CheliangweizhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
