package com.lk.service;

import com.lk.pojo.Pet;
import com.lk.pojo.PetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetService {

    List<Pet> getAll();

    List<Pet> getFen();

}