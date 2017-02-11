/*
 * Programmer:liuboen
 * Date:2017/1/13
 */
package com.spring.bonous.inaction.wiring.auto.impl;

import com.spring.bonous.inaction.wiring.auto.ICompactDisc;
import com.spring.bonous.inaction.wiring.auto.IMediaPlayer;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements IMediaPlayer {

    private ICompactDisc disc;

    public CDPlayer(ICompactDisc disc) {
        this.disc = disc;
    }

    public void play() {
        disc.play(System.out);
    }
}
