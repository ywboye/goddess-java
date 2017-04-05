package com.bjike.goddess.capitalpreparation.action.capitalpreparation;

import com.bjike.goddess.capitalpreparation.api.ProrateAPI;
import com.bjike.goddess.capitalpreparation.bo.ProrateBO;
import com.bjike.goddess.capitalpreparation.dto.ProrateDTO;
import com.bjike.goddess.capitalpreparation.to.ProrateTO;
import com.bjike.goddess.capitalpreparation.vo.ProrateVO;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 比例分配列表
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:12 ]
 * @Description: [ 比例分配列表 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("capitalpreparation/ prorate")
public class ProrateAction {

    @Autowired
    private ProrateAPI prorateAPI;

    /**
     * 添加比例分配
     * @param prorateTO
     * @return class prorateVO
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/add")
    public Result add(ProrateTO prorateTO) throws ActException {
        try {
            ProrateBO prorateBO = prorateAPI.save(prorateTO);
            ProrateVO prorateVO = BeanTransform.copyProperties(prorateBO, ProrateVO.class, true);
            return ActResult.initialize(prorateVO);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取所有比例分配信息
     * @param prorateDTO
     * @return class prorateVO
     * @throws ActException
     * @version v1
     */
    @GetMapping("v1/list")
    public Result list(ProrateDTO prorateDTO) throws ActException {
        try {
              List<ProrateVO> prorateVOList = BeanTransform.copyProperties(prorateAPI.list(prorateDTO),ProrateVO.class);
            return ActResult.initialize(prorateVOList);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 编辑比例分配信息
     * @param prorateTO
     * @throws ActException
     * @version v1
     */
    @PostMapping("v1/edit")
    public Result edit(ProrateTO prorateTO)throws ActException{
        try{
            prorateAPI.update(prorateTO);
            return ActResult.initialize("edit success");
        }catch(SerException e){
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id删除比例分配信息
     * @param id 比例分配信息唯一标识
     * @throws ActException
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(@PathVariable String id)throws ActException{
        try{
            prorateAPI.remove(id);
            return ActResult.initialize("delete success");
        }catch(SerException e){
            throw new ActException(e.getMessage());
        }
    }
}