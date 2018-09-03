package io.renren.modules.mer.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author chenkai
 * @email 13141325785@163.com.com
 * @date 2018-09-03 12:43:16
 */
@TableName("mer_cst_inf")
public class CstInfEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商户号(主键唯一)
	 */
	@TableId
	private String merCstNo;
	/**
	 * 商户名称
	 */
	private String merName;
	/**
	 * 商户编码
	 */
	private String merNo;
	/**
	 * 商户联系人姓名
	 */
	private String merLegalName;
	/**
	 * 商户证件号码
	 */
	private String merIdNumber;
	/**
	 * 商户联系人联系电话
	 */
	private String merPhone;
	/**
	 * 商户所在省,市
	 */
	private String merProviceCity;
	/**
	 * 商户详细地址
	 */
	private String merAddress;
	/**
	 * 商户备注
	 */
	private String merRemorkName;
	/**
	 * 商户联系人姓名
	 */
	private String merRemrk;
	/**
	 * 商户邮箱
	 */
	private String merContactEmail;
	/**
	 * 商户联系人手机号
	 */
	private String merContactPhone;
	/**
	 * 商户联系人QQ号
	 */
	private String merContactQq;
	/**
	 * 商户联系人微信号
	 */
	private String merContactWechat;
	/**
	 * 商户创建时间
	 */
	private Date merCreateTime;
	/**
	 * 商户最后修改时间
	 */
	private Date merModifyTime;

	/**
	 * 设置：商户号(主键唯一)
	 */
	public void setMerCstNo(String merCstNo) {
		this.merCstNo = merCstNo;
	}
	/**
	 * 获取：商户号(主键唯一)
	 */
	public String getMerCstNo() {
		return merCstNo;
	}
	/**
	 * 设置：商户名称
	 */
	public void setMerName(String merName) {
		this.merName = merName;
	}
	/**
	 * 获取：商户名称
	 */
	public String getMerName() {
		return merName;
	}
	/**
	 * 设置：商户编码
	 */
	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}
	/**
	 * 获取：商户编码
	 */
	public String getMerNo() {
		return merNo;
	}
	/**
	 * 设置：商户联系人姓名
	 */
	public void setMerLegalName(String merLegalName) {
		this.merLegalName = merLegalName;
	}
	/**
	 * 获取：商户联系人姓名
	 */
	public String getMerLegalName() {
		return merLegalName;
	}
	/**
	 * 设置：商户证件号码
	 */
	public void setMerIdNumber(String merIdNumber) {
		this.merIdNumber = merIdNumber;
	}
	/**
	 * 获取：商户证件号码
	 */
	public String getMerIdNumber() {
		return merIdNumber;
	}
	/**
	 * 设置：商户联系人联系电话
	 */
	public void setMerPhone(String merPhone) {
		this.merPhone = merPhone;
	}
	/**
	 * 获取：商户联系人联系电话
	 */
	public String getMerPhone() {
		return merPhone;
	}
	/**
	 * 设置：商户所在省,市
	 */
	public void setMerProviceCity(String merProviceCity) {
		this.merProviceCity = merProviceCity;
	}
	/**
	 * 获取：商户所在省,市
	 */
	public String getMerProviceCity() {
		return merProviceCity;
	}
	/**
	 * 设置：商户详细地址
	 */
	public void setMerAddress(String merAddress) {
		this.merAddress = merAddress;
	}
	/**
	 * 获取：商户详细地址
	 */
	public String getMerAddress() {
		return merAddress;
	}
	/**
	 * 设置：商户备注
	 */
	public void setMerRemorkName(String merRemorkName) {
		this.merRemorkName = merRemorkName;
	}
	/**
	 * 获取：商户备注
	 */
	public String getMerRemorkName() {
		return merRemorkName;
	}
	/**
	 * 设置：商户联系人姓名
	 */
	public void setMerRemrk(String merRemrk) {
		this.merRemrk = merRemrk;
	}
	/**
	 * 获取：商户联系人姓名
	 */
	public String getMerRemrk() {
		return merRemrk;
	}
	/**
	 * 设置：商户邮箱
	 */
	public void setMerContactEmail(String merContactEmail) {
		this.merContactEmail = merContactEmail;
	}
	/**
	 * 获取：商户邮箱
	 */
	public String getMerContactEmail() {
		return merContactEmail;
	}
	/**
	 * 设置：商户联系人手机号
	 */
	public void setMerContactPhone(String merContactPhone) {
		this.merContactPhone = merContactPhone;
	}
	/**
	 * 获取：商户联系人手机号
	 */
	public String getMerContactPhone() {
		return merContactPhone;
	}
	/**
	 * 设置：商户联系人QQ号
	 */
	public void setMerContactQq(String merContactQq) {
		this.merContactQq = merContactQq;
	}
	/**
	 * 获取：商户联系人QQ号
	 */
	public String getMerContactQq() {
		return merContactQq;
	}
	/**
	 * 设置：商户联系人微信号
	 */
	public void setMerContactWechat(String merContactWechat) {
		this.merContactWechat = merContactWechat;
	}
	/**
	 * 获取：商户联系人微信号
	 */
	public String getMerContactWechat() {
		return merContactWechat;
	}
	/**
	 * 设置：商户创建时间
	 */
	public void setMerCreateTime(Date merCreateTime) {
		this.merCreateTime = merCreateTime;
	}
	/**
	 * 获取：商户创建时间
	 */
	public Date getMerCreateTime() {
		return merCreateTime;
	}
	/**
	 * 设置：商户最后修改时间
	 */
	public void setMerModifyTime(Date merModifyTime) {
		this.merModifyTime = merModifyTime;
	}
	/**
	 * 获取：商户最后修改时间
	 */
	public Date getMerModifyTime() {
		return merModifyTime;
	}
}
