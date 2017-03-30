package com.bjike.goddess.capitalpreparation.dao;

import com.bjike.goddess.capitalpreparation.dto.ProrateDTO;
import com.bjike.goddess.capitalpreparation.entity.Prorate;
import com.bjike.goddess.common.jpa.dao.JpaRep;

/**
* 比例分配列表持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-28 03:12 ]
* @Description:	[ 比例分配列表持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface ProrateRep extends JpaRep< Prorate , ProrateDTO> {

 }