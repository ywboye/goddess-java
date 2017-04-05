package com.bjike.goddess.headcount.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.headcount.bo.SkillsManageBO;
import com.bjike.goddess.headcount.entity.SkillsManage;
import com.bjike.goddess.headcount.dto.SkillsManageDTO;
import com.bjike.goddess.headcount.to.SkillsManageTO;

import java.util.List;

/**
* 技能管理等级配置业务接口
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-15T14:44:02.642 ]
* @Description:	[ 技能管理等级配置业务接口 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
public interface SkillsManageSer extends Ser<SkillsManage, SkillsManageDTO> {
 default SkillsManageBO save(SkillsManageTO skillsManageTO) throws SerException {
  return null;
 }

 default List<SkillsManageBO> list(SkillsManageDTO skillsManageDTO) throws SerException {
  return null;
 }

 default void update(SkillsManageTO skillsManageTO) throws SerException {

 }

 default void remove(String id) throws SerException {

 }
 }