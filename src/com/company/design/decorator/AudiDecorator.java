package com.company.design.decorator;

/**
 * @author TaeWK
 */
public class AudiDecorator implements ICar {

    protected ICar iCar;
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(ICar iCar, String modelName, int modelPrice){
        this.iCar = iCar;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
            return iCar.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(modelName+"의 가격: "+ getPrice()+"원");
    }
}
