package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Practice;
import pojo.PracticeExample;

public interface PracticeMapper {
    int countByExample(PracticeExample example);

    int deleteByExample(PracticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Practice record);

    int insertSelective(Practice record);

    List<Practice> selectByExample(PracticeExample example);

    Practice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Practice record, @Param("example") PracticeExample example);

    int updateByExample(@Param("record") Practice record, @Param("example") PracticeExample example);

    int updateByPrimaryKeySelective(Practice record);

    int updateByPrimaryKey(Practice record);
}