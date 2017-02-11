/*
 * Programmer:liuboen
 * Date:2017/1/12
 */
package com.spring.bonous.inaction.wiring.auto;

import com.spring.bonous.inaction.wiring.auto.config.AutoConfigure;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AutoConfigure.class)
public class PlayTest {

//    @Autowired
//    private ICompactDisc disc;

    private IMediaPlayer player;

//    @Test
//    public void discNotNull(){
//        Assert.assertNotNull(disc);
//    }

    @Test
    public void playerNotNull(){
        player.play();
    }
}
