package KeThua;

public class Employee extends Person{
    private String employerName;
    private String hiredDate;

    public Employee() {
        super();
    }

    public Employee(String name, String dob, String address, String gender, String employerName, String hiredDate) {
        super(name, dob, address, gender);
        this.employerName = employerName;
        this.hiredDate = hiredDate;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public String toString() {
        return super.toString() +
                " \nTên ông chủ = " + employerName +
                " \nNgày làm việc = " + hiredDate ;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Nguyễn Thành Vinh",
                "05/09/2001",
                "Thanh Hóa",
                "Nam",
                "Hoàng Anh Hùng",
                "04/04/2023");
        System.out.println("Thông tin nhân viên : " + emp);
    }
}
