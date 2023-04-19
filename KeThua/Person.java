package KeThua;

public class Person {
    private String name;
    private String dob;
    private String address;
    private String gender;

    public Person() {

    }

    public Person(String name, String dob, String address, String gender) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return  "\nTên =  " + name +
                "\nNgày sinh = " + dob +
                "\nĐịa Chỉ = " + address +
                "\nGiới tính = " + gender ;
    }
}
