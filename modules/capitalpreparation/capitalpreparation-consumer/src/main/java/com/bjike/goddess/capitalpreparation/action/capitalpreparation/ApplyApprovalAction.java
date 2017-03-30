package com.bjike.goddess.capitalpreparation.action.capitalpreparation;

import com.bjike.goddess.capitalpreparation.api.ApplyApprovalAPI;
import com.bjike.goddess.capitalpreparation.bo.ApplyApprovalBO;
import com.bjike.goddess.capitalpreparation.dto.ApplyApprovalDTO;
import com.bjike.goddess.capitalpreparation.to.ApplyApprovalTO;
import com.bjike.goddess.capitalpreparation.to.ProrateTO;
import com.bjike.goddess.capitalpreparation.vo.ApplyApprovalVO;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 申请审批列表
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 02:37 ]
 * @Description: [ 申请审批列表 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("capitalpreparation/applyapproval")
public class ApplyApprovalAction {
    @Autowired
    private ApplyApprovalAPI applyApprovalAPI;

    /**
     * 添加申请审批列表信息
     * @param applyApprovalTO
     * @return class ApplyApprovalVO
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/add")
    public Result add(ApplyApprovalTO applyApprovalTO) throws ActException {
        try {
            ApplyApprovalBO applyApprovalBO = applyApprovalAPI.save(applyApprovalTO);
            ApplyApprovalVO applyApprovalVO = BeanTransform.copyProperties(applyApprovalBO, ApplyApprovalVO.class, true);
            return ActResult.initialize(applyApprovalVO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     *获取申请审批列表
     *
     * @param applyApprovalDTO 申请审批列表信息
     * @return class applyApprovalVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(ApplyApprovalDTO applyApprovalDTO) throws ActException {
        try {
            List<ApplyApprovalVO> applyApprovalVOs = BeanTransform.copyProperties(applyApprovalAPI.list(applyApprovalDTO),ApplyApprovalVO.class);
            return ActResult.initialize(applyApprovalVOs);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑申请审批列表信息
     * @param applyApprovalTO
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result edit(ApplyApprovalTO applyApprovalTO)throws ActException{
        try{
            applyApprovalAPI.update(applyApprovalTO);
            return ActResult.initialize("edit success");
        }catch(SerException e){
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 拒绝
     *
     * @param id id
     * @des 根据id标识为拒绝状态
     * @version v1
     */
    @PostMapping("v1/congeal/{id}")
    public Result congealType(@PathVariable String id) throws ActException {
        try {
            applyApprovalAPI.congealType(id);
            return new ActResult("congeal success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 通过
     *
     * @param id id
     * @des 根据id标识为通过状态
     * @version v1
     */
    @PostMapping("v1/thaw/{id}")
    public Result thaw(@PathVariable String id) throws ActException {
        try {
            applyApprovalAPI.thawType(id);
            return new ActResult("thaw success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id删除申请审批列表信息
     * @param id 申请审批列表信息唯一标识
     * @throws ActException
     * @version v1
     */
    @DeleteMapping("v1/delete")
    public Result delete(@PathVariable String id)throws ActException{
        try{
            applyApprovalAPI.remove(id);
            return ActResult.initialize("delete success");
        }catch(SerException e){
            throw new ActException(e.getMessage());
        }
    }
}