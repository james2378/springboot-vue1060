package com.entity.vo;

import com.entity.CaiwubaoxiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 财务报销
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("caiwubaoxiao")
public class CaiwubaoxiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 员工
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 财务报销编号
     */

    @TableField(value = "caiwubaoxiao_uuid_number")
    private String caiwubaoxiaoUuidNumber;


    /**
     * 财务报销名称
     */

    @TableField(value = "caiwubaoxiao_name")
    private String caiwubaoxiaoName;


    /**
     * 发票图片
     */

    @TableField(value = "caiwubaoxiao_photo")
    private String caiwubaoxiaoPhoto;


    /**
     * 财务报销类型
     */

    @TableField(value = "caiwubaoxiao_types")
    private Integer caiwubaoxiaoTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 财务报销内容
     */

    @TableField(value = "caiwubaoxiao_content")
    private String caiwubaoxiaoContent;


    /**
     * 财务报销状态
     */

    @TableField(value = "caiwubaoxiao_yesno_types")
    private Integer caiwubaoxiaoYesnoTypes;


    /**
     * 审核理由
     */

    @TableField(value = "caiwubaoxiao_yesno_text")
    private String caiwubaoxiaoYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "caiwubaoxiao_shenhe_time")
    private Date caiwubaoxiaoShenheTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：员工
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：财务报销编号
	 */
    public String getCaiwubaoxiaoUuidNumber() {
        return caiwubaoxiaoUuidNumber;
    }


    /**
	 * 获取：财务报销编号
	 */

    public void setCaiwubaoxiaoUuidNumber(String caiwubaoxiaoUuidNumber) {
        this.caiwubaoxiaoUuidNumber = caiwubaoxiaoUuidNumber;
    }
    /**
	 * 设置：财务报销名称
	 */
    public String getCaiwubaoxiaoName() {
        return caiwubaoxiaoName;
    }


    /**
	 * 获取：财务报销名称
	 */

    public void setCaiwubaoxiaoName(String caiwubaoxiaoName) {
        this.caiwubaoxiaoName = caiwubaoxiaoName;
    }
    /**
	 * 设置：发票图片
	 */
    public String getCaiwubaoxiaoPhoto() {
        return caiwubaoxiaoPhoto;
    }


    /**
	 * 获取：发票图片
	 */

    public void setCaiwubaoxiaoPhoto(String caiwubaoxiaoPhoto) {
        this.caiwubaoxiaoPhoto = caiwubaoxiaoPhoto;
    }
    /**
	 * 设置：财务报销类型
	 */
    public Integer getCaiwubaoxiaoTypes() {
        return caiwubaoxiaoTypes;
    }


    /**
	 * 获取：财务报销类型
	 */

    public void setCaiwubaoxiaoTypes(Integer caiwubaoxiaoTypes) {
        this.caiwubaoxiaoTypes = caiwubaoxiaoTypes;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：财务报销内容
	 */
    public String getCaiwubaoxiaoContent() {
        return caiwubaoxiaoContent;
    }


    /**
	 * 获取：财务报销内容
	 */

    public void setCaiwubaoxiaoContent(String caiwubaoxiaoContent) {
        this.caiwubaoxiaoContent = caiwubaoxiaoContent;
    }
    /**
	 * 设置：财务报销状态
	 */
    public Integer getCaiwubaoxiaoYesnoTypes() {
        return caiwubaoxiaoYesnoTypes;
    }


    /**
	 * 获取：财务报销状态
	 */

    public void setCaiwubaoxiaoYesnoTypes(Integer caiwubaoxiaoYesnoTypes) {
        this.caiwubaoxiaoYesnoTypes = caiwubaoxiaoYesnoTypes;
    }
    /**
	 * 设置：审核理由
	 */
    public String getCaiwubaoxiaoYesnoText() {
        return caiwubaoxiaoYesnoText;
    }


    /**
	 * 获取：审核理由
	 */

    public void setCaiwubaoxiaoYesnoText(String caiwubaoxiaoYesnoText) {
        this.caiwubaoxiaoYesnoText = caiwubaoxiaoYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getCaiwubaoxiaoShenheTime() {
        return caiwubaoxiaoShenheTime;
    }


    /**
	 * 获取：审核时间
	 */

    public void setCaiwubaoxiaoShenheTime(Date caiwubaoxiaoShenheTime) {
        this.caiwubaoxiaoShenheTime = caiwubaoxiaoShenheTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
