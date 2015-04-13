/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customfileservice;

import java.io.File;

/**
 *
 * @author kowal_000
 */
public class CustomFileServiceStartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileService fileService
                = new FileService(
                        new TextFileReader("myTestFile", new TextFileFormat()), 
                        new TextFileWriter("myTestFile", new TextFileFormat()));
    }
    
}
