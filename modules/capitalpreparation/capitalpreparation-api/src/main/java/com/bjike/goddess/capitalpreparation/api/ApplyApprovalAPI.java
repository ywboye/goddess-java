package com.bjike.goddess.capitalpreparation.api;

import com.bjike.goddess.capitalpreparation.bo.ApplyApprovalBO;
import com.bjike.goddess.capitalpreparation.dto.ApplyApprovalDTO;
import com.bjike.goddess.capitalpreparation.to.ApplyApprovalTO;
import com.bjike.goddess.common.api.exception.SerException;

import java.util.List;

/**
 * 申请审批列表业务接口
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 02:37 ]
 * @Description: [ 申请审批列表业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ApplyApprovalAPI {

    default ApplyApprovalBO save(ApplyApprovalTO applyApprovalTO) throws SerException {
        return null;
    }

    default List<ApplyApprovalBO> list(ApplyApprovalDTO applyApprovalDTO) throws SerException {
        return null;
    }

    default void update(ApplyApprovalTO applyApprovalTO) throws SerException {

    }

    default void congealType(String id)throws SerException{

    }
    default void thawType(String id)throws SerException{

    }
    default void remove(String id) throws SerException {

    }

}