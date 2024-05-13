package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengshitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengshitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengshitongjiView;


/**
 * 城市统计
 *
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface ChengshitongjiService extends IService<ChengshitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengshitongjiVO> selectListVO(Wrapper<ChengshitongjiEntity> wrapper);
   	
   	ChengshitongjiVO selectVO(@Param("ew") Wrapper<ChengshitongjiEntity> wrapper);
   	
   	List<ChengshitongjiView> selectListView(Wrapper<ChengshitongjiEntity> wrapper);
   	
   	ChengshitongjiView selectView(@Param("ew") Wrapper<ChengshitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengshitongjiEntity> wrapper);
   	
}

