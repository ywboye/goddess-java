package com.bjike.goddess.proearlymarketcost.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.proearlymarketcost.bo.CostBenefitAnalysisBO;
import com.bjike.goddess.proearlymarketcost.dto.CostBenefitAnalysisDTO;
import com.bjike.goddess.proearlymarketcost.entity.CostBenefitAnalysis;
import com.bjike.goddess.proearlymarketcost.to.CostBenefitAnalysisTO;
import org.hibernate.criterion.Restrictions;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 费用效益分析业务实现
 *
 * @Author: [ yewenbo ]
 * @Date: [ 2017-03-23 03:58 ]
 * @Description: [ 费用效益分析业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "proearlymarketcostSerCache")
@Service
public class CostBenefitAnalysisSerImpl extends ServiceImpl<CostBenefitAnalysis, CostBenefitAnalysisDTO> implements CostBenefitAnalysisSer {

    @Transactional(rollbackFor = SerException.class)
    @Override
    public CostBenefitAnalysisBO save(CostBenefitAnalysisTO costBenefitAnalysisTO) throws SerException {
        CostBenefitAnalysis costBenefitAnalysis = BeanTransform.copyProperties(
                costBenefitAnalysisTO, CostBenefitAnalysis.class, true);
        super.save(costBenefitAnalysis);
        costBenefitAnalysisTO.setId(costBenefitAnalysis.getId());
        return BeanTransform.copyProperties(costBenefitAnalysisTO, CostBenefitAnalysisBO.class, true);
    }

    @Override
    public List<CostBenefitAnalysisBO> list(CostBenefitAnalysisDTO costBenefitAnalysisDTO) throws SerException {
        List<CostBenefitAnalysis> costBenefitAnalysises = super.findByCis(costBenefitAnalysisDTO);
        return BeanTransform.copyProperties(costBenefitAnalysises, CostBenefitAnalysisBO.class, true);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void update(CostBenefitAnalysisTO costBenefitAnalysisTO) throws SerException {
        CostBenefitAnalysis costBenefitAnalysis = super.findById(costBenefitAnalysisTO.getId());
        BeanTransform.copyProperties(costBenefitAnalysisTO, costBenefitAnalysis, true);
        costBenefitAnalysis.setModifyTime(LocalDateTime.now());
        super.update(costBenefitAnalysis);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public void remove(String id) throws SerException {
        super.remove(id);
    }

    @Override
    public List<CostBenefitAnalysisBO> collect(CostBenefitAnalysisDTO dto) throws SerException {
        if (dto == null) {
            throw new SerException("查询条件为空");
        }
        //TODO:  yewenbo 2017-03-28  汇总未做
        List<CostBenefitAnalysisBO> returnList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String [] areas = dto.getArea();
        String yearString = dto.getYear();
        String monthString = dto.getMonth();
        String projectName = dto.getProjectName();
        LocalDate year = LocalDate.parse(yearString);
        LocalDate month = LocalDate.parse(monthString);
        List<CostBenefitAnalysisBO> list = new ArrayList<>(0);
        for(String area : areas){
            dto.getConditions().add(
                    Restrict.eq("projectName",projectName));
            CostBenefitAnalysisBO bo  = new CostBenefitAnalysisBO();
            bo.setMonth(monthString);
            bo.setYear(yearString);
            list.add(bo);
        }
        return list;
    }


}