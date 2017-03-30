package com.bjike.goddess.capitalpreparation.api;

import com.bjike.goddess.capitalpreparation.bo.ProrateBO;
import com.bjike.goddess.capitalpreparation.dto.ProrateDTO;
import com.bjike.goddess.capitalpreparation.to.ProrateTO;
import com.bjike.goddess.common.api.dto.PageDTO;
import com.bjike.goddess.common.api.exception.SerException;

import java.util.List;

/**
* 比例分配列表业务接口
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-28 03:12 ]
* @Description:	[ 比例分配列表业务接口 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface  ProrateAPI  { 
   default ProrateBO save(ProrateTO prorateTO)throws SerException{
    return null;
   }

   default List<ProrateBO> list(ProrateDTO prorateDTO)throws SerException{
       return null;
   }

   default void update(ProrateTO prorateTO)throws SerException{

   }

   default void remove(String id)throws SerException{

   }
 }