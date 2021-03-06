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
public interface FileReaderStrategy {
    String getFilePath();

    FileFormatStrategy getFormatStrategy();

    void setFilePath(String filePath);

    void setFormatStrategy(FileFormatStrategy formatStrategy);
    
    List<LinkedHashMap<String, String>> getReadInfo() throws IOException;
}
