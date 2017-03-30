package com.bjike.goddess.proearlymarketcost.dto;

import com.bjike.goddess.common.api.dto.BaseDTO;
/**
* 费用效益分析数据传输对象
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-23 03:58 ]
* @Description:	[ 费用效益分析数据传输对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class CostBenefitAnalysisDTO extends BaseDTO {

 /**
  * 可选多个地区
  */
 private String[]  area;

 /**
  * 年份
  */
 private String  year;

 /**
  * 月份
  */
 private String  month;

 /**
  * 项目名称
  */
 private String  projectName;

 /**
  * 预警
  */
 private String  warning;

 /**
  * 等级评定
  */
 private String  rating;

 public String[] getArea() {
  return area;
 }

 public void setArea(String[] area) {
  this.area = area;
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

 public String getProjectName() {
  return projectName;
 }

 public void setProjectName(String projectName) {
  this.projectName = projectName;
 }

 public String getWarning() {
  return warning;
 }

 public void setWarning(String warning) {
  this.warning = warning;
 }

 public String getRating() {
  return rating;
 }

 public void setRating(String rating) {
  this.rating = rating;
 }
}