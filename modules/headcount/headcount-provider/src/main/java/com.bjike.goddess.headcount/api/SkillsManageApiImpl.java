package com.bjike.goddess.headcount.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.headcount.bo.SkillsManageBO;
import com.bjike.goddess.headcount.dto.SkillsManageDTO;
import com.bjike.goddess.headcount.service.SkillsManageSer;
import com.bjike.goddess.headcount.to.SkillsManageTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 技能管理等级配置业务接口实现
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-15T14:44:02.646 ]
* @Description:	[ 技能管理等级配置业务接口实现 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
@Service("skillsManageApiImpl")
public class SkillsManageApiImpl implements SkillsManageAPI  {
 @Autowired
 private SkillsManageSer skillsManageSer;
 public SkillsManageBO save(SkillsManageTO skillsManageTO) throws SerException {
  return skillsManageSer.save(skillsManageTO);
 }

 public List<SkillsManageBO> list(SkillsManageDTO skillsManageDTO) throws SerException {
  return skillsManageSer.list(skillsManageDTO);
 }

 public void update(SkillsManageTO skillsManageTO) throws SerException {
    skillsManageSer.update(skillsManageTO);
 }

 public void remove(String id) throws SerException {
    skillsManageSer.remove(id);
 }
 }