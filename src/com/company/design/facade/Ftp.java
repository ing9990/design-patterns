package com.company.design.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author TaeWK
 */

@AllArgsConstructor
@NoArgsConstructor
public class Ftp {

    private String host;
    private int port;
    private String path;


    public void connect(){
        System.out.println("FTP Host: " + host + "Port: " + port +"로 연결합니다.");
    }

    public void moveDirectory(){
        System.out.println("path: "+ path+"로 이동합니다.");
    }

    public void disConnect(){
        System.out.println("ftp 연결을 종료합니다.");
    }

}
