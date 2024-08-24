package com.cl.entity.view;

import com.cl.entity.ChayuejianliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 查阅简历
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-27 14:18:23
 */
@TableName("chayuejianli")
public class ChayuejianliView  extends ChayuejianliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChayuejianliView(){
	}
 
 	public ChayuejianliView(ChayuejianliEntity chayuejianliEntity){
 	try {
			BeanUtils.copyProperties(this, chayuejianliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
