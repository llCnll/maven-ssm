package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Practicetype;
import pojo.PracticetypeExample;

public interface PracticetypeMapper {
    int countByExample(PracticetypeExample example);

    int deleteByExample(PracticetypeExample example);

    int insert(Practicetype record);

    int insertSelective(Practicetype record);

    List<Practicetype> selectByExample(PracticetypeExample example);

    int updateByExampleSelective(@Param("record") Practicetype record, @Param("example") PracticetypeExample example);

    int updateByExample(@Param("record") Practicetype record, @Param("example") PracticetypeExample example);
}