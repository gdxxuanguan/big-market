package com.xuanguan.domain.strategy.service.armory;

public interface IStrategyDispatch {

    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);
}
