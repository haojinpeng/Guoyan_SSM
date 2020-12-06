package timu.day1026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//和525 个数6
//如果有连续数组，输出，无返回-1
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.输入正整数的和S和数列里数的个数N
        int s = sc.nextInt();
        int n = sc.nextInt();
        int a1 = 1;
        List list = new ArrayList();
        if (2*s%n!=0){
            System.out.println(-1);
            return;
        }else if ((2*s/n-n)%2==0){
            System.out.println(-1);
            return;
        }else {
            a1 = (2*s/n+1-n)/2;
        }
        for (int i = 0;i<n;i++){
            list.add(a1+i);
        }
        System.out.println(list);

    }
}
