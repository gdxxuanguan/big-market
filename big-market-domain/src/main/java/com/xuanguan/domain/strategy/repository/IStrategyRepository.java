package com.xuanguan.domain.strategy.repository;

import com.xuanguan.domain.strategy.model.entity.StrategyAwardEntity;
import com.xuanguan.domain.strategy.model.entity.StrategyEntity;
import com.xuanguan.domain.strategy.model.entity.StrategyRuleEntity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    void storeStrategyAwardSearchRateTable(String key, int rateRange, Map<Integer, Integer> shuffleStrategyAwardSearchRateTable);

    Integer queryStrategyAwardAssemble(Long strategyId, int rateKey);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleWeight);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);
}
