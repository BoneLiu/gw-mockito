/*
 * Programmer:liuboen
 * Date:2017/1/12
 */
package com.spring.bonous.inaction.wiring.auto.impl;

import com.spring.bonous.inaction.wiring.auto.ICompactDisc;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class SgtPeppers implements ICompactDisc {

    private String title="老司机";
    private String artise="买买提·🈚️";

    public void play(PrintStream stream) {
        stream.println("Playing "+title+" by "+artise);
    }
}
