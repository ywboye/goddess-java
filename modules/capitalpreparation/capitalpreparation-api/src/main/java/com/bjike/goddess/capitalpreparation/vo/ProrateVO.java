package com.bjike.goddess.capitalpreparation.vo;

import java.time.LocalDate;

/**
* 比例分配列表表现层对象
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-28 03:12 ]
* @Description:	[ 比例分配列表表现层对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class ProrateVO {

/**
* id
*/
 private String  id; 
/**
* 日期
*/
 private String  date;

/**
* 项目组
*/
 private String  project; 

/**
* 比例
*/
 private Double  proportion; 



 public String getId () { 
 return id;
 } 
 public void setId (String id ) { 
 this.id = id ; 
 }
 public String getDate() {return date;}
 public void setDate(String date) {this.date = date;}
 public String getProject () {
 return project;
 }
 public void setProject (String project ) { 
 this.project = project ; 
 } 
 public Double getProportion () { 
 return proportion;
 } 
 public void setProportion (Double proportion ) { 
 this.proportion = proportion ; 
 } 
 }