package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Productionrules;
import pojo.ProductionrulesExample;

public interface ProductionrulesMapper {
    int countByExample(ProductionrulesExample example);

    int deleteByExample(ProductionrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Productionrules record);

    int insertSelective(Productionrules record);

    List<Productionrules> selectByExample(ProductionrulesExample example);

    Productionrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Productionrules record, @Param("example") ProductionrulesExample example);

    int updateByExample(@Param("record") Productionrules record, @Param("example") ProductionrulesExample example);

    int updateByPrimaryKeySelective(Productionrules record);

    int updateByPrimaryKey(Productionrules record);
}