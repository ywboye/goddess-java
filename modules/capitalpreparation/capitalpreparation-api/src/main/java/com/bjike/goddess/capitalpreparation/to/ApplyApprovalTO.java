package com.bjike.goddess.capitalpreparation.to;

import com.bjike.goddess.capitalpreparation.type.ApproveType;
import com.bjike.goddess.common.api.to.BaseTO;

import javax.persistence.Column;

/**
 * 申请审批列表
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 02:37 ]
 * @Description: [ 申请审批列表 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class ApplyApprovalTO extends BaseTO {

    /**
     * 名称
     */
    private String capitalName;

    /**
     * 申请人
     */
    private String applicant;

    /**
     * 申请时间
     */
    private String applyDate;

    /**
     * 审批人
     */
    private String approver;

    /**
     * 审批时间
     */
    private String approvalDate;
    /**
     * 审批状态
     */
    private ApproveType approveType;
    /**
     * 备注
     */
    private String remark;


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

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public ApproveType getApproveType() {
        return approveType;
    }

    public void setApproveType(ApproveType approveType) {
        this.approveType = approveType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}