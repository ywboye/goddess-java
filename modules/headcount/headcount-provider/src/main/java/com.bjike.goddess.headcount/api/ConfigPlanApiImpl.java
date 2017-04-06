package com.bjike.goddess.headcount.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.headcount.bo.ConfigPlanBO;
import com.bjike.goddess.headcount.dto.ConfigPlanDTO;
import com.bjike.goddess.headcount.service.ConfigPlanSer;
import com.bjike.goddess.headcount.to.ConfigPlanTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门人数配置(计划)业务接口实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-15T14:18:34.794 ]
 * @Description: [ 部门人数配置(计划)业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("configPlanApiImpl")
public class ConfigPlanApiImpl implements ConfigPlanAPI {
    @Autowired
    private ConfigPlanSer configPlanSer;

    public ConfigPlanBO save(ConfigPlanTO configPlanTO) throws SerException {
        return configPlanSer.save(configPlanTO);
    }

    public List<ConfigPlanBO> list(ConfigPlanDTO configPlanDTO) throws SerException {
        return configPlanSer.list(configPlanDTO);
    }

    public void update(ConfigPlanTO configPlanTO) throws SerException {
        configPlanSer.update(configPlanTO);
    }

    public void remove(String id) throws SerException {
        configPlanSer.remove(id);
    }

}