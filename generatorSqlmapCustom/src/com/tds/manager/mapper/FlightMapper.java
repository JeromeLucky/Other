package com.tds.manager.mapper;

import com.tds.manager.pojo.Flight;
import com.tds.manager.pojo.FlightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlightMapper {
    int countByExample(FlightExample example);

    int deleteByExample(FlightExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Flight record);

    int insertSelective(Flight record);

    List<Flight> selectByExample(FlightExample example);

    Flight selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByExample(@Param("record") Flight record, @Param("example") FlightExample example);

    int updateByPrimaryKeySelective(Flight record);

    int updateByPrimaryKey(Flight record);
}