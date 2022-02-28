package com.company.design.adapter;

/**
 * @author TaeWK
 */
// 220V -> 110V
public class SocketAdapter  implements  Electronic110V{

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
