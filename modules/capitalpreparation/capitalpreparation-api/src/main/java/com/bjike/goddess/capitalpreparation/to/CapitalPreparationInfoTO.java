package com.bjike.goddess.capitalpreparation.to;

import com.bjike.goddess.common.api.to.BaseTO;

import java.time.LocalDate;

/**
* 资金准备信息
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-28 03:23 ]
* @Description:	[ 资金准备信息 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class CapitalPreparationInfoTO extends BaseTO {

/**
* 日期
*/
 private String date;

/**
* 类别
*/
 private String  category; 

/**
* 科目
*/
 private String  subjects; 

/**
* 准备金
*/
 private Double  prepareMoney; 

/**
* 项目分配
*/
 private String  projectDistribution;

 public String getDate() {
  return date;
 }

 public void setDate(String date) {
  this.date = date;
 }

 public String getCategory () {
 return category;
 } 
 public void setCategory (String category ) { 
 this.category = category ; 
 } 
 public String getSubjects () { 
 return subjects;
 } 
 public void setSubjects (String subjects ) { 
 this.subjects = subjects ; 
 } 
 public Double getPrepareMoney () { 
 return prepareMoney;
 } 
 public void setPrepareMoney (Double prepareMoney ) { 
 this.prepareMoney = prepareMoney ; 
 } 
 public String getProjectDistribution () { 
 return projectDistribution;
 } 
 public void setProjectDistribution (String projectDistribution ) { 
 this.projectDistribution = projectDistribution ; 
 } 
 }