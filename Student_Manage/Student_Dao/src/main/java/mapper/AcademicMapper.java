package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Academic;
import pojo.AcademicExample;

public interface AcademicMapper {
    int countByExample(AcademicExample example);

    int deleteByExample(AcademicExample example);

    int deleteByPrimaryKey(Integer num);

    int insert(Academic record);

    int insertSelective(Academic record);

    List<Academic> selectByExample(AcademicExample example);

    Academic selectByPrimaryKey(Integer num);

    int updateByExampleSelective(@Param("record") Academic record, @Param("example") AcademicExample example);

    int updateByExample(@Param("record") Academic record, @Param("example") AcademicExample example);

    int updateByPrimaryKeySelective(Academic record);

    int updateByPrimaryKey(Academic record);
}