package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZuchedingdanEntity;
import com.entity.view.ZuchedingdanView;

import com.service.ZuchedingdanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 租车订单
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
@RestController
@RequestMapping("/zuchedingdan")
public class ZuchedingdanController {
    @Autowired
    private ZuchedingdanService zuchedingdanService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuchedingdanEntity zuchedingdan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zuchedingdan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("putongguanliyuan")) {
			zuchedingdan.setGuanlizhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuchedingdanEntity> ew = new EntityWrapper<ZuchedingdanEntity>();

		PageUtils page = zuchedingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuchedingdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuchedingdanEntity zuchedingdan, 
		HttpServletRequest request){
        EntityWrapper<ZuchedingdanEntity> ew = new EntityWrapper<ZuchedingdanEntity>();

		PageUtils page = zuchedingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuchedingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuchedingdanEntity zuchedingdan){
       	EntityWrapper<ZuchedingdanEntity> ew = new EntityWrapper<ZuchedingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuchedingdan, "zuchedingdan")); 
        return R.ok().put("data", zuchedingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuchedingdanEntity zuchedingdan){
        EntityWrapper< ZuchedingdanEntity> ew = new EntityWrapper< ZuchedingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuchedingdan, "zuchedingdan")); 
		ZuchedingdanView zuchedingdanView =  zuchedingdanService.selectView(ew);
		return R.ok("查询租车订单成功").put("data", zuchedingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuchedingdanEntity zuchedingdan = zuchedingdanService.selectById(id);
        return R.ok().put("data", zuchedingdan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuchedingdanEntity zuchedingdan = zuchedingdanService.selectById(id);
        return R.ok().put("data", zuchedingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuchedingdanEntity zuchedingdan, HttpServletRequest request){
    	zuchedingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuchedingdan);
        zuchedingdanService.insert(zuchedingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody ZuchedingdanEntity zuchedingdan, HttpServletRequest request){
    	zuchedingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuchedingdan);
        zuchedingdanService.insert(zuchedingdan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZuchedingdanEntity zuchedingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuchedingdan);
        zuchedingdanService.updateById(zuchedingdan);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuchedingdanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZuchedingdanEntity> wrapper = new EntityWrapper<ZuchedingdanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("putongguanliyuan")) {
			wrapper.eq("guanlizhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zuchedingdanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
