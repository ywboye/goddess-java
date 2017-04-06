package com.bjike.goddess.headcount.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.headcount.bo.ConfigPlanBO;
import com.bjike.goddess.headcount.entity.ConfigPlan;
import com.bjike.goddess.headcount.dto.ConfigPlanDTO;
import com.bjike.goddess.headcount.to.ConfigPlanTO;

import java.util.List;

/**
 * 部门人数配置(计划)业务接口
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-15T14:18:34.784 ]
 * @Description: [ 部门人数配置(计划)业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ConfigPlanSer extends Ser<ConfigPlan, ConfigPlanDTO> {

    default ConfigPlanBO save(ConfigPlanTO configPlanTO) throws SerException {
        return null;
    }

    default List<ConfigPlanBO> list(ConfigPlanDTO configPlanDTO) throws SerException {
        return null;
    }

    default void update(ConfigPlanTO configPlanTO) throws SerException {

    }

    default void remove(String id) throws SerException {

    }

}