package com.xuanguan.infrastructure.persistent.dao;

import com.xuanguan.domain.strategy.model.entity.StrategyAwardEntity;
import com.xuanguan.domain.strategy.model.entity.StrategyEntity;
import com.xuanguan.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description 抽奖策略 DAO
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();



    Strategy queryStrategyByStrategyId(Long strategyId);
}
