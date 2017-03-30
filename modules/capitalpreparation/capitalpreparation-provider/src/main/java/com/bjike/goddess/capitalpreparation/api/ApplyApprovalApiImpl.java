package com.bjike.goddess.capitalpreparation.api;

import com.bjike.goddess.capitalpreparation.bo.ApplyApprovalBO;
import com.bjike.goddess.capitalpreparation.dto.ApplyApprovalDTO;
import com.bjike.goddess.capitalpreparation.service.ApplyApprovalSer;
import com.bjike.goddess.capitalpreparation.to.ApplyApprovalTO;
import com.bjike.goddess.common.api.exception.SerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 申请审批列表业务接口实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 02:37 ]
 * @Description: [ 申请审批列表业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("applyApprovalApiImpl")
public class ApplyApprovalApiImpl implements ApplyApprovalAPI {
    @Autowired
    private ApplyApprovalSer applyApprovalSer;

    @Override
    public ApplyApprovalBO save(ApplyApprovalTO applyApprovalTO) throws SerException {
        return applyApprovalSer.save(applyApprovalTO);
    }

    @Override
    public List<ApplyApprovalBO> list(ApplyApprovalDTO applyApprovalDTO) throws SerException {
        return applyApprovalSer.list(applyApprovalDTO);
    }

    @Override
    public void update(ApplyApprovalTO applyApprovalTO) throws SerException {
        applyApprovalSer.update(applyApprovalTO);
    }

    public void congealType(String id)throws SerException{
        applyApprovalSer.congealType(id);
    }

    public void thawType(String id)throws SerException{
        applyApprovalSer.thawType(id);
    }

    @Override
    public void remove(String id) throws SerException {
        applyApprovalSer.remove(id);
    }
}