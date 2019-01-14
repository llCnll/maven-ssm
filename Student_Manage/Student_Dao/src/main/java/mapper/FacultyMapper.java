package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Faculty;
import pojo.FacultyExample;

public interface FacultyMapper {
    int countByExample(FacultyExample example);

    int deleteByExample(FacultyExample example);

    int deleteByPrimaryKey(Integer num);

    int insert(Faculty record);

    int insertSelective(Faculty record);

    List<Faculty> selectByExample(FacultyExample example);

    Faculty selectByPrimaryKey(Integer num);

    int updateByExampleSelective(@Param("record") Faculty record, @Param("example") FacultyExample example);

    int updateByExample(@Param("record") Faculty record, @Param("example") FacultyExample example);

    int updateByPrimaryKeySelective(Faculty record);

    int updateByPrimaryKey(Faculty record);
}