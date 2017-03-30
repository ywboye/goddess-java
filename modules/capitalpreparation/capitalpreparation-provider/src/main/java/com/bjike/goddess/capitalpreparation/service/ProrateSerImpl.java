package com.bjike.goddess.capitalpreparation.service;

import com.bjike.goddess.capitalpreparation.bo.ProrateBO;
import com.bjike.goddess.capitalpreparation.dto.ProrateDTO;
import com.bjike.goddess.capitalpreparation.entity.Prorate;
import com.bjike.goddess.capitalpreparation.to.ProrateTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 比例分配列表业务实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:12 ]
 * @Description: [ 比例分配列表业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "capitalpreparationSerCache")
@Service
public class ProrateSerImpl extends ServiceImpl<Prorate, ProrateDTO> implements ProrateSer {
    @Transactional(rollbackFor = SerException.class)
    @Override
    public ProrateBO save(ProrateTO prorateTO) throws SerException {
        Prorate prorate = BeanTransform.copyProperties(prorateTO, Prorate.class, true);
        super.save(prorate);
        prorateTO.setId(prorate.getId());
        return BeanTransform.copyProperties(prorateTO, ProrateBO.class, true);
    }

    @Override
    public List<ProrateBO> list(ProrateDTO prorateDTO) throws SerException {
        List<Prorate> prorates = super.findByCis(prorateDTO);
        return BeanTransform.copyProperties(prorates, ProrateBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void update(ProrateTO prorateTO) throws SerException {
        Prorate prorate = super.findById(prorateTO.getId());
        BeanTransform.copyProperties(prorateTO, prorate, true);
        prorate.setModifyTime(LocalDateTime.now());
        super.update(prorate);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void remove(String id) throws SerException {
        super.remove(id);
    }
}