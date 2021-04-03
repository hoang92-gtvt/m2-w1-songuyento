import java.util.Scanner;


public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        long number1 =input.nextLong();
        double number2 = Math.sqrt(number1);
        boolean check1 =true;

        if (number1 <1){
            check1 = false;
        }else if (number1 <=3){
            check1 = true;
        }else {
            for (int i = 2; i < number2 ; i++) {
                if(number1%i==0){
                    check1 = false;
                    break;
                }
            }
        }
        if (check1){
            System.out.println(number1 + " là số nguyên tố");
        }else System.out.println(number1 + " không phải là số nguyên tố");
    }
}
