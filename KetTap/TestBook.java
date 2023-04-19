package KetTap;

public class TestBook {
    public static void main(String[] args) {
        Author aut = new Author("Quách Tuấn Ngọc",
                "tuanngocquach@gmail.com",
                "0343342375",
                "Nam");
        System.out.println(aut);  // Hiển thị thông tin tác giả

        Book expBook = new Book("12612351 ",
                "Lập trình Java",
                aut,
                90000f,
                100);
        System.out.println(expBook);  // Hiển thị thông tin của sách

        expBook.setPrice(85000f);
        expBook.setQuantity(88);
        //System.out.println(expBook);  // Hiển thị thông tin của sách mới

        System.out.println("Tên sách là : " + expBook.getName());
        System.out.println("Sô lượng sách là : " + expBook.getQuantity());
        System.out.println("Tác giả của sách là " + expBook.getAuthor());
        System.out.println("Tác giả là : " + expBook.getAuthor().getName());
        System.out.println("Email của tác giả là : " + expBook.getAuthor().getEmail());
        System.out.println("Giới tính cúa tác giả là : " + expBook.getAuthor().getGender());

    }
}
