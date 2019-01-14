package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Studiotype;
import pojo.StudiotypeExample;

public interface StudiotypeMapper {
    int countByExample(StudiotypeExample example);

    int deleteByExample(StudiotypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Studiotype record);

    int insertSelective(Studiotype record);

    List<Studiotype> selectByExample(StudiotypeExample example);

    Studiotype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Studiotype record, @Param("example") StudiotypeExample example);

    int updateByExample(@Param("record") Studiotype record, @Param("example") StudiotypeExample example);

    int updateByPrimaryKeySelective(Studiotype record);

    int updateByPrimaryKey(Studiotype record);
}