/*
 * Programmer:liuboen
 * Date:2017/2/9
 */
package com.spring.bonous.inaction.mvc.pojo.controller;

import com.spring.bonous.inaction.data.IRepository;
import com.spring.bonous.inaction.model.creature.Hero;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception{
        HomeController controller = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }

    @Test
    public void shouldShowRecentHeroes() throws Exception{
        Random random = new Random(13);
        List<Hero> expectedHeroes = createHeroes(20);
        IRepository mock = Mockito.mock(IRepository.class);
        Mockito.when(mock.findHeroes(Long.MAX_VALUE,20)).thenReturn(expectedHeroes);
        HeroesController controller = new HeroesController(mock);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setSingleView(new InternalResourceView("WEB-INF/view/heroes.jsp")).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/Heroes"))
                .andExpect(MockMvcResultMatchers.view().name("heroes"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("heroesList"))
                .andExpect(MockMvcResultMatchers.model()
                        .attribute("heroesList", IsCollectionContaining.hasItems(expectedHeroes.toArray())));
    }

    private List<Hero> createHeroes(int count){
        List<Hero> heroes = new ArrayList<Hero>();
        for (int i = 0; i < count; i++) {
            heroes.add(new Hero(new Date()));
        }
        return heroes;
    }

}
