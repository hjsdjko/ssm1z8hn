package com.dao;

import com.entity.XingyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingyexinxiVO;
import com.entity.view.XingyexinxiView;


/**
 * 行业信息
 * 
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface XingyexinxiDao extends BaseMapper<XingyexinxiEntity> {
	
	List<XingyexinxiVO> selectListVO(@Param("ew") Wrapper<XingyexinxiEntity> wrapper);
	
	XingyexinxiVO selectVO(@Param("ew") Wrapper<XingyexinxiEntity> wrapper);
	
	List<XingyexinxiView> selectListView(@Param("ew") Wrapper<XingyexinxiEntity> wrapper);

	List<XingyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XingyexinxiEntity> wrapper);
	
	XingyexinxiView selectView(@Param("ew") Wrapper<XingyexinxiEntity> wrapper);
	
}
