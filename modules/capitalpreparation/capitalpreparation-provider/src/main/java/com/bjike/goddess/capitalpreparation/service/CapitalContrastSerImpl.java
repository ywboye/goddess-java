package com.bjike.goddess.capitalpreparation.service;

import com.bjike.goddess.capitalpreparation.bo.CapitalContrastBO;
import com.bjike.goddess.capitalpreparation.bo.ProrateBO;
import com.bjike.goddess.capitalpreparation.dto.ProrateDTO;
import com.bjike.goddess.capitalpreparation.entity.Prorate;
import com.bjike.goddess.capitalpreparation.to.CapitalContrastTO;
import com.bjike.goddess.capitalpreparation.to.ProrateTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.capitalpreparation.dto.CapitalContrastDTO;
import com.bjike.goddess.capitalpreparation.entity.CapitalContrast;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 资金准备对比分析业务实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 09:12 ]
 * @Description: [ 资金准备对比分析业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "capitalpreparationSerCache")
@Service
public class CapitalContrastSerImpl extends ServiceImpl<CapitalContrast, CapitalContrastDTO> implements CapitalContrastSer {
    @Transactional(rollbackFor = SerException.class)
    @Override
    public CapitalContrastBO save(CapitalContrastTO capitalContrastTO) throws SerException {
        CapitalContrast capitalContrast = BeanTransform.copyProperties(capitalContrastTO, CapitalContrast.class, true);
        super.save(capitalContrast);
        capitalContrastTO.setId(capitalContrast.getId());
        return BeanTransform.copyProperties(capitalContrastTO, CapitalContrastBO.class, true);
    }

    @Override
    public List<CapitalContrastBO> list(CapitalContrastDTO capitalContrastDTO) throws SerException {
        List<CapitalContrast> capitalContrasts = super.findByCis(capitalContrastDTO);
        return BeanTransform.copyProperties(capitalContrasts, CapitalContrastBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void update(CapitalContrastTO capitalContrastTO) throws SerException {
        CapitalContrast capitalContrast = super.findById(capitalContrastTO.getId());
        BeanTransform.copyProperties(capitalContrast,capitalContrastTO,true);
        capitalContrast.setModifyTime(LocalDateTime.now());
        super.update(capitalContrast);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void remove(String id) throws SerException {
        super.remove(id);
    }
}