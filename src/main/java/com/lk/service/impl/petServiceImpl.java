package com.lk.service.impl;

import com.github.pagehelper.PageHelper;
import com.lk.mapper.PetMapper;
import com.lk.pojo.Pet;
import com.lk.pojo.PetExample;
import com.lk.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class petServiceImpl implements PetService {
    @Autowired
    private PetMapper p;
    @Override
    public List<Pet> getAll() {
        PetExample pe=new PetExample();
        PetExample.Criteria c=pe.createCriteria();
        c.andPetnameEqualTo("2222");
        return p.selectByExample(pe);
    }

    @Override
    public List<Pet> getFen() {
        //PageHelper.startPage(pageIndex,pageSize);
        return p.selectByExample(new PetExample());
    }
}
