import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private String recordId;
    private String description;
    private List<MedicalRecord> subRecords;

    public MedicalRecord(String recordId, String description) {
        this.recordId = recordId;
        this.description = description;
        this.subRecords = new ArrayList<>();
    }

    public void addSubRecord(MedicalRecord subRecord) {
        subRecords.add(subRecord);
    }

    public String getRecordId() {
        return recordId;
    }

    public String getDescription() {
        return description;
    }

    public List<MedicalRecord> getSubRecords() {
        return subRecords;
    }

    // Recursive method
    public void displayHierarchy(String indent) {
        System.out.println(indent + "Record ID: " + recordId + " - " + description);
        for (MedicalRecord sub : subRecords) {
            sub.displayHierarchy(indent + "  ");
        }
    }

    // Vi du
    public static void main(String[] args) {
        MedicalRecord mainRecord = new MedicalRecord("001", "Patient Master Record");
        MedicalRecord visit1 = new MedicalRecord("001-1", "Visit: 2025-05-10");
        MedicalRecord treatment1 = new MedicalRecord("001-1-1", "Treatment: Blood Test");
        MedicalRecord treatment2 = new MedicalRecord("001-1-2", "Treatment: X-Ray");

        visit1.addSubRecord(treatment1);
        visit1.addSubRecord(treatment2);

        MedicalRecord visit2 = new MedicalRecord("001-2", "Visit: 2025-05-16");

        mainRecord.addSubRecord(visit1);
        mainRecord.addSubRecord(visit2);

        mainRecord.displayHierarchy("");
    }
}
