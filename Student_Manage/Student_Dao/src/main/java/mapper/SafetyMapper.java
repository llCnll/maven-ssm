package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Safety;
import pojo.SafetyExample;

public interface SafetyMapper {
    int countByExample(SafetyExample example);

    int deleteByExample(SafetyExample example);

    int deleteByPrimaryKey(Integer num);

    int insert(Safety record);

    int insertSelective(Safety record);

    List<Safety> selectByExample(SafetyExample example);

    Safety selectByPrimaryKey(Integer num);

    int updateByExampleSelective(@Param("record") Safety record, @Param("example") SafetyExample example);

    int updateByExample(@Param("record") Safety record, @Param("example") SafetyExample example);

    int updateByPrimaryKeySelective(Safety record);

    int updateByPrimaryKey(Safety record);
}