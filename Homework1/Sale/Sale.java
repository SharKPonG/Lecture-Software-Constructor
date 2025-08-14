package Homework1.Sale;
import java.util.Scanner;

public class Sale {
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Quantity: ");
        int num = in.nextInt();
        double sum = 0;
        int count = 0;
        
        while(count < num){
            double price = in.nextDouble();

            // กำหนดว่าสินค้าแต่ละชิ้นมีมูลค่า 100
            double finalPrice = 100 + price;

            // ผลรวมราคาเริ่มต้น
            sum += finalPrice;
            count++;
        }


        if (sum > 100.0 && sum < 9999.9){
            double amount = sum * 0.1;

            // ผลลัพธ์หลังคิดส่วนลดแล้ว
            double totalDiscounted = sum - amount;
            System.out.println(totalDiscounted);
        }else if (sum > 9999.9){
            double amount = sum * 0.3;
            double totalDiscounted = sum - amount;
            System.out.println(totalDiscounted);
        }
    } 
}
