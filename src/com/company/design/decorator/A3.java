package com.company.design.decorator;

/**
 * @author TaeWK
 */
public class A3 extends AudiDecorator{

    public A3(ICar audi, String modelName) {
        super(audi, modelName, 1000);
    }

}
