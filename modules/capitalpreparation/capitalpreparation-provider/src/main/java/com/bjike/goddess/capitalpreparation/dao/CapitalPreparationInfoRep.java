package com.bjike.goddess.capitalpreparation.dao;

import com.bjike.goddess.capitalpreparation.dto.CapitalPreparationInfoDTO;
import com.bjike.goddess.capitalpreparation.entity.CapitalPreparationInfo;
import com.bjike.goddess.common.jpa.dao.JpaRep;

/**
* 资金准备信息持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-28 03:23 ]
* @Description:	[ 资金准备信息持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface CapitalPreparationInfoRep extends JpaRep< CapitalPreparationInfo , CapitalPreparationInfoDTO> {

 }