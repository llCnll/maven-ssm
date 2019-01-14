package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Contestrules;
import pojo.ContestrulesExample;

public interface ContestrulesMapper {
    int countByExample(ContestrulesExample example);

    int deleteByExample(ContestrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contestrules record);

    int insertSelective(Contestrules record);

    List<Contestrules> selectByExample(ContestrulesExample example);

    Contestrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contestrules record, @Param("example") ContestrulesExample example);

    int updateByExample(@Param("record") Contestrules record, @Param("example") ContestrulesExample example);

    int updateByPrimaryKeySelective(Contestrules record);

    int updateByPrimaryKey(Contestrules record);
}