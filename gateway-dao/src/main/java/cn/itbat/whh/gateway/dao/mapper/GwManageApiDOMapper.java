package cn.itbat.whh.gateway.dao.mapper;


import cn.itbat.whh.gateway.dao.model.GwManageApiDOExample;
import cn.itbat.whh.gateway.dao.model.GwManageApiDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface GwManageApiDOMapper {

  long countByExample(GwManageApiDOExample example);

  int deleteByExample(GwManageApiDOExample example);

  int deleteByPrimaryKey(Long apiUkid);

  int insert(GwManageApiDO record);

  int insertSelective(GwManageApiDO record);

  List<GwManageApiDO> selectByExample(GwManageApiDOExample example);

  GwManageApiDO selectByPrimaryKey(Long apiUkid);

  int updateByExampleSelective(@Param("record") GwManageApiDO record,
                               @Param("example") GwManageApiDOExample example);

  int updateByExample(@Param("record") GwManageApiDO record,
                      @Param("example") GwManageApiDOExample example);

  int updateByPrimaryKeySelective(GwManageApiDO record);

  int updateByPrimaryKey(GwManageApiDO record);

  List<GwManageApiDO> getGwManageApiWithCondition(Map<String, Object> paramMap);

}