package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuanyetongjiEntity;
import com.entity.view.ZhuanyetongjiView;

import com.service.ZhuanyetongjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 专业统计
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-14 16:14:50
 */
@RestController
@RequestMapping("/zhuanyetongji")
public class ZhuanyetongjiController {
    @Autowired
    private ZhuanyetongjiService zhuanyetongjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuanyetongjiEntity zhuanyetongji, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			zhuanyetongji.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanyetongjiEntity> ew = new EntityWrapper<ZhuanyetongjiEntity>();
		PageUtils page = zhuanyetongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanyetongji), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuanyetongjiEntity zhuanyetongji, HttpServletRequest request){
        EntityWrapper<ZhuanyetongjiEntity> ew = new EntityWrapper<ZhuanyetongjiEntity>();
		PageUtils page = zhuanyetongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanyetongji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuanyetongjiEntity zhuanyetongji){
       	EntityWrapper<ZhuanyetongjiEntity> ew = new EntityWrapper<ZhuanyetongjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuanyetongji, "zhuanyetongji")); 
        return R.ok().put("data", zhuanyetongjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuanyetongjiEntity zhuanyetongji){
        EntityWrapper< ZhuanyetongjiEntity> ew = new EntityWrapper< ZhuanyetongjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuanyetongji, "zhuanyetongji")); 
		ZhuanyetongjiView zhuanyetongjiView =  zhuanyetongjiService.selectView(ew);
		return R.ok("查询专业统计成功").put("data", zhuanyetongjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuanyetongjiEntity zhuanyetongji = zhuanyetongjiService.selectById(id);
        return R.ok().put("data", zhuanyetongji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuanyetongjiEntity zhuanyetongji = zhuanyetongjiService.selectById(id);
        return R.ok().put("data", zhuanyetongji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuanyetongjiEntity zhuanyetongji, HttpServletRequest request){
    	zhuanyetongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanyetongji);

        zhuanyetongjiService.insert(zhuanyetongji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuanyetongjiEntity zhuanyetongji, HttpServletRequest request){
    	zhuanyetongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanyetongji);

        zhuanyetongjiService.insert(zhuanyetongji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuanyetongjiEntity zhuanyetongji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuanyetongji);
        zhuanyetongjiService.updateById(zhuanyetongji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuanyetongjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhuanyetongjiEntity> wrapper = new EntityWrapper<ZhuanyetongjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhuanyetongjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
