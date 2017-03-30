package com.bjike.goddess.capitalpreparation.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


/**
 * 资金准备信息
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:23 ]
 * @Description: [ 资金准备信息 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "capitalpreparation_capitalpreparationinfo")
public class CapitalPreparationInfo extends BaseEntity {

    /**
     * 日期
     */
    @Column(nullable = false, columnDefinition = "DATE COMMENT '日期'")
    private LocalDate date;

    /**
     * 类别
     */
    @Column(name = "category", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '类别'")
    private String category;

    /**
     * 科目
     */
    @Column(name = "subjects", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '科目'")
    private String subjects;

    /**
     * 准备金
     */
    @Column(name = "prepareMoney", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '准备金'")
    private Double prepareMoney;

    /**
     * 项目分配
     */
    @Column(name = "projectDistribution", nullable = false, columnDefinition = "VARCHAR(255)   COMMENT '项目分配'")
    private String projectDistribution;


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public Double getPrepareMoney() {
        return prepareMoney;
    }

    public void setPrepareMoney(Double prepareMoney) {
        this.prepareMoney = prepareMoney;
    }

    public String getProjectDistribution() {
        return projectDistribution;
    }

    public void setProjectDistribution(String projectDistribution) {
        this.projectDistribution = projectDistribution;
    }
}