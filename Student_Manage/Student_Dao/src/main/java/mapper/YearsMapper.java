package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Years;
import pojo.YearsExample;

public interface YearsMapper {
    int countByExample(YearsExample example);

    int deleteByExample(YearsExample example);

    int deleteByPrimaryKey(Integer num);

    int insert(Years record);

    int insertSelective(Years record);

    List<Years> selectByExample(YearsExample example);

    Years selectByPrimaryKey(Integer num);

    int updateByExampleSelective(@Param("record") Years record, @Param("example") YearsExample example);

    int updateByExample(@Param("record") Years record, @Param("example") YearsExample example);

    int updateByPrimaryKeySelective(Years record);

    int updateByPrimaryKey(Years record);
}