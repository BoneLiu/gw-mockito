/*
 * Programmer:liuboen
 * Date:2017/2/11
 */
package com.spring.bonous.inaction.mvc.pojo.controller;

import com.spring.bonous.inaction.data.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/Heroes")
public class HeroesController {

    private IRepository repository;

    @Autowired
    public HeroesController(IRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getHeroes(Model model){
        model.addAttribute("heroesList",repository.findHeroes(Long.MAX_VALUE,20));
        return "heroes";
    }
}
