package com.bjike.goddess.capitalpreparation.api;

import com.bjike.goddess.capitalpreparation.bo.ProrateBO;
import com.bjike.goddess.capitalpreparation.dto.ProrateDTO;
import com.bjike.goddess.capitalpreparation.service.ProrateSer;
import com.bjike.goddess.capitalpreparation.to.ProrateTO;
import com.bjike.goddess.common.api.exception.SerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 比例分配列表业务接口实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:12 ]
 * @Description: [ 比例分配列表业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("prorateApiImpl")
public class ProrateApiImpl implements ProrateAPI {
    @Autowired
    private ProrateSer prorateSer;

    @Override
    public ProrateBO save(ProrateTO prorateTO) throws SerException {
        return prorateSer.save(prorateTO);
    }

    @Override
    public List<ProrateBO> list(ProrateDTO prorateDTO) throws SerException {
        return prorateSer.list(prorateDTO);
    }

    @Override
    public void update(ProrateTO prorateTO) throws SerException {
        prorateSer.update(prorateTO);
    }

    @Override
    public void remove(String id) throws SerException {
        prorateSer.remove(id);
    }

}