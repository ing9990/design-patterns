package com.company.design;

import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ICar audi = new Audi(1000);
        audi.showPrice();

        // model a3
        ICar audi3 = new A3(audi,"A3");
        audi3.showPrice();

        // model a4
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();

        // model a5
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();
    }
}
