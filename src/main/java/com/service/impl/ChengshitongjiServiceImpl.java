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


import com.dao.ChengshitongjiDao;
import com.entity.ChengshitongjiEntity;
import com.service.ChengshitongjiService;
import com.entity.vo.ChengshitongjiVO;
import com.entity.view.ChengshitongjiView;

@Service("chengshitongjiService")
public class ChengshitongjiServiceImpl extends ServiceImpl<ChengshitongjiDao, ChengshitongjiEntity> implements ChengshitongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengshitongjiEntity> page = this.selectPage(
                new Query<ChengshitongjiEntity>(params).getPage(),
                new EntityWrapper<ChengshitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengshitongjiEntity> wrapper) {
		  Page<ChengshitongjiView> page =new Query<ChengshitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengshitongjiVO> selectListVO(Wrapper<ChengshitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengshitongjiVO selectVO(Wrapper<ChengshitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengshitongjiView> selectListView(Wrapper<ChengshitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengshitongjiView selectView(Wrapper<ChengshitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
