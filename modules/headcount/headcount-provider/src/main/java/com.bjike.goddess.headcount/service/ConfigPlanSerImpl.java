package com.bjike.goddess.headcount.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.headcount.bo.ConfigPlanBO;
import com.bjike.goddess.headcount.dto.ConfigPlanDTO;
import com.bjike.goddess.headcount.entity.ConfigPlan;
import com.bjike.goddess.headcount.to.ConfigPlanTO;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 部门人数配置(计划)业务实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-15T14:18:34.795 ]
 * @Description: [ 部门人数配置(计划)业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "configurationPlanSerCache")
@Service
public class ConfigPlanSerImpl extends ServiceImpl<ConfigPlan, ConfigPlanDTO> implements ConfigPlanSer {
    @Transactional(rollbackFor = SerException.class)
    @Override
    public ConfigPlanBO save(ConfigPlanTO configPlanTO) throws SerException {
        ConfigPlan configPlan = BeanTransform.copyProperties(
                configPlanTO, ConfigPlan.class, true);
        super.save(configPlan);
        configPlanTO.setId(configPlan.getId());
        return BeanTransform.copyProperties(configPlanTO, ConfigPlanBO.class, true);
    }

    @Override
    public List<ConfigPlanBO> list(ConfigPlanDTO configPlanDTO) throws SerException {
        List<ConfigPlan> configPlen = super.findByCis(configPlanDTO);
        return BeanTransform.copyProperties(configPlen, ConfigPlanBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void update(ConfigPlanTO configPlanTO) throws SerException {
        ConfigPlan configPlan = super.findById(configPlanTO.getId());
        BeanTransform.copyProperties(configPlanTO, configPlan, true);
        configPlan.setModifyTime(LocalDateTime.now());
        super.update(configPlan);
    }


    @Transactional(rollbackFor = SerException.class)
    @Override
    public void remove(String id) throws SerException {
        super.remove(id);
    }
}