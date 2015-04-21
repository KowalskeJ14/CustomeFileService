/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customfileservice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author kowal_000
 */
public class CustomFileServiceStartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileService fileService
                = new FileService(
                        new TextFileReader(File.separatorChar + "temp" + File.separatorChar + "mydata", new CsvFileFormat()), 
                        new TextFileWriter(File.separatorChar + "temp" + File.separatorChar + "mydata", new CsvFileFormat()));
        
        List<LinkedHashMap<String, String>> dataIn = fileService.getRecords();
        System.out.println("Reading done...");
        System.out.println(dataIn);
        
        List<LinkedHashMap<String, String>> updatedFileInfo 
                = new ArrayList<LinkedHashMap<String, String>>();
        
        LinkedHashMap<String, String> singleRecord 
                = new LinkedHashMap<String, String>();
        
        singleRecord.put("firstName", "Jared");
        singleRecord.put("lastName", "Kowalske");
        singleRecord.put("age", "25");
        updatedFileInfo.add(singleRecord);
        
        singleRecord = new LinkedHashMap<String, String>();
        singleRecord.put("firstName", "Daniel");
        singleRecord.put("lastName", "Sturridge");
        singleRecord.put("age", "26");
        updatedFileInfo.add(singleRecord);
        
        fileService.addMoreRecords(updatedFileInfo, true);
        
        System.out.println("Writing completed!");
        
    }
    
}
