package com.entity.model;

import com.entity.QingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 请假
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QingjiaModel implements Serializable {
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
     * 请假编号
     */
    private String qingjiaUuidNumber;


    /**
     * 请假名称
     */
    private String qingjiaName;


    /**
     * 请假类型
     */
    private Integer qingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 请假开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qingjiaKaishiTime;


    /**
     * 请假结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qingjiaJieshuTime;


    /**
     * 请假内容
     */
    private String qingjiaContent;


    /**
     * 请假状态
     */
    private Integer qingjiaYesnoTypes;


    /**
     * 审核理由
     */
    private String qingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qingjiaShenheTime;


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
	 * 获取：请假编号
	 */
    public String getQingjiaUuidNumber() {
        return qingjiaUuidNumber;
    }


    /**
	 * 设置：请假编号
	 */
    public void setQingjiaUuidNumber(String qingjiaUuidNumber) {
        this.qingjiaUuidNumber = qingjiaUuidNumber;
    }
    /**
	 * 获取：请假名称
	 */
    public String getQingjiaName() {
        return qingjiaName;
    }


    /**
	 * 设置：请假名称
	 */
    public void setQingjiaName(String qingjiaName) {
        this.qingjiaName = qingjiaName;
    }
    /**
	 * 获取：请假类型
	 */
    public Integer getQingjiaTypes() {
        return qingjiaTypes;
    }


    /**
	 * 设置：请假类型
	 */
    public void setQingjiaTypes(Integer qingjiaTypes) {
        this.qingjiaTypes = qingjiaTypes;
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
	 * 获取：请假开始时间
	 */
    public Date getQingjiaKaishiTime() {
        return qingjiaKaishiTime;
    }


    /**
	 * 设置：请假开始时间
	 */
    public void setQingjiaKaishiTime(Date qingjiaKaishiTime) {
        this.qingjiaKaishiTime = qingjiaKaishiTime;
    }
    /**
	 * 获取：请假结束时间
	 */
    public Date getQingjiaJieshuTime() {
        return qingjiaJieshuTime;
    }


    /**
	 * 设置：请假结束时间
	 */
    public void setQingjiaJieshuTime(Date qingjiaJieshuTime) {
        this.qingjiaJieshuTime = qingjiaJieshuTime;
    }
    /**
	 * 获取：请假内容
	 */
    public String getQingjiaContent() {
        return qingjiaContent;
    }


    /**
	 * 设置：请假内容
	 */
    public void setQingjiaContent(String qingjiaContent) {
        this.qingjiaContent = qingjiaContent;
    }
    /**
	 * 获取：请假状态
	 */
    public Integer getQingjiaYesnoTypes() {
        return qingjiaYesnoTypes;
    }


    /**
	 * 设置：请假状态
	 */
    public void setQingjiaYesnoTypes(Integer qingjiaYesnoTypes) {
        this.qingjiaYesnoTypes = qingjiaYesnoTypes;
    }
    /**
	 * 获取：审核理由
	 */
    public String getQingjiaYesnoText() {
        return qingjiaYesnoText;
    }


    /**
	 * 设置：审核理由
	 */
    public void setQingjiaYesnoText(String qingjiaYesnoText) {
        this.qingjiaYesnoText = qingjiaYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getQingjiaShenheTime() {
        return qingjiaShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setQingjiaShenheTime(Date qingjiaShenheTime) {
        this.qingjiaShenheTime = qingjiaShenheTime;
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
