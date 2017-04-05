package com.bjike.goddess.capitalpreparation.api;

import com.bjike.goddess.capitalpreparation.bo.CapitalPreparationInfoBO;
import com.bjike.goddess.capitalpreparation.dto.CapitalPreparationInfoDTO;
import com.bjike.goddess.capitalpreparation.to.CapitalPreparationInfoTO;
import com.bjike.goddess.common.api.exception.SerException;

import java.util.List;

/**
 * 资金准备信息业务接口
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:23 ]
 * @Description: [ 资金准备信息业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */

public interface CapitalPreparationInfoAPI {
    default CapitalPreparationInfoBO save(CapitalPreparationInfoTO to) throws SerException {
        return null;
    }

    default List<CapitalPreparationInfoBO> list(CapitalPreparationInfoDTO dto) throws SerException {
        return null;
    }

    default void update(CapitalPreparationInfoTO to) throws SerException {

    }

    default void remove(String id) throws SerException {

    }

    default List<CapitalPreparationInfoBO> collectYear(String year)throws SerException{
        return null;
    }

    default List<CapitalPreparationInfoBO> collectMonth(String month)throws SerException{
        return null;
    }

    
}