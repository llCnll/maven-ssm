package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Credentialrules;
import pojo.CredentialrulesExample;

public interface CredentialrulesMapper {
    int countByExample(CredentialrulesExample example);

    int deleteByExample(CredentialrulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Credentialrules record);

    int insertSelective(Credentialrules record);

    List<Credentialrules> selectByExample(CredentialrulesExample example);

    Credentialrules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Credentialrules record, @Param("example") CredentialrulesExample example);

    int updateByExample(@Param("record") Credentialrules record, @Param("example") CredentialrulesExample example);

    int updateByPrimaryKeySelective(Credentialrules record);

    int updateByPrimaryKey(Credentialrules record);
}