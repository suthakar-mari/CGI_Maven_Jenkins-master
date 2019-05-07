package com.cgi.mypackage;

import org.junit.Test;

import junit.framework.Assert;

public class MoneyConversionTest {

    @Test
    public void testInrToUsd() {
        double inr = 1000000;
        double usd = Math.round((double) inr / 69);
        Assert.assertEquals("USD", usd, (new MoneyConversion()).inrToUsd(inr));
    }
}
