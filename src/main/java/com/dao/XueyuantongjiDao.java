package com.dao;

import com.entity.XueyuantongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuantongjiVO;
import com.entity.view.XueyuantongjiView;


/**
 * 学院统计
 * 
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface XueyuantongjiDao extends BaseMapper<XueyuantongjiEntity> {
	
	List<XueyuantongjiVO> selectListVO(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
	
	XueyuantongjiVO selectVO(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
	
	List<XueyuantongjiView> selectListView(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);

	List<XueyuantongjiView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
	
	XueyuantongjiView selectView(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
	
}
