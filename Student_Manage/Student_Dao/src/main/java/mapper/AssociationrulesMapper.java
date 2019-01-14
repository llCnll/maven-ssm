package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Associationrules;
import pojo.AssociationrulesExample;

public interface AssociationrulesMapper {
    int countByExample(AssociationrulesExample example);

    int deleteByExample(AssociationrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Associationrules record);

    int insertSelective(Associationrules record);

    List<Associationrules> selectByExample(AssociationrulesExample example);

    Associationrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Associationrules record, @Param("example") AssociationrulesExample example);

    int updateByExample(@Param("record") Associationrules record, @Param("example") AssociationrulesExample example);

    int updateByPrimaryKeySelective(Associationrules record);

    int updateByPrimaryKey(Associationrules record);
}