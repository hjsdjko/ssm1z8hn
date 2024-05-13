package com.entity.view;

import com.entity.XingyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 行业信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
@TableName("xingyexinxi")
public class XingyexinxiView  extends XingyexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XingyexinxiView(){
	}
 
 	public XingyexinxiView(XingyexinxiEntity xingyexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xingyexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
