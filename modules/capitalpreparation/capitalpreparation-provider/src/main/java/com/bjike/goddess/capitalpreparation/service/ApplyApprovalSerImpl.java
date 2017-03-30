package com.bjike.goddess.capitalpreparation.service;

import com.bjike.goddess.capitalpreparation.bo.ApplyApprovalBO;
import com.bjike.goddess.capitalpreparation.bo.ProrateBO;
import com.bjike.goddess.capitalpreparation.dto.ProrateDTO;
import com.bjike.goddess.capitalpreparation.entity.Prorate;
import com.bjike.goddess.capitalpreparation.to.ApplyApprovalTO;
import com.bjike.goddess.capitalpreparation.to.ProrateTO;
import com.bjike.goddess.capitalpreparation.type.ApproveType;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.capitalpreparation.dto.ApplyApprovalDTO;
import com.bjike.goddess.capitalpreparation.entity.ApplyApproval;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
* 申请审批列表业务实现
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-29 02:37 ]
* @Description:	[ 申请审批列表业务实现 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
@CacheConfig(cacheNames ="capitalpreparationSerCache")
@Service
public class ApplyApprovalSerImpl extends ServiceImpl<ApplyApproval, ApplyApprovalDTO> implements ApplyApprovalSer {

 @Transactional(rollbackFor = SerException.class)
 @Override
 public ApplyApprovalBO save(ApplyApprovalTO applyApprovalTO) throws SerException {
  ApplyApproval applyApproval = BeanTransform.copyProperties(applyApprovalTO, ApplyApproval.class, true);
  super.save(applyApproval);
  applyApprovalTO.setId(applyApproval.getId());

  return BeanTransform.copyProperties(applyApprovalTO, ApplyApprovalBO.class, true);
 }

 @Override
 public List<ApplyApprovalBO> list(ApplyApprovalDTO applyApprovalDTO) throws SerException {
  List<ApplyApproval> applyApprovals = super.findByCis(applyApprovalDTO);
  return BeanTransform.copyProperties(applyApprovals, ApplyApprovalBO.class);
 }

 @Transactional(rollbackFor = SerException.class)
 @Override
 public void update(ApplyApprovalTO applyApprovalTO) throws SerException {
  ApplyApproval applyApproval = super.findById(applyApprovalTO.getId());
  BeanTransform.copyProperties(applyApprovalTO, applyApproval, true);
  applyApproval.setModifyTime(LocalDateTime.now());
  super.update(applyApproval);
 }

 @Transactional(rollbackFor = SerException.class)
 @Override
 public void congealType(String id) throws SerException {
  ApplyApproval applyApproval = super.findById(id);
  applyApproval.setApproveType(ApproveType.DENIED);
  applyApproval.setModifyTime(LocalDateTime.now());
  super.update(applyApproval);
 }

 @Transactional(rollbackFor = SerException.class)
 @Override
 public void thawType(String id) throws SerException {
  ApplyApproval applyApproval = super.findById(id);
  applyApproval.setApproveType(ApproveType.ALLOWED);
  applyApproval.setModifyTime(LocalDateTime.now());
  super.update(applyApproval);
 }

 @Transactional(rollbackFor = SerException.class)
 @Override
 public void remove(String id) throws SerException {
  super.remove(id);
 }
 }