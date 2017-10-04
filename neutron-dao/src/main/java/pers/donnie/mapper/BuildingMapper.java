package pers.donnie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.donnie.model.Building;
import pers.donnie.model.BuildingExample;

@Mapper
public interface BuildingMapper {
    long countByExample(BuildingExample example);

    int deleteByExample(BuildingExample example);

    int insert(Building record);

    int insertSelective(Building record);

    List<Building> selectByExample(BuildingExample example);

    int updateByExampleSelective(@Param("record") Building record, @Param("example") BuildingExample example);

    int updateByExample(@Param("record") Building record, @Param("example") BuildingExample example);
}