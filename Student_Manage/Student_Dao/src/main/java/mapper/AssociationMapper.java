package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Association;
import pojo.AssociationExample;

public interface AssociationMapper {
    int countByExample(AssociationExample example);

    int deleteByExample(AssociationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Association record);

    int insertSelective(Association record);

    List<Association> selectByExample(AssociationExample example);

    Association selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Association record, @Param("example") AssociationExample example);

    int updateByExample(@Param("record") Association record, @Param("example") AssociationExample example);

    int updateByPrimaryKeySelective(Association record);

    int updateByPrimaryKey(Association record);
}