package pers.donnie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.donnie.model.Arrange;
import pers.donnie.model.ArrangeExample;

@Mapper
public interface ArrangeMapper {
    long countByExample(ArrangeExample example);

    int deleteByExample(ArrangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Arrange record);

    int insertSelective(Arrange record);

    List<Arrange> selectByExample(ArrangeExample example);

    Arrange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Arrange record, @Param("example") ArrangeExample example);

    int updateByExample(@Param("record") Arrange record, @Param("example") ArrangeExample example);

    int updateByPrimaryKeySelective(Arrange record);

    int updateByPrimaryKey(Arrange record);
}