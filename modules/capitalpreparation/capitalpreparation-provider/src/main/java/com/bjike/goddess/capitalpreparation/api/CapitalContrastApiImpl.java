package com.bjike.goddess.capitalpreparation.api;

import com.bjike.goddess.capitalpreparation.bo.CapitalContrastBO;
import com.bjike.goddess.capitalpreparation.dto.CapitalContrastDTO;
import com.bjike.goddess.capitalpreparation.service.CapitalContrastSer;
import com.bjike.goddess.capitalpreparation.to.CapitalContrastTO;
import com.bjike.goddess.common.api.exception.SerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 资金准备对比分析业务接口实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 09:12 ]
 * @Description: [ 资金准备对比分析业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("capitalContrastApiImpl")
public class CapitalContrastApiImpl implements CapitalContrastAPI {
    @Autowired
    private CapitalContrastSer capitalContrastSer;

    @Override
    public CapitalContrastBO save(CapitalContrastTO capitalContrastTO) throws SerException {
        return capitalContrastSer.save(capitalContrastTO);
    }

    @Override
    public List<CapitalContrastBO> list(CapitalContrastDTO capitalContrastDTO) throws SerException {
        return capitalContrastSer.list(capitalContrastDTO);
    }

    @Override
    public void update(CapitalContrastTO capitalContrastTO) throws SerException {
        capitalContrastSer.update(capitalContrastTO);
    }

    @Override
    public void remove(String id) throws SerException {
        capitalContrastSer.remove(id);
    }
}