package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanyetongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanyetongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyetongjiView;


/**
 * 专业统计
 *
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface ZhuanyetongjiService extends IService<ZhuanyetongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanyetongjiVO> selectListVO(Wrapper<ZhuanyetongjiEntity> wrapper);
   	
   	ZhuanyetongjiVO selectVO(@Param("ew") Wrapper<ZhuanyetongjiEntity> wrapper);
   	
   	List<ZhuanyetongjiView> selectListView(Wrapper<ZhuanyetongjiEntity> wrapper);
   	
   	ZhuanyetongjiView selectView(@Param("ew") Wrapper<ZhuanyetongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanyetongjiEntity> wrapper);
   	
}

