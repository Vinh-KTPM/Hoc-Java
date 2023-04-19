package KetTap;

public class Author {
    /* Khai báo thuoc tinh private */
    private String name;
    private String email;
    private String phone;
    private String gender;

    /* Phuong thuc tao doi so */
    public Author(String name, String email, String phone, String gender) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }

    /* Phuong thuc thiet lap cac thuoc tinh*/
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    /* Phuong thuc lay gia tri cac thuoc tinh */

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getGender() {
        return gender;
    }

    public String toString() {
        return "Tên: " + name +
                "  \nĐịa chỉ email: " + email +
                "  \nSố điện thoại: " + phone +
                "  \nGiới tính: " + gender ;
    }

}
