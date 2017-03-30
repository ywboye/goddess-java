package com.bjike.goddess.capitalpreparation.service;

import com.bjike.goddess.capitalpreparation.bo.CapitalContrastBO;
import com.bjike.goddess.capitalpreparation.to.CapitalContrastTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.capitalpreparation.entity.CapitalContrast;
import com.bjike.goddess.capitalpreparation.dto.CapitalContrastDTO;

import java.util.List;

/**
* 资金准备对比分析业务接口
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-29 09:12 ]
* @Description:	[ 资金准备对比分析业务接口 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface CapitalContrastSer extends Ser<CapitalContrast, CapitalContrastDTO> {


 default CapitalContrastBO save(CapitalContrastTO capitalContrastTO) throws SerException {
  return null;
 }

 default List<CapitalContrastBO> list(CapitalContrastDTO capitalContrastDTO) throws SerException {
  return null;
 }

 default void update(CapitalContrastTO capitalContrastTO) throws SerException {

 }

 default void remove(String id) throws SerException {

 }

 }