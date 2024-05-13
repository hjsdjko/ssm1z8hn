package com.entity.view;

import com.entity.XingyetongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 行业统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
@TableName("xingyetongji")
public class XingyetongjiView  extends XingyetongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XingyetongjiView(){
	}
 
 	public XingyetongjiView(XingyetongjiEntity xingyetongjiEntity){
 	try {
			BeanUtils.copyProperties(this, xingyetongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
