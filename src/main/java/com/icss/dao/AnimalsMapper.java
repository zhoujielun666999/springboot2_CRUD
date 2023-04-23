package com.icss.dao;

import com.icss.vo.Animals;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface AnimalsMapper {
    public ArrayList<Animals> selectAllDAO();
    public void deleteDAO(@Param("id") Integer id);
    public Animals updateSelectDAO(@Param("id") Integer id);
    public void updateDAO(Animals animals);
    public void addDAO(Animals animals);
}
