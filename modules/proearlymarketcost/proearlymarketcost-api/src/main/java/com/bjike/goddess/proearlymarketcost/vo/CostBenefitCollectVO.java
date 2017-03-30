package com.bjike.goddess.proearlymarketcost.vo;

/**
 * @Author: [yewenbo]
 * @Date: [2017-03-28 10:10]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class CostBenefitCollectVO {
    /**
     * 年份
     */
    private String year;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 预计市场费
     */
    private Double expectedMarketCost;

    /**
     * 实际市场费
     */
    private Double actualMarketCost;

    /**
     * 差额
     */
    private Double difference;

    /**
     * 预计占比
     */
    private Double expectedAccounted;

    /**
     * 实际占比
     */
    private Double actualAccounted;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Double getExpectedMarketCost() {
        return expectedMarketCost;
    }

    public void setExpectedMarketCost(Double expectedMarketCost) {
        this.expectedMarketCost = expectedMarketCost;
    }

    public Double getActualMarketCost() {
        return actualMarketCost;
    }

    public void setActualMarketCost(Double actualMarketCost) {
        this.actualMarketCost = actualMarketCost;
    }

    public Double getDifference() {
        return difference;
    }

    public void setDifference(Double difference) {
        this.difference = difference;
    }

    public Double getExpectedAccounted() {
        return expectedAccounted;
    }

    public void setExpectedAccounted(Double expectedAccounted) {
        this.expectedAccounted = expectedAccounted;
    }

    public Double getActualAccounted() {
        return actualAccounted;
    }

    public void setActualAccounted(Double actualAccounted) {
        this.actualAccounted = actualAccounted;
    }
}
