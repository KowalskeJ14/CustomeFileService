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
public interface FileFormatStrategy {
    List<LinkedHashMap<String, String>> decodeFile (String data);
    
    String encodeFile (List<LinkedHashMap<String, String>> latestFileData);
}
