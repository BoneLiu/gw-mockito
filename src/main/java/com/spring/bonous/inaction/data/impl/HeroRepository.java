/*
 * Programmer:liuboen
 * Date:2017/2/11
 */
package com.spring.bonous.inaction.data.impl;

import com.spring.bonous.inaction.data.IRepository;
import com.spring.bonous.inaction.model.creature.Hero;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HeroRepository implements IRepository {
    public List<Hero> findHeroes(long max, int count) {
        return null;
    }
}
