/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customfileservice;

import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author kowal_000
 */
public class TextFileFormat implements FileFormatStrategy{

    @Override
    public List<LinkedHashMap<String, String>> decodeFile(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String encodeFile(List<LinkedHashMap<String, String>> latestFileData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
