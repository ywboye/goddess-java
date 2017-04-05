package com.bjike.goddess.capitalpreparation.entity;

import com.bjike.goddess.capitalpreparation.type.ApproveType;
import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


/**
 * 比例分配列表
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:12 ]
 * @Description: [ 比例分配列表 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "capitalpreparation_prorate")
public class Prorate extends BaseEntity {

    /**
     * 日期
     */
    @Column(nullable = false, columnDefinition = "DATE COMMENT '日期'")
    private LocalDate date;

    /**
     * 项目组
     */
    @Column(name = "project", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '项目组'")
    private String project;

    /**
     * 比例
     */
    @Column(name = "proportion", nullable = false, columnDefinition = "DECIMAL(4,2)   COMMENT '比例'")
    private Double proportion;



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }
}