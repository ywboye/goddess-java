package com.bjike.goddess.headcount.action.headcount;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.headcount.api.ConfigPlanAPI;
import com.bjike.goddess.headcount.bo.ConfigPlanBO;
import com.bjike.goddess.headcount.bo.SkillsManageBO;
import com.bjike.goddess.headcount.dto.ConfigPlanDTO;
import com.bjike.goddess.headcount.dto.SkillsManageDTO;
import com.bjike.goddess.headcount.to.ConfigPlanTO;
import com.bjike.goddess.headcount.to.SkillsManageTO;
import com.bjike.goddess.headcount.vo.ConfigPlanVO;
import com.bjike.goddess.headcount.vo.SkillsManageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 部门人数配置(计划)
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-15T14:18:34.785 ]
 * @Description: [ 部门人数配置(计划) ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("headcount/configurationplan")
public class ConfigPlanAction {
    @Autowired
    private ConfigPlanAPI configPlanAPI;

    /**
     * 添加部门人数配置计划
     *
     * @param configPlanTO 部门人数配置计划信息
     * @return class ConfigPlanVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/add")
    public Result add(ConfigPlanTO configPlanTO) throws ActException {
        try {
            ConfigPlanBO configPlanBO = configPlanAPI.save(configPlanTO);
            ConfigPlanVO configPlanVO = BeanTransform.copyProperties(configPlanBO, ConfigPlanVO.class, true);
            return ActResult.initialize(configPlanVO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取所有部门人数配置计划信息
     *
     * @param configPlanDTO 部门人数配置计划信息
     * @return class ConfigPlanVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(ConfigPlanDTO configPlanDTO) throws ActException {
        try {

            List<ConfigPlanBO> configPlanBOs = configPlanAPI.list(configPlanDTO);
            List<ConfigPlanVO> configPlanVOs = BeanTransform.copyProperties(
                    configPlanBOs, ConfigPlanVO.class, true);
            return ActResult.initialize(configPlanVOs);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑部门人数配置计划信息
     *
     * @param configPlanTO 部门人数配置计划信息
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result edit(ConfigPlanTO configPlanTO) throws ActException {
        try {
            configPlanAPI.update(configPlanTO);
            return ActResult.initialize("edit success");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id删除部门人数配置计划信息
     *
     * @param id
     * @throws ActException
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            configPlanAPI.remove(id);
            return ActResult.initialize("delete success");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}