package com.company.design.adapter;

/**
 * @author TaeWK
 */
public class Cleaner implements  Electronic220V{



    @Override
    public void connect() {
        System.out.println("청소기 220V ON");
    }
}
