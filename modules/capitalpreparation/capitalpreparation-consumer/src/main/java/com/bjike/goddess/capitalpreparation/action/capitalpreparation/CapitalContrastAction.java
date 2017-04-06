package com.bjike.goddess.capitalpreparation.action.capitalpreparation;

import com.bjike.goddess.capitalpreparation.api.CapitalContrastAPI;
import com.bjike.goddess.capitalpreparation.bo.CapitalContrastBO;
import com.bjike.goddess.capitalpreparation.dto.CapitalContrastDTO;
import com.bjike.goddess.capitalpreparation.to.CapitalContrastTO;
import com.bjike.goddess.capitalpreparation.vo.CapitalContrastVO;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 资金准备对比分析
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 09:12 ]
 * @Description: [ 资金准备对比分析 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("capitalpreparation/capitalcontrast")
public class CapitalContrastAction {
    @Autowired
    private CapitalContrastAPI capitalContrastAPI;

    /**
     * 添加资金准备对比分析
     *
     * @param capitalContrastTO 资金准备对比分析信息to
     * @des 添加资金准备对比分析
     * @return class CapitalContrastVO
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/add")
    public Result add(CapitalContrastTO capitalContrastTO) throws ActException {
        try {
            CapitalContrastBO capitalContrastBO = capitalContrastAPI.save(capitalContrastTO);
            CapitalContrastVO capitalContrastVO = BeanTransform.copyProperties(capitalContrastBO, CapitalContrastVO.class, true);
            return ActResult.initialize(capitalContrastVO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取所有资金准备对比分析信息
     *
     * @param capitalContrastDTO 资金准备对比分析信息dto
     * @des 获取所有的资金准备对比分析信息
     * @return class CapitalContrastVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(CapitalContrastDTO capitalContrastDTO) throws ActException {
        try {
            List<CapitalContrastVO> capitalContrastVOs = BeanTransform.copyProperties(capitalContrastAPI.list(capitalContrastDTO), CapitalContrastVO.class);
            return ActResult.initialize(capitalContrastVOs);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑资金准备对比分析
     * @param capitalContrastTO 资金准备对比分析信息
     * @des 编辑资金准备对比分析信息
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result edit(CapitalContrastTO capitalContrastTO)throws ActException{
        try{
            capitalContrastAPI.update(capitalContrastTO);
            return ActResult.initialize("edit success");
        }catch(SerException e){
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id删除资金准备对比分析信息
     * @param id 资金准备对比分析的唯一标识
     * @des 根据id删除资金准备对比分析信
     * @throws ActException
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id)throws ActException{
        try{
            capitalContrastAPI.remove(id);
            return ActResult.initialize("delete success");
        }catch(SerException e){
            throw new ActException(e.getMessage());
        }
    }
}