package Exercise1;

public class Test extends Person {
    public Test(String name, String dob, String pob, char gender, String email, String phone) {
        super(name, dob, pob, gender, email, phone);
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", pob='" + pob + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
