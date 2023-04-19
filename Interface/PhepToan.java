package Interface;

public class PhepToan  implements PhepToanSoHoc{

    @Override
    public double cong(double n1, double n2) {
        double temp;
        temp = n1 + n2;
        return temp;
    }
    @Override
    public double tru(double n1, double n2) {
        double temp;
        temp = n1 - n2;
        return temp;
    }

    @Override
    public double nhan(double n1, double n2) {
        double temp;
        temp = n1 * n2;
        return temp;
    }

    @Override
    public double chia(double n1, double n2) {
        double temp = 0;
        if ( n2 == 0){
            System.out.println("Phép chia cho 0!!!!");
        }else {
            temp = n1 / n2;
        }
        return temp;
    }

}
