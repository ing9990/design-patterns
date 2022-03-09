package com.company.design.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author TaeWK
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Writer {

    private String fileName;

    public void fileConnect(){
        String msg = String.format("Writer %s로 연결합니다.",fileName);
        System.out.println(msg);
    }



    public void fileDisonnect(){
        String msg = String.format("Writer %s로 연결 종료합니다..",fileName);
        System.out.println(msg);
    }


    public void write() {
        String msg = String.format("Writer %s로 파일쓰기를 합니다.",fileName);
        System.out.println(msg);
    }
}
