package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Studiorules;
import pojo.StudiorulesExample;

public interface StudiorulesMapper {
    int countByExample(StudiorulesExample example);

    int deleteByExample(StudiorulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Studiorules record);

    int insertSelective(Studiorules record);

    List<Studiorules> selectByExample(StudiorulesExample example);

    Studiorules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Studiorules record, @Param("example") StudiorulesExample example);

    int updateByExample(@Param("record") Studiorules record, @Param("example") StudiorulesExample example);

    int updateByPrimaryKeySelective(Studiorules record);

    int updateByPrimaryKey(Studiorules record);
}