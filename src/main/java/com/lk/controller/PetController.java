package com.lk.controller;

import com.lk.pojo.Pet;
import com.lk.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PetController {

    @Autowired
    PetService p;

    @RequestMapping("/getAll")
    public  String aaa(){
        List<Pet> list=p.getAll();
        for (Pet s : list){
            System.out.print(s.getPetname());
        }
        return "index";
    }

    @RequestMapping("/aaa")
    public  String a(Integer index){
        if(index==null){
            index=1;
        }
        List<Pet> list=p.getFen(index,3);
        for (Pet s : list){
            System.out.print(s.getPetname());
        }
        return "index";
    }
}
