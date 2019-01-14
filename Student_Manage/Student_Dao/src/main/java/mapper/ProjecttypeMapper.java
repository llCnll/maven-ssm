package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Projecttype;
import pojo.ProjecttypeExample;

public interface ProjecttypeMapper {
    int countByExample(ProjecttypeExample example);

    int deleteByExample(ProjecttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projecttype record);

    int insertSelective(Projecttype record);

    List<Projecttype> selectByExample(ProjecttypeExample example);

    Projecttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projecttype record, @Param("example") ProjecttypeExample example);

    int updateByExample(@Param("record") Projecttype record, @Param("example") ProjecttypeExample example);

    int updateByPrimaryKeySelective(Projecttype record);

    int updateByPrimaryKey(Projecttype record);
}