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


import com.dao.XingyetongjiDao;
import com.entity.XingyetongjiEntity;
import com.service.XingyetongjiService;
import com.entity.vo.XingyetongjiVO;
import com.entity.view.XingyetongjiView;

@Service("xingyetongjiService")
public class XingyetongjiServiceImpl extends ServiceImpl<XingyetongjiDao, XingyetongjiEntity> implements XingyetongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XingyetongjiEntity> page = this.selectPage(
                new Query<XingyetongjiEntity>(params).getPage(),
                new EntityWrapper<XingyetongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XingyetongjiEntity> wrapper) {
		  Page<XingyetongjiView> page =new Query<XingyetongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XingyetongjiVO> selectListVO(Wrapper<XingyetongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XingyetongjiVO selectVO(Wrapper<XingyetongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XingyetongjiView> selectListView(Wrapper<XingyetongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XingyetongjiView selectView(Wrapper<XingyetongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
