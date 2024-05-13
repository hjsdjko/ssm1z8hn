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


import com.dao.XinzitongjiDao;
import com.entity.XinzitongjiEntity;
import com.service.XinzitongjiService;
import com.entity.vo.XinzitongjiVO;
import com.entity.view.XinzitongjiView;

@Service("xinzitongjiService")
public class XinzitongjiServiceImpl extends ServiceImpl<XinzitongjiDao, XinzitongjiEntity> implements XinzitongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinzitongjiEntity> page = this.selectPage(
                new Query<XinzitongjiEntity>(params).getPage(),
                new EntityWrapper<XinzitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinzitongjiEntity> wrapper) {
		  Page<XinzitongjiView> page =new Query<XinzitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinzitongjiVO> selectListVO(Wrapper<XinzitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinzitongjiVO selectVO(Wrapper<XinzitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinzitongjiView> selectListView(Wrapper<XinzitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinzitongjiView selectView(Wrapper<XinzitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
