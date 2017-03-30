package com.bjike.goddess.capitalpreparation.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.capitalpreparation.dto.ApplyApprovalDTO;
import com.bjike.goddess.capitalpreparation.entity.ApplyApproval;

/**
* 申请审批列表持久化接口, 继承基类可使用ｊｐａ命名查询
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-29 02:37 ]
* @Description:	[ 申请审批列表持久化接口, 继承基类可使用ｊｐａ命名查询 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface ApplyApprovalRep extends JpaRep<ApplyApproval ,ApplyApprovalDTO> { 

 }