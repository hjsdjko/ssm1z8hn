package com.dao;

import com.entity.XinzitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinzitongjiVO;
import com.entity.view.XinzitongjiView;


/**
 * 薪资统计
 * 
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface XinzitongjiDao extends BaseMapper<XinzitongjiEntity> {
	
	List<XinzitongjiVO> selectListVO(@Param("ew") Wrapper<XinzitongjiEntity> wrapper);
	
	XinzitongjiVO selectVO(@Param("ew") Wrapper<XinzitongjiEntity> wrapper);
	
	List<XinzitongjiView> selectListView(@Param("ew") Wrapper<XinzitongjiEntity> wrapper);

	List<XinzitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<XinzitongjiEntity> wrapper);
	
	XinzitongjiView selectView(@Param("ew") Wrapper<XinzitongjiEntity> wrapper);
	
}
