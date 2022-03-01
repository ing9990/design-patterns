package com.company.design.proxy;

/**
 * @author TaeWK
 */
public class Browser implements IBrowser{

    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("browser loaging html from : "+ url);
        return new Html(url);
    }
}