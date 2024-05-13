package com.entity.view;

import com.entity.ChengshitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 城市统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
@TableName("chengshitongji")
public class ChengshitongjiView  extends ChengshitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChengshitongjiView(){
	}
 
 	public ChengshitongjiView(ChengshitongjiEntity chengshitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, chengshitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
