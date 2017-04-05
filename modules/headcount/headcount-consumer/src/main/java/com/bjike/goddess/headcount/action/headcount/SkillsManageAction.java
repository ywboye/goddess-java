package com.bjike.goddess.headcount.action.headcount;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.headcount.api.SkillsManageAPI;
import com.bjike.goddess.headcount.bo.SkillsManageBO;
import com.bjike.goddess.headcount.dto.SkillsManageDTO;
import com.bjike.goddess.headcount.to.SkillsManageTO;
import com.bjike.goddess.headcount.vo.SkillsManageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 技能管理等级配置
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-15T14:44:02.643 ]
 * @Description: [ 技能管理等级配置 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("headcount/skillsmanage")
public class SkillsManageAction {
    @Autowired
    private SkillsManageAPI skillsManageAPI;

    /**
     * 添加技能管理等级配置
     * @param skillsManageTO
     * @return class SkillsManageVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/add")
    public Result add(SkillsManageTO skillsManageTO) throws ActException {
        try{
            SkillsManageBO skillsManageBO = skillsManageAPI.save(skillsManageTO);
            SkillsManageVO skillsManageVO = BeanTransform.copyProperties(skillsManageBO, SkillsManageVO.class,true);
            return ActResult.initialize(skillsManageVO);
        }catch(SerException e){
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取所有技能管理等级配置信息
     * @param skillsManageDTO
     * @return class SkillsManageVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(SkillsManageDTO skillsManageDTO) throws ActException {
        try {

            List<SkillsManageBO> skillsManageBOs = skillsManageAPI.list(skillsManageDTO);
            List<SkillsManageVO> skillsManageVOs = BeanTransform.copyProperties(
                    skillsManageBOs, SkillsManageVO.class, true);
            return ActResult.initialize(skillsManageVOs);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }
    /**
     * 编辑技能管理等级配置信息
     *
     * @param skillsManageTO 技能管理等级配置信息
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result edit(SkillsManageTO skillsManageTO) throws ActException {
        try {
            skillsManageAPI.update(skillsManageTO);
            return ActResult.initialize("edit success");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id删除技能管理等级配置信息
     * @param id
     * @throws ActException
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            skillsManageAPI.remove(id);
            return ActResult.initialize("delete success");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }
}