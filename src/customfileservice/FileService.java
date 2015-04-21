/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customfileservice;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author kowal_000
 */
public class FileService {

    private String readFile;
    private String writeFile;
    private FileReaderStrategy fileReader;
    private FileWriterStrategy fileWriter;
    
    public FileService(FileReaderStrategy fileReader, FileWriterStrategy fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
        readFile = fileReader.getFilePath();
        writeFile = fileWriter.getFilePath();
    }
    
    public List<LinkedHashMap<String,String>> getRecords() throws IOException{
        return fileReader.getReadInfo();
    }
    
    public void addMoreRecords(List<LinkedHashMap<String,String>> data, boolean useHeader) throws IOException{
        fileWriter.
    }
}
