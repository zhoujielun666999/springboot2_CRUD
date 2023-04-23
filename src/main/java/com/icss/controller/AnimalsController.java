package com.icss.controller;

import com.icss.service.AnimalsService;
import com.icss.vo.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class AnimalsController {
    @Autowired
    private AnimalsService animalsService;
    @RequestMapping("/selectAll")
    public String select(Model model){
        ArrayList<Animals> list = animalsService.selectAllService();
        model.addAttribute("list",list);
        return "showall";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        animalsService.deleteService(id);
        return "redirect:/selectAll";
    }
    @RequestMapping("/updateSelect")
    public String updateSelect(Integer id,Model model){
        Animals animals = animalsService.updateSelectService(id);
        model.addAttribute("animals",animals);
        return "update";
    }
    @RequestMapping("/update")
    public String update(Integer id,String name,Integer age,String type){
        Animals animals = new Animals(id,name,age,type);
        animalsService.updateService(animals);
        return "redirect:/selectAll";
    }
    @RequestMapping("/add")
    public String add(){
        return "add";
    }
    @RequestMapping("/addFinal")
    public String addFinal(String name,Integer age,String type){
        Animals animals = new Animals();
        animals.setName(name);
        animals.setAge(age);
        animals.setType(type);
        animalsService.addService(animals);

        return "redirect:/selectAll";
    }
}
