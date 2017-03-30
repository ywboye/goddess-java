package com.bjike.goddess.capitalpreparation.entity;

import com.bjike.goddess.capitalpreparation.type.ApproveType;
import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;


/**
 * 申请审批列表
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 02:37 ]
 * @Description: [ 申请审批列表 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "capitalpreparation_applyapproval")
public class ApplyApproval extends BaseEntity {

    /**
     * 名称
     */
    @Column(name = "capitalName", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '名称'")
    private String capitalName;

    /**
     * 申请人
     */
    @Column(name = "applicant", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '申请人'")
    private String applicant;

    /**
     * 申请时间
     */
    @Column(name = "applyDate", nullable = false, columnDefinition = "DATE   COMMENT '申请时间'")
    private LocalDate applyDate;

    /**
     * 审批人
     */
    @Column(name = "approver", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '审批人'")
    private String approver;

    /**
     * 审批时间
     */
    @Column(name = "approvalDate", nullable = false, columnDefinition = "DATE   COMMENT '审批时间'")
    private LocalDate approvalDate;

    /**
     * 审批状态
     */
    @Column(columnDefinition = "TINYINT(1) COMMENT '审核状态' ")
    private ApproveType approveType;

    /**
     * 备注
     */
    @Column(name = "remark", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '备注'")
    private String remark;


    public ApproveType getApproveType() {
        return approveType;
    }

    public void setApproveType(ApproveType approveType) {
        this.approveType = approveType;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public LocalDate getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(LocalDate applyDate) {
        this.applyDate = applyDate;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public LocalDate getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}