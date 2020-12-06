package timu.day1026;

import java.util.ArrayList;
import java.util.Scanner;

/*
* 给定一个非空数组 (列表)，其元素数据类型为整型，请按照数组元素
十进制最低位从小到大进行排序，十进制最低位相同的元素，相对位置
保持不变。
当数组元素为负值时，十进制最低位等同于去除符号位后对应十进制值
最低位。*/
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(",");
        int[] nums = new int[s.length];
        for (int i = 0; i < s.length; i++){
            //Integer.parseInt()是把()里的内容转换成整数
            nums[i] = Integer.parseInt(s[i]);
            //System.out.println(nums[i]+"\t");
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int n:nums){
                if (n >= 0){
                    if ((n % 10) == i){
                        arrayList.add(n);
                    }
                }else if (((-n) % 10) == i){
                    arrayList.add(n);
                }
            }
        }
        for (int i = 0; i < arrayList.size() - 1; i++) {
            System.out.print(arrayList.get(i)+",");
        }
        System.out.print(arrayList.get(arrayList.size() - 1));
    }
}
