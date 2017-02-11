/*
 * Programmer:liuboen
 * Date:2017/2/11
 */
package com.spring.bonous.inaction.model.creature;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;
import java.util.Random;

public class Hero {
    private static long count=new Random(System.currentTimeMillis()).nextInt(10000)+1000L;
    private final long id=count++;
    private final Date time;

    public Hero(Date time) {
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this,"time");
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Hero && EqualsBuilder.reflectionEquals(this,obj,"time");
    }
}
