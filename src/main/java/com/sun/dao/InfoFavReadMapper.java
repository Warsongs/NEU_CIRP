package com.sun.dao;

import com.sun.model.InfoFavRead;
import com.sun.model.InfoFavReadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoFavReadMapper {
    int countByExample(InfoFavReadExample example);

    int deleteByExample(InfoFavReadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InfoFavRead record);

    int insertSelective(InfoFavRead record);

    List<InfoFavRead> selectByExample(InfoFavReadExample example);

    InfoFavRead selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InfoFavRead record, @Param("example") InfoFavReadExample example);

    int updateByExample(@Param("record") InfoFavRead record, @Param("example") InfoFavReadExample example);

    int updateByPrimaryKeySelective(InfoFavRead record);

    int updateByPrimaryKey(InfoFavRead record);
}