package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Academicrules;
import pojo.AcademicrulesExample;

public interface AcademicrulesMapper {
    int countByExample(AcademicrulesExample example);

    int deleteByExample(AcademicrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Academicrules record);

    int insertSelective(Academicrules record);

    List<Academicrules> selectByExample(AcademicrulesExample example);

    Academicrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Academicrules record, @Param("example") AcademicrulesExample example);

    int updateByExample(@Param("record") Academicrules record, @Param("example") AcademicrulesExample example);

    int updateByPrimaryKeySelective(Academicrules record);

    int updateByPrimaryKey(Academicrules record);
}