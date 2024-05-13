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


import com.dao.XingyexinxiDao;
import com.entity.XingyexinxiEntity;
import com.service.XingyexinxiService;
import com.entity.vo.XingyexinxiVO;
import com.entity.view.XingyexinxiView;

@Service("xingyexinxiService")
public class XingyexinxiServiceImpl extends ServiceImpl<XingyexinxiDao, XingyexinxiEntity> implements XingyexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingyexinxiEntity> page = this.selectPage(
                new Query<XingyexinxiEntity>(params).getPage(),
                new EntityWrapper<XingyexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingyexinxiEntity> wrapper) {
		  Page<XingyexinxiView> page =new Query<XingyexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XingyexinxiVO> selectListVO(Wrapper<XingyexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XingyexinxiVO selectVO(Wrapper<XingyexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XingyexinxiView> selectListView(Wrapper<XingyexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingyexinxiView selectView(Wrapper<XingyexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
