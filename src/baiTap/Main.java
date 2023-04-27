package baiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum=0;
        System.out.println("Nhap so n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

////Bai 1. Kiem tra so hoan hao
//        for(int i=1; i<=n ; i++){
//            if(n%i==0){
//                sum += i;
//            }
//        if(sum = n){
//            System.out.println("Day la so hoan hao");
//        }else{
//            System.out.println("Day khong phai so hoan hao");
//        }
//Bai 3. Tim bcnn va ucln
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("UCLN của " + a + " và " + b
                + " là: " + UCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BCNN của " + a + " và " + b
                + " là: " + BCNN(a, b));
    }
    //UCLN
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b,a % b);
    }
    //BCNN
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
