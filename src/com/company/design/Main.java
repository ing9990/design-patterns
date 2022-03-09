package com.company.design;


import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //FTP
        Ftp ftpClient = new Ftp("www.foo.co.kr",22,"/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        //WRITER
        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        //READER
        Reader reader = new Reader("user.env");
        reader.fileConnect();
        reader.fileRead();

        //DISCONNECT
        reader.fileDisonnect();
        writer.fileDisonnect();
        ftpClient.disConnect();

        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
        sftpClient.connect();
        sftpClient.writer();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
