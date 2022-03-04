package com.company.design;

import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonlistener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) throws InterruptedException {

       Button button = new Button("버튼");

       button.addListener(new IButtonlistener() {
           @Override
           public void clickEvent(String event) {
               System.out.println(event);
           }
       });

        button.click("메세지 전달 : click1");
        button.click("메세지 전달 : click2");
        button.click("메세지 전달 : click3");
        button.click("메세지 전달 : click4");

    }
}
