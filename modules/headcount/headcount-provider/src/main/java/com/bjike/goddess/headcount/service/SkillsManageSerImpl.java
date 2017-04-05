package com.bjike.goddess.headcount.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.headcount.bo.SkillsManageBO;
import com.bjike.goddess.headcount.dto.SkillsManageDTO;
import com.bjike.goddess.headcount.entity.SkillsManage;
import com.bjike.goddess.headcount.to.SkillsManageTO;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
* 技能管理等级配置业务实现
* @Author:			[ yewenbo ]
* @Date:			[  2017-03-15T14:44:02.647 ]
* @Description:	[ 技能管理等级配置业务实现 ]
* @Version:		[ v1.0.0 ]
* @Copy:   		[ com.bjike ]
*/
@CacheConfig(cacheNames ="skillsManageSerCache")
@Service
public class SkillsManageSerImpl extends ServiceImpl<SkillsManage, SkillsManageDTO> implements SkillsManageSer {
 @Transactional(rollbackFor = SerException.class)
 @Override
 public SkillsManageBO save(SkillsManageTO skillsManageTO) throws SerException {
  SkillsManage skillsManage = BeanTransform.copyProperties(skillsManageTO, SkillsManage.class, true);
  super.save(skillsManage);
  skillsManageTO.setId(skillsManage.getId());
  return BeanTransform.copyProperties(skillsManageTO, SkillsManageBO.class, true);
 }

 @Override
 public List<SkillsManageBO> list(SkillsManageDTO skillsManageDTO) throws SerException {
  List<SkillsManage> skillsManages = super.findByCis(skillsManageDTO);
  return BeanTransform.copyProperties(skillsManages, SkillsManageBO.class);
 }

 @Transactional(rollbackFor = SerException.class)
 @Override
 public void update(SkillsManageTO skillsManagesTO) throws SerException {
  SkillsManage skillsManage = super.findById(skillsManagesTO.getId());
  BeanTransform.copyProperties(skillsManagesTO, skillsManage, true);
  skillsManage.setModifyTime(LocalDateTime.now());
  super.update(skillsManage);
 }


 @Transactional(rollbackFor = SerException.class)
 @Override
 public void remove(String id) throws SerException {
  super.remove(id);
 }

}