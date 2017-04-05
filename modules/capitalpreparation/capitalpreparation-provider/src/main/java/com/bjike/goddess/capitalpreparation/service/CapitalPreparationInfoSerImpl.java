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
import org.springframework.util.StringUtils;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 资金准备信息业务实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-29 03:23 ]
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
        CapitalPreparationInfo capitalPreparationInfo = BeanTransform.copyProperties(to, CapitalPreparationInfo.class, true);
        super.save(capitalPreparationInfo);
        to.setId(capitalPreparationInfo.getId());
        return BeanTransform.copyProperties(to, CapitalPreparationInfoBO.class, true);
    }

    @Override
    public List<CapitalPreparationInfoBO> list(CapitalPreparationInfoDTO dto) throws SerException {
        List<CapitalPreparationInfo> capitalPreparationInfos = super.findByCis(dto);
        return BeanTransform.copyProperties(capitalPreparationInfos, CapitalPreparationInfoBO.class);
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


    @Override
    public List<CapitalPreparationInfoBO> collectYear(String year) throws SerException {
        LocalDate date = LocalDate.parse(year);

        CapitalPreparationInfoDTO dto = new CapitalPreparationInfoDTO();
        dto.getConditions().add(Restrict.eq("year", date));
        CapitalPreparationInfoBO bo = new CapitalPreparationInfoBO();
        List<CapitalPreparationInfoBO> list = new ArrayList<>(0);

        //TODO: yewenbo 2017-03-31  未做汇总

        return null;
    }
    @Override
    public List<CapitalPreparationInfoBO> collectMonth(String month)throws SerException{
        LocalDate date = LocalDate.parse(month);
        CapitalPreparationInfoDTO dto = new CapitalPreparationInfoDTO();
        dto.getConditions().add(Restrict.eq("month",date));

        //TODO: yewenbo 2017-03-31 未做汇总

        return null;
    }

    public List<CapitalPreparationInfoBO> collectWeeks(CapitalPreparationInfoDTO dto)throws SerException{
        if(dto == null){
            throw new SerException("你好！条件为空，无法进行查询");
        }

        return null;

    }


}