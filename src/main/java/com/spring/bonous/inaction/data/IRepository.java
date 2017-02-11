package com.spring.bonous.inaction.data;/*
 * Programmer:liuboen
 * Date:2017/2/11
 */

import com.spring.bonous.inaction.model.creature.Hero;

import java.util.List;

public interface IRepository {
    List<Hero> findHeroes(long max, int count);
}
