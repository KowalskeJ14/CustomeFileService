/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customfileservice;

/**
 *
 * @author kowal_000
 */
public class FileService {

    FileReaderStrategy fileReader;
    FileWriterStrategy fileWriter;
    
    public FileService(FileReaderStrategy fileReader, FileWriterStrategy fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }
    
    
}
