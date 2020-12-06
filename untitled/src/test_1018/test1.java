package test_1018;

import java.util.ArrayList;
import java.util.Collections;

public class test1 {
    public static void main(String[] args) {
        int[] score = {6,5,4,2,1,3};
        System.out.println(method(2,3,score));
    }

    public static int method(int min,int max,int[] score){
        int num = score.length;   //总人数
        int isT = 0;   //通过人数
        int isF = 0;   //淘汰人数

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < score.length; i++) {
            isT = i + 1;
            isF = num - isT;
            if (isT >= min && isT <= max && isF >= min && isF <= max){
                return list.get(i);
            }
        }
        return -1;
    }
}
