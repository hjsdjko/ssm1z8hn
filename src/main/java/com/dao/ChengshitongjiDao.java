package com.dao;

import com.entity.ChengshitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengshitongjiVO;
import com.entity.view.ChengshitongjiView;


/**
 * 城市统计
 * 
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface ChengshitongjiDao extends BaseMapper<ChengshitongjiEntity> {
	
	List<ChengshitongjiVO> selectListVO(@Param("ew") Wrapper<ChengshitongjiEntity> wrapper);
	
	ChengshitongjiVO selectVO(@Param("ew") Wrapper<ChengshitongjiEntity> wrapper);
	
	List<ChengshitongjiView> selectListView(@Param("ew") Wrapper<ChengshitongjiEntity> wrapper);

	List<ChengshitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengshitongjiEntity> wrapper);
	
	ChengshitongjiView selectView(@Param("ew") Wrapper<ChengshitongjiEntity> wrapper);
	
}
