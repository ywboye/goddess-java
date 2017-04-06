package com.bjike.goddess.capitalpreparation.to;

import com.bjike.goddess.common.api.to.BaseTO;

/**
 * 资金准备对比分析
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 09:12 ]
 * @Description: [ 资金准备对比分析 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class CapitalContrastTO extends BaseTO {

    /**
     * 类别
     */
    private String category;

    /**
     * 科目
     */
    private String subjects;

    /**
     * 上月准备资金
     */
    private Double lastMonthMoney;

    /**
     * 本月准备金
     */
    private Double prepareMoney;

    /**
     * 差额
     */
    private Double difference;

    /**
     * 增长率
     */
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