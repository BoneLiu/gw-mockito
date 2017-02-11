/*
 * Programmer:liuboen
 * Date:2017/1/13
 */
package com.spring.bonous.inaction.wiring.manual.impl;

import com.spring.bonous.inaction.wiring.manual.ICompactDisc;
import com.spring.bonous.inaction.wiring.manual.IMediaPlayer;

public class CDPlayer implements IMediaPlayer {

    private ICompactDisc disc;

    public CDPlayer(ICompactDisc disc) {
        this.disc = disc;
    }

    public void play() {
        disc.play(System.out);
    }
}
