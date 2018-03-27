package cn.itbat.whh.gateway.dao.mapper;

import cn.itbat.whh.gateway.dao.model.GwServiceDO;
import cn.itbat.whh.gateway.dao.model.GwServiceDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GwServiceDOMapper {

  long countByExample(GwServiceDOExample example);

  int deleteByExample(GwServiceDOExample example);

  int deleteByPrimaryKey(Long serviceUkid);

  int insert(GwServiceDO record);

  int insertSelective(GwServiceDO record);

  List<GwServiceDO> selectByExample(GwServiceDOExample example);

  GwServiceDO selectByPrimaryKey(Long serviceUkid);

  int updateByExampleSelective(@Param("record") GwServiceDO record,
                               @Param("example") GwServiceDOExample example);

  int updateByExample(@Param("record") GwServiceDO record,
                      @Param("example") GwServiceDOExample example);

  int updateByPrimaryKeySelective(GwServiceDO record);

  int updateByPrimaryKey(GwServiceDO record);

  List<GwServiceDO> getGwServiceWithCondition(Map<String, Object> paramMap);


  List<Map<String, Object>> selectGwServiceByServiceName(Map<String, Object> paramMap);

  /**
   *去重查询 gw_service 表中所有的 application_group 字段
   * @return 字符串集合
   * @see GwServiceDO#applicationGroup
   */
  List<String> getApplicationGroups();

}