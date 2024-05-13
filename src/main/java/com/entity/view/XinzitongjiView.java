package com.entity.view;

import com.entity.XinzitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 薪资统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
@TableName("xinzitongji")
public class XinzitongjiView  extends XinzitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinzitongjiView(){
	}
 
 	public XinzitongjiView(XinzitongjiEntity xinzitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, xinzitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
