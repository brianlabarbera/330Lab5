public class Student {

    private String name;
    private int emplID;
    private double gpa;
    private Address address;

    public Student(String name, int emplID, double gpa, Address address) {
        this.name = name;
        this.emplID = emplID;
        this.gpa = gpa;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getemplID() {
        return emplID;
    }

    public double getGPA() {
        return gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setName() {
        this.name = name;
    }

    public void setEMPLID() {
        this.emplID = emplID;
    }

    public void setGPA() {
        this.gpa = gpa;
    }

    public void setAddress() {
        this.address = address;
    }

    public boolean equals(Student student1, Student student2) {

        student1.getName();
        student1.getemplID();
        student1.getAddress();
        student2.getName();
        student2.getemplID();
        student2.getAddress();

        if (student1.emplID == student2.emplID) {
            return true;
        }
        else { return false;}

    }

    public String toString(Student student1) {

        return "Student{name='" + name + "', rollNumber=" + emplID + ", gpa=" + gpa + ", address=" + address.toString() + '}';

    }

    public Student copy() {

        Address copiedAddress = new Address(
                this.address.getStreet(),
                this.address.getCity(),
                this.address.getState(),
                this.address.getZipCode()
        );

        Student copiedStudent = new Student(
                this.name,
                this.emplID,
                this.gpa,
                copiedAddress
        );

        return copiedStudent;
    }

    public Student(Student otherStudent) {
        this.name = otherStudent.getName();
        this.emplID = otherStudent.getemplID();
        this.gpa = otherStudent.getGPA();

        Address otherAddress = otherStudent.getAddress();
        this.address = new Address(
                otherAddress.getStreet(),
                otherAddress.getCity(),
                otherAddress.getState(),
                otherAddress.getZipCode()
        );

    }

}
