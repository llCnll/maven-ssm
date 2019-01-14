package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Contesttype;
import pojo.ContesttypeExample;

public interface ContesttypeMapper {
    int countByExample(ContesttypeExample example);

    int deleteByExample(ContesttypeExample example);

    int insert(Contesttype record);

    int insertSelective(Contesttype record);

    List<Contesttype> selectByExample(ContesttypeExample example);

    int updateByExampleSelective(@Param("record") Contesttype record, @Param("example") ContesttypeExample example);

    int updateByExample(@Param("record") Contesttype record, @Param("example") ContesttypeExample example);
}