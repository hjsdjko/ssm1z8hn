package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XingyexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XingyexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XingyexinxiView;


/**
 * 行业信息
 *
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
public interface XingyexinxiService extends IService<XingyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XingyexinxiVO> selectListVO(Wrapper<XingyexinxiEntity> wrapper);
   	
   	XingyexinxiVO selectVO(@Param("ew") Wrapper<XingyexinxiEntity> wrapper);
   	
   	List<XingyexinxiView> selectListView(Wrapper<XingyexinxiEntity> wrapper);
   	
   	XingyexinxiView selectView(@Param("ew") Wrapper<XingyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XingyexinxiEntity> wrapper);
   	
}

