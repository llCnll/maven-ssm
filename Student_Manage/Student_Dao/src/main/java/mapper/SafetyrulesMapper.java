package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Safetyrules;
import pojo.SafetyrulesExample;

public interface SafetyrulesMapper {
    int countByExample(SafetyrulesExample example);

    int deleteByExample(SafetyrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Safetyrules record);

    int insertSelective(Safetyrules record);

    List<Safetyrules> selectByExample(SafetyrulesExample example);

    Safetyrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Safetyrules record, @Param("example") SafetyrulesExample example);

    int updateByExample(@Param("record") Safetyrules record, @Param("example") SafetyrulesExample example);

    int updateByPrimaryKeySelective(Safetyrules record);

    int updateByPrimaryKey(Safetyrules record);
}