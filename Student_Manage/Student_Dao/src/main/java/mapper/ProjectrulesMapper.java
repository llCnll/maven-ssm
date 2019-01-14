package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Projectrules;
import pojo.ProjectrulesExample;

public interface ProjectrulesMapper {
    int countByExample(ProjectrulesExample example);

    int deleteByExample(ProjectrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projectrules record);

    int insertSelective(Projectrules record);

    List<Projectrules> selectByExample(ProjectrulesExample example);

    Projectrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projectrules record, @Param("example") ProjectrulesExample example);

    int updateByExample(@Param("record") Projectrules record, @Param("example") ProjectrulesExample example);

    int updateByPrimaryKeySelective(Projectrules record);

    int updateByPrimaryKey(Projectrules record);
}