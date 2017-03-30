package com.bjike.goddess.contractquotemanager.action.contractquotemanager;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.contractquotemanager.api.ContractProjectInfoAPI;
import com.bjike.goddess.contractquotemanager.bo.ContractProjectInfoBO;
import com.bjike.goddess.contractquotemanager.dto.ContractProjectInfoDTO;
import com.bjike.goddess.contractquotemanager.dto.ContractQuoteDataDTO;
import com.bjike.goddess.contractquotemanager.to.ContractProjectInfoTO;
import com.bjike.goddess.contractquotemanager.to.ContractQuoteDataTO;
import com.bjike.goddess.contractquotemanager.vo.ContractProjectInfoVO;
import com.bjike.goddess.contractquotemanager.vo.ContractQuoteDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 合同项目基本信息(临时表存放数据商务模块获取数据)
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-21 07:18 ]
 * @Description: [ ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("contractquotemanager/contractprojectinfo")
public class ContractProjectInfoAction {
    @Autowired
    private ContractProjectInfoAPI contractProjectInfoAPI;

    /**
     * 添加合同项目基本信息
     *
     * @param contractProjectInfoTO 合同项目基本信息
     * @return class ContractProjectInfoVO
     * @throws ActException
     * @des 合同项目基本信息
     * @version v1
     */
    @PostMapping("v1/add")
    public Result save(@Validated({ADD.class}) ContractProjectInfoTO contractProjectInfoTO) throws ActException {
        try {
            ContractProjectInfoBO contractProjectInfoBO = contractProjectInfoAPI.save(contractProjectInfoTO);
           ContractProjectInfoVO contractProjectInfoVO = BeanTransform.copyProperties(contractProjectInfoBO,ContractQuoteDataVO.class,true);
            return ActResult.initialize(contractProjectInfoVO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取合同项目基本信息
     * @param contractProjectInfoDTO 合同项目基本信息
     * @return class ContractProjectInfoVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(ContractProjectInfoDTO contractProjectInfoDTO) throws ActException {
        try {
            List<ContractProjectInfoVO> contractProjectInfoVOs = BeanTransform.copyProperties(
                    contractProjectInfoAPI.list(contractProjectInfoDTO), ContractProjectInfoVO.class, true);
            return ActResult.initialize(contractProjectInfoVOs);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }
}