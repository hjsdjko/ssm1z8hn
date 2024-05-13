package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XingyetongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XingyetongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XingyetongjiView;


/**
 * 行业统计
 *
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface XingyetongjiService extends IService<XingyetongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingyetongjiVO> selectListVO(Wrapper<XingyetongjiEntity> wrapper);
   	
   	XingyetongjiVO selectVO(@Param("ew") Wrapper<XingyetongjiEntity> wrapper);
   	
   	List<XingyetongjiView> selectListView(Wrapper<XingyetongjiEntity> wrapper);
   	
   	XingyetongjiView selectView(@Param("ew") Wrapper<XingyetongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingyetongjiEntity> wrapper);
   	
}

