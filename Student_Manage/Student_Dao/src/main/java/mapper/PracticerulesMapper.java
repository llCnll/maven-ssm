package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Practicerules;
import pojo.PracticerulesExample;

public interface PracticerulesMapper {
    int countByExample(PracticerulesExample example);

    int deleteByExample(PracticerulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Practicerules record);

    int insertSelective(Practicerules record);

    List<Practicerules> selectByExample(PracticerulesExample example);

    Practicerules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Practicerules record, @Param("example") PracticerulesExample example);

    int updateByExample(@Param("record") Practicerules record, @Param("example") PracticerulesExample example);

    int updateByPrimaryKeySelective(Practicerules record);

    int updateByPrimaryKey(Practicerules record);
}