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


import com.dao.ZhuanyetongjiDao;
import com.entity.ZhuanyetongjiEntity;
import com.service.ZhuanyetongjiService;
import com.entity.vo.ZhuanyetongjiVO;
import com.entity.view.ZhuanyetongjiView;

@Service("zhuanyetongjiService")
public class ZhuanyetongjiServiceImpl extends ServiceImpl<ZhuanyetongjiDao, ZhuanyetongjiEntity> implements ZhuanyetongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanyetongjiEntity> page = this.selectPage(
                new Query<ZhuanyetongjiEntity>(params).getPage(),
                new EntityWrapper<ZhuanyetongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanyetongjiEntity> wrapper) {
		  Page<ZhuanyetongjiView> page =new Query<ZhuanyetongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanyetongjiVO> selectListVO(Wrapper<ZhuanyetongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanyetongjiVO selectVO(Wrapper<ZhuanyetongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanyetongjiView> selectListView(Wrapper<ZhuanyetongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanyetongjiView selectView(Wrapper<ZhuanyetongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
