package com.bjike.goddess.capitalpreparation.entity;

import com.bjike.goddess.common.api.entity.BaseEntity;

import javax.persistence.*;


/**
 * 资金准备对比分析
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 09:12 ]
 * @Description: [ 资金准备对比分析 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Entity
@Table(name = "capitalpreparation_capitalcontrast")
public class CapitalContrast extends BaseEntity {

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
     * 上月准备资金
     */
    @Column(name = "lastMonthMoney", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '上月准备资金'")
    private Double lastMonthMoney;

    /**
     * 本月准备金
     */
    @Column(name = "prepareMoney", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '本月准备金'")
    private Double prepareMoney;

    /**
     * 差额
     */
    @Column(name = "difference", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '差额'")
    private Double difference;

    /**
     * 增长率
     */
    @Column(name = "growth", nullable = false, columnDefinition = "DECIMAL(10,2)   COMMENT '增长率'")
    private Double growth;


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

    public Double getLastMonthMoney() {
        return lastMonthMoney;
    }

    public void setLastMonthMoney(Double lastMonthMoney) {
        this.lastMonthMoney = lastMonthMoney;
    }

    public Double getPrepareMoney() {
        return prepareMoney;
    }

    public void setPrepareMoney(Double prepareMoney) {
        this.prepareMoney = prepareMoney;
    }

    public Double getDifference() {
        return difference;
    }

    public void setDifference(Double difference) {
        this.difference = difference;
    }

    public Double getGrowth() {
        return growth;
    }

    public void setGrowth(Double growth) {
        this.growth = growth;
    }
}