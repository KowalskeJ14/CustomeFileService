/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customfileservice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kowal_000
 */
public class TextFileReader implements FileReaderStrategy{

    String filePath;
    FileFormatStrategy formatStrategy;
    
    TextFileReader(String filePath, FileFormatStrategy formatStrategy){
        this.filePath = filePath;
        this.formatStrategy = formatStrategy;
    }
    
    @Override
    public List<LinkedHashMap<String, String>> getReadInfo() throws IOException {
        List<LinkedHashMap<String, String>> info = 
                new ArrayList<LinkedHashMap<String, String>>();
        
        String data = "";
        
        File file = new File(filePath);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while(line != null){
                data += (line + "\n");
                line = in.readLine();
            }
        }
        catch(IOException ioe) {
            throw ioe;
        }
        finally {
            try {
                in.close();
            }
            catch(Exception e) {
                throw new IOException(e.getMessage());
            }
        }
        
        return formatStrategy.decodeFile(data);
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
