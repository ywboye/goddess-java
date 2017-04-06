package com.bjike.goddess.capitalpreparation.action.capitalpreparation;

import com.bjike.goddess.capitalpreparation.api.CapitalPreparationInfoAPI;
import com.bjike.goddess.capitalpreparation.bo.CapitalPreparationInfoBO;
import com.bjike.goddess.capitalpreparation.dto.CapitalPreparationInfoDTO;
import com.bjike.goddess.capitalpreparation.dto.ProrateDTO;
import com.bjike.goddess.capitalpreparation.to.CapitalPreparationInfoTO;
import com.bjike.goddess.capitalpreparation.to.ProrateTO;
import com.bjike.goddess.capitalpreparation.vo.CapitalPreparationInfoVO;
import com.bjike.goddess.capitalpreparation.vo.ProrateVO;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 资金准备信息
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:23 ]
 * @Description: [ 资金准备信息 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("capitalpreparation/capitalpreparationinfo")
public class CapitalPreparationInfoAction {

    @Autowired
    private CapitalPreparationInfoAPI capitalPreparationInfoAPI;

    /**
     * 添加资金准备信息
     *
     * @param to 资金准备信息to
     * @return class CapitalPreparationInfoVO
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/add")
    public Result add(CapitalPreparationInfoTO to) throws ActException {
        try {
            CapitalPreparationInfoBO capitalPreparationInfoBO = capitalPreparationInfoAPI.save(to);
            CapitalPreparationInfoVO capitalPreparationInfoVO = BeanTransform.copyProperties(capitalPreparationInfoBO, CapitalPreparationInfoVO.class, true);
            return ActResult.initialize(capitalPreparationInfoVO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取资金准备信息
     *
     * @param dto 资金准备信息dto
     * @return class CapitalPreparationInfoVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(CapitalPreparationInfoDTO dto) throws ActException {
        try {
            List<CapitalPreparationInfoVO> capitalPreparationInfoVOs = BeanTransform.copyProperties(capitalPreparationInfoAPI.list(dto), CapitalPreparationInfoVO.class);
            return ActResult.initialize(capitalPreparationInfoVOs);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑资金准备信息
     *
     * @param to 资金准备信息to
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result edit(@Validated({EDIT.class}) CapitalPreparationInfoTO to) throws ActException {
        try {
            capitalPreparationInfoAPI.update(to);
            return ActResult.initialize("edit success");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id删除资金准备信息
     *
     * @param id 资金准备信息唯一标识
     * @throws ActException
     * @Des 根据id删除资金准备信息
     * @version v1
     */
    @DeleteMapping("v1/delete")
    public Result delete(@PathVariable String id) throws ActException {
        try {
            capitalPreparationInfoAPI.remove(id);
            return ActResult.initialize("delete success");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 年汇总默认显示当年资金准备详情数据
     *
     * @param year 年份
     * @return class CapitalPreparationInfoVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/collectYear")
    public Result collectYear(String year) throws ActException {
        try {

            //TODO：yewenbo 2017-03-31 汇总未做

            List<CapitalPreparationInfoBO> bo = capitalPreparationInfoAPI.collectYear(year);
            List<CapitalPreparationInfoVO> capitalPreparationInfoVOs = BeanTransform.copyProperties(
                    bo, CapitalPreparationInfoVO.class, true);
            return ActResult.initialize(capitalPreparationInfoVOs);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 月汇总默认显示当月的数据详情
     * @param month 月份
     * @return class CapitalPreparationInfoVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/collectMonth")
    public Result collectMonth(String month)throws ActException{
        try{
            //TODO:yewenbo 2017-03-31 汇总未做
            List<CapitalPreparationInfoBO> bo = capitalPreparationInfoAPI.collectMonth(month);
            List<CapitalPreparationInfoVO> capitalPreparationInfoVOs = BeanTransform.copyProperties(
                    bo, CapitalPreparationInfoVO.class, true);
            return ActResult.initialize(capitalPreparationInfoVOs);
        }catch(SerException e){
            throw new ActException(e.getMessage());
        }
    }
}