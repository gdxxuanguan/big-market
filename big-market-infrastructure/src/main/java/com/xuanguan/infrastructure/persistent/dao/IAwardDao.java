package com.xuanguan.infrastructure.persistent.dao;

import com.xuanguan.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description 奖品表DAO
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
