package com.entity.model;

import com.entity.CaiwubaoxiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 财务报销
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class CaiwubaoxiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 财务报销编号
     */
    private String caiwubaoxiaoUuidNumber;


    /**
     * 财务报销名称
     */
    private String caiwubaoxiaoName;


    /**
     * 发票图片
     */
    private String caiwubaoxiaoPhoto;


    /**
     * 财务报销类型
     */
    private Integer caiwubaoxiaoTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 财务报销内容
     */
    private String caiwubaoxiaoContent;


    /**
     * 财务报销状态
     */
    private Integer caiwubaoxiaoYesnoTypes;


    /**
     * 审核理由
     */
    private String caiwubaoxiaoYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date caiwubaoxiaoShenheTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：员工
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：财务报销编号
	 */
    public String getCaiwubaoxiaoUuidNumber() {
        return caiwubaoxiaoUuidNumber;
    }


    /**
	 * 设置：财务报销编号
	 */
    public void setCaiwubaoxiaoUuidNumber(String caiwubaoxiaoUuidNumber) {
        this.caiwubaoxiaoUuidNumber = caiwubaoxiaoUuidNumber;
    }
    /**
	 * 获取：财务报销名称
	 */
    public String getCaiwubaoxiaoName() {
        return caiwubaoxiaoName;
    }


    /**
	 * 设置：财务报销名称
	 */
    public void setCaiwubaoxiaoName(String caiwubaoxiaoName) {
        this.caiwubaoxiaoName = caiwubaoxiaoName;
    }
    /**
	 * 获取：发票图片
	 */
    public String getCaiwubaoxiaoPhoto() {
        return caiwubaoxiaoPhoto;
    }


    /**
	 * 设置：发票图片
	 */
    public void setCaiwubaoxiaoPhoto(String caiwubaoxiaoPhoto) {
        this.caiwubaoxiaoPhoto = caiwubaoxiaoPhoto;
    }
    /**
	 * 获取：财务报销类型
	 */
    public Integer getCaiwubaoxiaoTypes() {
        return caiwubaoxiaoTypes;
    }


    /**
	 * 设置：财务报销类型
	 */
    public void setCaiwubaoxiaoTypes(Integer caiwubaoxiaoTypes) {
        this.caiwubaoxiaoTypes = caiwubaoxiaoTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：财务报销内容
	 */
    public String getCaiwubaoxiaoContent() {
        return caiwubaoxiaoContent;
    }


    /**
	 * 设置：财务报销内容
	 */
    public void setCaiwubaoxiaoContent(String caiwubaoxiaoContent) {
        this.caiwubaoxiaoContent = caiwubaoxiaoContent;
    }
    /**
	 * 获取：财务报销状态
	 */
    public Integer getCaiwubaoxiaoYesnoTypes() {
        return caiwubaoxiaoYesnoTypes;
    }


    /**
	 * 设置：财务报销状态
	 */
    public void setCaiwubaoxiaoYesnoTypes(Integer caiwubaoxiaoYesnoTypes) {
        this.caiwubaoxiaoYesnoTypes = caiwubaoxiaoYesnoTypes;
    }
    /**
	 * 获取：审核理由
	 */
    public String getCaiwubaoxiaoYesnoText() {
        return caiwubaoxiaoYesnoText;
    }


    /**
	 * 设置：审核理由
	 */
    public void setCaiwubaoxiaoYesnoText(String caiwubaoxiaoYesnoText) {
        this.caiwubaoxiaoYesnoText = caiwubaoxiaoYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getCaiwubaoxiaoShenheTime() {
        return caiwubaoxiaoShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setCaiwubaoxiaoShenheTime(Date caiwubaoxiaoShenheTime) {
        this.caiwubaoxiaoShenheTime = caiwubaoxiaoShenheTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
