//คลาสย่อยของ Student;
package homework;

public class Parent {

    private String parentName;
    private String address;
    private String telephonNo;

    public Parent(String parentName, String address, String telephonNo) {
        this.parentName = parentName;
        this.address = address;
        this.telephonNo = telephonNo;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephonNo() {
        return telephonNo;
    }

    public void setTelephonNo(String telephonNo) {
        this.telephonNo = telephonNo;
    }

}


