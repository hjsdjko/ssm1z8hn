package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuantongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueyuantongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueyuantongjiView;


/**
 * 学院统计
 *
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface XueyuantongjiService extends IService<XueyuantongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueyuantongjiVO> selectListVO(Wrapper<XueyuantongjiEntity> wrapper);
   	
   	XueyuantongjiVO selectVO(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
   	
   	List<XueyuantongjiView> selectListView(Wrapper<XueyuantongjiEntity> wrapper);
   	
   	XueyuantongjiView selectView(@Param("ew") Wrapper<XueyuantongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueyuantongjiEntity> wrapper);
   	
}

