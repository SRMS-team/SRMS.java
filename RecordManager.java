import java.util.ArrayList;
import java.util.List;

public class RecordManager {
    private List<Record> records; 

    public RecordManager() {
        this.records = new ArrayList<>(); }

    
    public void addRecord(Record record) {
        try {
            if (record == null) {
                throw new IllegalArgumentException("Record cannot be null");
            }
            records.add(record);  
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    public void removeRecord(Record record) {
        if (records.contains(record)) {
            records.remove(record);  
        } else {
            System.out.println("Error: Record not found");
        }
    }

    
    public List<Record> getAllRecords() {
        return records;   }
}
    
