package com.lk.mapper;

import com.lk.pojo.Pet;
import com.lk.pojo.PetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PetMapper {
    int countByExample(PetExample example);

    int deleteByExample(PetExample example);

    int deleteByPrimaryKey(Integer petid);

    int insert(Pet record);

    int insertSelective(Pet record);

    List<Pet> selectByExample(PetExample example);

    Pet selectByPrimaryKey(Integer petid);

    int updateByExampleSelective(@Param("record") Pet record, @Param("example") PetExample example);

    int updateByExample(@Param("record") Pet record, @Param("example") PetExample example);

    int updateByPrimaryKeySelective(Pet record);

    int updateByPrimaryKey(Pet record);
}