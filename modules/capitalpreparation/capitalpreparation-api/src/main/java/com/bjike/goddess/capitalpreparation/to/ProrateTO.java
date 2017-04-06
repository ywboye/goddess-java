package com.bjike.goddess.capitalpreparation.to;

import com.bjike.goddess.common.api.to.BaseTO;

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
public class ProrateTO extends BaseTO {

    /**
     * 日期
     */
    private String date;

    /**
     * 项目组
     */
    private String project;

    /**
     * 比例
     */
    private Double proportion;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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