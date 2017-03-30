package com.bjike.goddess.capitalpreparation.api;

import com.bjike.goddess.capitalpreparation.bo.CapitalContrastBO;
import com.bjike.goddess.capitalpreparation.bo.CapitalPreparationInfoBO;
import com.bjike.goddess.capitalpreparation.dto.CapitalPreparationInfoDTO;
import com.bjike.goddess.capitalpreparation.service.CapitalPreparationInfoSer;
import com.bjike.goddess.capitalpreparation.to.CapitalPreparationInfoTO;
import com.bjike.goddess.common.api.exception.SerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 资金准备信息业务接口实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:23 ]
 * @Description: [ 资金准备信息业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("capitalPreparationInfoApiImpl")
public class CapitalPreparationInfoApiImpl implements CapitalPreparationInfoAPI {

    @Autowired
    private CapitalPreparationInfoSer capitalPreparationInfoSer;

    @Override
    public CapitalPreparationInfoBO save(CapitalPreparationInfoTO to) throws SerException {
        return capitalPreparationInfoSer.save(to);
    }

    @Override
    public List<CapitalPreparationInfoBO> list(CapitalPreparationInfoDTO dto) throws SerException {
        return capitalPreparationInfoSer.list(dto);
    }

    @Override
    public void update(CapitalPreparationInfoTO to) throws SerException {
        capitalPreparationInfoSer.update(to);
    }

    @Override
    public void remove(String id) throws SerException {
        capitalPreparationInfoSer.remove(id);
    }

    @Override
    public List<CapitalPreparationInfoBO> collectWeeks(CapitalPreparationInfoDTO dto)throws SerException{
        return capitalPreparationInfoSer.collectWeeks(dto);
    }
}