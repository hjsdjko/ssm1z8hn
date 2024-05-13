package com.dao;

import com.entity.ZhuanyetongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyetongjiVO;
import com.entity.view.ZhuanyetongjiView;


/**
 * 专业统计
 * 
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface ZhuanyetongjiDao extends BaseMapper<ZhuanyetongjiEntity> {
	
	List<ZhuanyetongjiVO> selectListVO(@Param("ew") Wrapper<ZhuanyetongjiEntity> wrapper);
	
	ZhuanyetongjiVO selectVO(@Param("ew") Wrapper<ZhuanyetongjiEntity> wrapper);
	
	List<ZhuanyetongjiView> selectListView(@Param("ew") Wrapper<ZhuanyetongjiEntity> wrapper);

	List<ZhuanyetongjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyetongjiEntity> wrapper);
	
	ZhuanyetongjiView selectView(@Param("ew") Wrapper<ZhuanyetongjiEntity> wrapper);
	
}
