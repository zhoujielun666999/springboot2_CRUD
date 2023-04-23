package com.icss.service;

import com.icss.dao.AnimalsMapper;
import com.icss.vo.Animals;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnimalsService {
    @Autowired
    private AnimalsMapper animalsMapper;

    public ArrayList<Animals> selectAllService(){
        return  animalsMapper.selectAllDAO();
    }

    public void deleteService(Integer id){
        animalsMapper.deleteDAO(id);
    }
    public Animals updateSelectService(Integer id){
        return animalsMapper.updateSelectDAO(id);
    }
    public void updateService(Animals animals){
        animalsMapper.updateDAO(animals);
    }
    public void addService(Animals animals){
        animalsMapper.addDAO(animals);
    }
}
