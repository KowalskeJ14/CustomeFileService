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
public class TextFileReader implements FileReaderStrategy{

    String filePath;
    FileFormatStrategy formatStrategy;
    
    TextFileReader(String filePath, FileFormatStrategy formatStrategy){
        this.filePath = filePath;
        this.formatStrategy = formatStrategy;
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
