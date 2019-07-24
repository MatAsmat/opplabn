//คลาสย่อยของ Student;
package homework;

public class Counsellor {

    private String counsellorId;
    private String counsellorName;
    private String telephonNo;

    public Counsellor(String counsellorId, String counsellorName, String telephonNo) {
        this.counsellorId = counsellorId;
        this.counsellorName = counsellorName;
        this.telephonNo = telephonNo;
    }

    public String getCounsellorId() {
        return counsellorId;
    }

    public void setCounsellorId(String counsellorId) {
        this.counsellorId = counsellorId;
    }

    public String getCounsellorName() {
        return counsellorName;
    }

    public void setCounsellorName(String counsellorName) {
        this.counsellorName = counsellorName;
    }

    public String getTelephonNo() {
        return telephonNo;
    }

    public void setTelephonNo(String telephonNo) {
        this.telephonNo = telephonNo;
    }

}



   