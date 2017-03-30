package com.bjike.goddess.capitalpreparation.dto;

import com.bjike.goddess.common.api.dto.BaseDTO;

/**
* 资金准备信息数据传输对象
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-28 03:23 ]
* @Description:	[ 资金准备信息数据传输对象 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public class CapitalPreparationInfoDTO extends BaseDTO {
 /**
  * 开始时间
  */
 private String startDate;
 /**
  * 结束时间
  */
 private String endDate;

 /**
  * 类别
  */
 private String category;

 public String getStartDate() {
  return startDate;
 }

 public void setStartDate(String startDate) {
  this.startDate = startDate;
 }

 public String getEndDate() {
  return endDate;
 }

 public void setEndDate(String endDate) {
  this.endDate = endDate;
 }

 public String getCategory() {
  return category;
 }

 public void setCategory(String category) {
  this.category = category;
 }
}