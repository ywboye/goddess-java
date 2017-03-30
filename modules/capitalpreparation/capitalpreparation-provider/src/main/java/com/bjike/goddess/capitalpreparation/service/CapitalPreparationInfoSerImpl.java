package com.bjike.goddess.capitalpreparation.service;

import com.bjike.goddess.capitalpreparation.bo.CapitalPreparationInfoBO;
import com.bjike.goddess.capitalpreparation.dto.CapitalPreparationInfoDTO;
import com.bjike.goddess.capitalpreparation.entity.CapitalPreparationInfo;
import com.bjike.goddess.capitalpreparation.to.CapitalPreparationInfoTO;
import com.bjike.goddess.capitalpreparation.vo.CapitalPreparationInfoVO;
import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 资金准备信息业务实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-28 03:23 ]
 * @Description: [ 资金准备信息业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "capitalpreparationSerCache")

@Service
public class CapitalPreparationInfoSerImpl extends ServiceImpl<CapitalPreparationInfo, CapitalPreparationInfoDTO> implements CapitalPreparationInfoSer {
    @Transactional(rollbackFor = SerException.class)
    @Override
    public CapitalPreparationInfoBO save(CapitalPreparationInfoTO to) throws SerException {
        CapitalPreparationInfo capitalPreparationInfo = BeanTransform.copyProperties(to, CapitalPreparationInfo.class,true);
        super.save(capitalPreparationInfo);
        to.setId(capitalPreparationInfo.getId());
        return BeanTransform.copyProperties(to,CapitalPreparationInfoBO.class,true);
    }

    @Override
    public List<CapitalPreparationInfoBO> list(CapitalPreparationInfoDTO dto) throws SerException {
        List<CapitalPreparationInfo> capitalPreparationInfos = super.findByCis(dto);
        return BeanTransform.copyProperties(capitalPreparationInfos,CapitalPreparationInfoBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void update(CapitalPreparationInfoTO to) throws SerException {
        CapitalPreparationInfo capitalPreparationInfo = super.findById(to.getId());
        BeanTransform.copyProperties(capitalPreparationInfo, to, true);
        capitalPreparationInfo.setModifyTime(LocalDateTime.now());
        super.update(capitalPreparationInfo);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void remove(String id) throws SerException {
        CapitalPreparationInfo capitalPreparationInfo = super.findById(id);
        super.remove(capitalPreparationInfo);
    }

    public List<CapitalPreparationInfoBO> collect(String year)throws SerException{
        CapitalPreparationInfoDTO dto = new CapitalPreparationInfoDTO();
        dto.getConditions().add(Restrict.eq("year",year));

        return null;
    }

    @Override
    public List<CapitalPreparationInfoBO> collectWeeks(CapitalPreparationInfoDTO dto)throws SerException{
        if(dto ==null){
            throw new SerException("您好!查询条件为空,无法进行查询!");
        }
        //TODO: yewenbo 2017-03-29  未做汇总
        return null;
    }
}