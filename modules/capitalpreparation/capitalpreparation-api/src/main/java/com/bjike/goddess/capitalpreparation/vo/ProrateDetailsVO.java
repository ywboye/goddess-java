package com.bjike.goddess.capitalpreparation.vo;

/**
 *
 * 项目组分配比例详情表现层对象
 *
 * @Author: [yewenbo]
 * @Date: [2017-03-29 11:37]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class ProrateDetailsVO {
    /**
     * 项目组
     */
    private String project;
    /**
     * 比例分配
     */
    private Double proportion;
    /**
     * 准备金
     */
    private Double prepareMoney;


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

    public Double getPrepareMoney() {
        return prepareMoney;
    }

    public void setPrepareMoney(Double prepareMoney) {
        this.prepareMoney = prepareMoney;
    }
}
