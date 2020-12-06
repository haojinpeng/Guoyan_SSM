package test_1018;

import java.util.Scanner;

//程序有误！！！！！！！！！！！！！
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0 ; i < T;i++){
            zhaozuowei();
        }
    }

    public static void zhaozuowei(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String str = scanner.next();
        int M = scanner.nextInt();
        String sex = scanner.next();
        for (int i = 0 ; i < M ; i++){
            if(sex.charAt(i) == 'M'){
                System.out.println(bysex(str, 1));
            }else {
                System.out.println(bysexnv(str, 0));
            }
        }
    }
    public static int bysex(String str,int j){
        for (int i = 0 ; i < str.length() ; i++){
            if(j == str.charAt(i)-48){
                return i+1;
            }
        }
        return bysex(str,--j);
    }
    public static int bysexnv(String str,int j){
        for (int i = 0 ; i < str.length() ; i++){
            if(j == str.charAt(i) - 48){
                return i+1;
            }
        }
        return bysexnv(str,++j);
    }
}
