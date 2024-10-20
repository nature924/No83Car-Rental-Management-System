package com.entity.vo;

import com.entity.QuxiaodingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 取消订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 18:33:34
 */
public class QuxiaodingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 车辆品牌
	 */
	
	private String cheliangpinpai;
		
	/**
	 * 汽车类别
	 */
	
	private String qicheleibie;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 租期
	 */
	
	private Integer zuqi;
		
	/**
	 * 总价
	 */
	
	private Float zongjia;
		
	/**
	 * 取消日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date quxiaoriqi;
		
	/**
	 * 取消原因
	 */
	
	private String quxiaoyuanyin;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 管理账号
	 */
	
	private String guanlizhanghao;
		
	/**
	 * 管理姓名
	 */
	
	private String guanlixingming;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
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
	 * 设置：租期
	 */
	 
	public void setZuqi(Integer zuqi) {
		this.zuqi = zuqi;
	}
	
	/**
	 * 获取：租期
	 */
	public Integer getZuqi() {
		return zuqi;
	}
				
	
	/**
	 * 设置：总价
	 */
	 
	public void setZongjia(Float zongjia) {
		this.zongjia = zongjia;
	}
	
	/**
	 * 获取：总价
	 */
	public Float getZongjia() {
		return zongjia;
	}
				
	
	/**
	 * 设置：取消日期
	 */
	 
	public void setQuxiaoriqi(Date quxiaoriqi) {
		this.quxiaoriqi = quxiaoriqi;
	}
	
	/**
	 * 获取：取消日期
	 */
	public Date getQuxiaoriqi() {
		return quxiaoriqi;
	}
				
	
	/**
	 * 设置：取消原因
	 */
	 
	public void setQuxiaoyuanyin(String quxiaoyuanyin) {
		this.quxiaoyuanyin = quxiaoyuanyin;
	}
	
	/**
	 * 获取：取消原因
	 */
	public String getQuxiaoyuanyin() {
		return quxiaoyuanyin;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
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
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
