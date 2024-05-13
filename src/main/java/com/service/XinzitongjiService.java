package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinzitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinzitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinzitongjiView;


/**
 * 薪资统计
 *
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface XinzitongjiService extends IService<XinzitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinzitongjiVO> selectListVO(Wrapper<XinzitongjiEntity> wrapper);
   	
   	XinzitongjiVO selectVO(@Param("ew") Wrapper<XinzitongjiEntity> wrapper);
   	
   	List<XinzitongjiView> selectListView(Wrapper<XinzitongjiEntity> wrapper);
   	
   	XinzitongjiView selectView(@Param("ew") Wrapper<XinzitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinzitongjiEntity> wrapper);
   	
}

