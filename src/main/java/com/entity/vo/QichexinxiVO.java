package com.entity.vo;

import com.entity.QichexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 汽车信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public class QichexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车辆型号
	 */
	
	private String cheliangxinghao;
		
	/**
	 * 汽车类别
	 */
	
	private String qicheleibie;
		
	/**
	 * 车辆品牌
	 */
	
	private String cheliangpinpai;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 换挡方式
	 */
	
	private String huandangfangshi;
		
	/**
	 * 车辆照片
	 */
	
	private String cheliangzhaopian;
		
	/**
	 * 座位数
	 */
	
	private Integer zuoweishu;
		
	/**
	 * 汽车排量
	 */
	
	private String qichepailiang;
		
	/**
	 * 汽车价格
	 */
	
	private Float qichejiage;
		
	/**
	 * 出厂年份
	 */
	
	private String chuchangnianfen;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 汽车简介
	 */
	
	private String qichejianjie;
		
	/**
	 * 管理账号
	 */
	
	private String guanlizhanghao;
		
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：车辆型号
	 */
	 
	public void setCheliangxinghao(String cheliangxinghao) {
		this.cheliangxinghao = cheliangxinghao;
	}
	
	/**
	 * 获取：车辆型号
	 */
	public String getCheliangxinghao() {
		return cheliangxinghao;
	}
				
	
	/**
	 * 设置：汽车类别
	 */
	 
	public void setQicheleibie(String qicheleibie) {
		this.qicheleibie = qicheleibie;
	}
	
	/**
	 * 获取：汽车类别
	 */
	public String getQicheleibie() {
		return qicheleibie;
	}
				
	
	/**
	 * 设置：车辆品牌
	 */
	 
	public void setCheliangpinpai(String cheliangpinpai) {
		this.cheliangpinpai = cheliangpinpai;
	}
	
	/**
	 * 获取：车辆品牌
	 */
	public String getCheliangpinpai() {
		return cheliangpinpai;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：颜色
	 */
	 
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：换挡方式
	 */
	 
	public void setHuandangfangshi(String huandangfangshi) {
		this.huandangfangshi = huandangfangshi;
	}
	
	/**
	 * 获取：换挡方式
	 */
	public String getHuandangfangshi() {
		return huandangfangshi;
	}
				
	
	/**
	 * 设置：车辆照片
	 */
	 
	public void setCheliangzhaopian(String cheliangzhaopian) {
		this.cheliangzhaopian = cheliangzhaopian;
	}
	
	/**
	 * 获取：车辆照片
	 */
	public String getCheliangzhaopian() {
		return cheliangzhaopian;
	}
				
	
	/**
	 * 设置：座位数
	 */
	 
	public void setZuoweishu(Integer zuoweishu) {
		this.zuoweishu = zuoweishu;
	}
	
	/**
	 * 获取：座位数
	 */
	public Integer getZuoweishu() {
		return zuoweishu;
	}
				
	
	/**
	 * 设置：汽车排量
	 */
	 
	public void setQichepailiang(String qichepailiang) {
		this.qichepailiang = qichepailiang;
	}
	
	/**
	 * 获取：汽车排量
	 */
	public String getQichepailiang() {
		return qichepailiang;
	}
				
	
	/**
	 * 设置：汽车价格
	 */
	 
	public void setQichejiage(Float qichejiage) {
		this.qichejiage = qichejiage;
	}
	
	/**
	 * 获取：汽车价格
	 */
	public Float getQichejiage() {
		return qichejiage;
	}
				
	
	/**
	 * 设置：出厂年份
	 */
	 
	public void setChuchangnianfen(String chuchangnianfen) {
		this.chuchangnianfen = chuchangnianfen;
	}
	
	/**
	 * 获取：出厂年份
	 */
	public String getChuchangnianfen() {
		return chuchangnianfen;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：汽车简介
	 */
	 
	public void setQichejianjie(String qichejianjie) {
		this.qichejianjie = qichejianjie;
	}
	
	/**
	 * 获取：汽车简介
	 */
	public String getQichejianjie() {
		return qichejianjie;
	}
				
	
	/**
	 * 设置：管理账号
	 */
	 
	public void setGuanlizhanghao(String guanlizhanghao) {
		this.guanlizhanghao = guanlizhanghao;
	}
	
	/**
	 * 获取：管理账号
	 */
	public String getGuanlizhanghao() {
		return guanlizhanghao;
	}
				
	
	/**
	 * 设置：管理姓名
	 */
	 
	public void setGuanlixingming(String guanlixingming) {
		this.guanlixingming = guanlixingming;
	}
	
	/**
	 * 获取：管理姓名
	 */
	public String getGuanlixingming() {
		return guanlixingming;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
