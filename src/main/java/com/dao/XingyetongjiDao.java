package com.dao;

import com.entity.XingyetongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XingyetongjiVO;
import com.entity.view.XingyetongjiView;


/**
 * 行业统计
 * 
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface XingyetongjiDao extends BaseMapper<XingyetongjiEntity> {
	
	List<XingyetongjiVO> selectListVO(@Param("ew") Wrapper<XingyetongjiEntity> wrapper);
	
	XingyetongjiVO selectVO(@Param("ew") Wrapper<XingyetongjiEntity> wrapper);
	
	List<XingyetongjiView> selectListView(@Param("ew") Wrapper<XingyetongjiEntity> wrapper);

	List<XingyetongjiView> selectListView(Pagination page,@Param("ew") Wrapper<XingyetongjiEntity> wrapper);
	
	XingyetongjiView selectView(@Param("ew") Wrapper<XingyetongjiEntity> wrapper);
	
}
