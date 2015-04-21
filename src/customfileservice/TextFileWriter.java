/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customfileservice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author kowal_000
 */
public class TextFileWriter implements FileWriterStrategy{

    String filePath;
    FileFormatStrategy formatStrategy;
    
    TextFileWriter(String filePath, FileFormatStrategy formatStrategy) {
        this.filePath = filePath;
        this.formatStrategy = formatStrategy;
    }
    
    public void addNewRecords(List<LinkedHashMap<String, String>> newData) throws IOException {
        
        boolean append = true;
        File file = new File(filePath);
        PrintWriter printOut = new PrintWriter(new BufferedWriter(
                                               new FileWriter(file, append)));
        
        String data = formatStrategy.encodeFile(newData);
        
        printOut.print(data);
        printOut.close();
    }
    
    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public FileFormatStrategy getFormatStrategy() {
        return formatStrategy;
    }

    @Override
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void setFormatStrategy(FileFormatStrategy formatStrategy) {
        this.formatStrategy = formatStrategy;
    }
    
}
