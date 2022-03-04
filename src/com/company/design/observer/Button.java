package com.company.design.observer;

/**
 * @author TaeWK
 */
public class Button {
    private String name;
    private IButtonlistener buttonlistener;

    public Button(String name){
        this.name = name;
    }

    public void addListener(IButtonlistener buttonlistener){
        this.buttonlistener = buttonlistener;
    }

    public void click(String message){
        buttonlistener.clickEvent(message);
    }


}
