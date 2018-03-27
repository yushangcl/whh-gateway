package cn.itbat.whh.gateway.dao.mapper;


import cn.itbat.whh.gateway.dao.model.GwServiceParamDO;
import cn.itbat.whh.gateway.dao.model.GwServiceParamDOExample;
import cn.itbat.whh.gateway.dao.model.GwServiceParamDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface GwServiceParamDOMapper {

  long countByExample(GwServiceParamDOExample example);

  int deleteByExample(GwServiceParamDOExample example);

  int deleteByPrimaryKey(Long paramUkid);

  int insert(GwServiceParamDO record);

  int insertSelective(GwServiceParamDO record);

  List<GwServiceParamDO> selectByExample(GwServiceParamDOExample example);

  GwServiceParamDO selectByPrimaryKey(Long paramUkid);

  int updateByExampleSelective(@Param("record") GwServiceParamDO record,
                               @Param("example") GwServiceParamDOExample example);

  int updateByExample(@Param("record") GwServiceParamDO record,
                      @Param("example") GwServiceParamDOExample example);

  int updateByPrimaryKeySelective(GwServiceParamDO record);

  int updateByPrimaryKey(GwServiceParamDO record);

  void insertBatchParam(List<GwServiceParamDO> list);

  //---------------------------------------------------------------------
  // 中台使用
  //---------------------------------------------------------------------

  List<GwServiceParamDO> getGwServiceParamWithCondition(Map<String, Object> paramMap);

  List<GwServiceParamDO> getGwServiceParamDTOAndFieldsWithCondition(
          GwServiceParamDTO gwServiceParamDTO);

  List<GwServiceParamDTO> getGwServiceParamDTOWithCondition(Map<String, Object> paramMap);

  /**
   * batch insert
   * @param list  GwServiceParamDO 集合
   */
  void batchInsert(List<GwServiceParamDO> list);

  void batchDeleteByServiceUkids(List<Long> serviceUkids);
}