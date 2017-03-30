package com.bjike.goddess.capitalpreparation.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.capitalpreparation.dto.CapitalContrastDTO;
import com.bjike.goddess.capitalpreparation.entity.CapitalContrast;

/**
* 资金准备对比分析持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-29 09:12 ]
* @Description:	[ 资金准备对比分析持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface CapitalContrastRep extends JpaRep<CapitalContrast ,CapitalContrastDTO> { 

 }