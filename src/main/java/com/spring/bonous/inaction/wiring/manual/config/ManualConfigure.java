/*
 * Programmer:liuboen
 * Date:2017/1/15
 */
package com.spring.bonous.inaction.wiring.manual.config;

import com.spring.bonous.inaction.wiring.manual.ICompactDisc;
import com.spring.bonous.inaction.wiring.manual.IMediaPlayer;
import com.spring.bonous.inaction.wiring.manual.impl.CDPlayer;
import com.spring.bonous.inaction.wiring.manual.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManualConfigure {

    @Bean(name = "manualSgtPeppers")
    public ICompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean(name = "manualCDPlayer")
    public IMediaPlayer cdPlayer(ICompactDisc disc){
        return new CDPlayer(disc);
    }
}
