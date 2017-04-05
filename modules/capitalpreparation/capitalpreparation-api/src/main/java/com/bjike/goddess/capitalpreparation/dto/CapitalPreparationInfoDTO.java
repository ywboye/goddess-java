package com.bjike.goddess.capitalpreparation.dto;

import com.bjike.goddess.common.api.dto.BaseDTO;

/**
 * 资金准备信息数据传输对象
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:23 ]
 * @Description: [ 资金准备信息数据传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class CapitalPreparationInfoDTO extends BaseDTO {
    /**
     * 年份
     */
    private String year;
    /**
     * 月份
     */
    private String month;

    /**
     * 类别
     */
    private String category;

    /**
     * 科目
     */
    private String subjects;

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}