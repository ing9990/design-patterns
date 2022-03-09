package com.company.design.facade;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author TaeWK
 */

@NoArgsConstructor
@AllArgsConstructor
public class SftpClient {

    // 파사드 패턴을 적용한 Sftp 객체

    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    public SftpClient(String host, int port,String path, String fileName){
        this.ftp = new Ftp(host,port,path);
        this.reader = new Reader(fileName);
        this.writer = new Writer(fileName);
    }

    public void connect(){
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void disConnect(){
        writer.fileDisonnect();
        reader.fileDisonnect();
        ftp.disConnect();
    }

    public void read(){
        reader.fileRead();
    }

    public void writer(){
        writer.write();
    }
}
