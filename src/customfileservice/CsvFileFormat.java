
package customfileservice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author kowal_000
 */
public class CsvFileFormat implements FileFormatStrategy {

    @Override
    public List<LinkedHashMap<String, String>> decodeFile(String fileData) {
        List<LinkedHashMap<String, String>> records =
                new ArrayList<LinkedHashMap<String, String>>();
        
        String[] recordLines = fileData.split("\\n");
        String[] header = recordLines[0].split(",");
        
        for(int i = 0; i < recordLines.length; i++) {
            LinkedHashMap<String, String> record = new LinkedHashMap<String, String>();
            String[] rowData = recordLines[i].split(",");
            for(int j=0; j < rowData.length; j++) {
                record.put(header[j], rowData[j]);
            }
            records.add(record);
        }
        
        return records;
    }

    @Override
    public String encodeFile(List<LinkedHashMap<String, String>> latestFileData) {
        StringBuilder encodedData = new StringBuilder();
        return encodedData.toString();
    }
    
}
