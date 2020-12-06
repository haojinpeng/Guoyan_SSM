import com.sun.deploy.util.ArrayUtil;

import javax.swing.tree.TreeNode;

//冒泡算法1
//一边比较一边向后两两交换，将最大值 / 最小值冒泡到最后一位；
public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5,7};
        bubbleSort1(arr);
        //遍历输出结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort1(int[] arr){
        //如果数组为null或者长度小于2，则无需比较，直接返回
        if (arr == null || arr.length < 2){
            return;
        }
        //冒泡排序的核心是比较旁边两个的数，如果左边大于右边的，那么就会交换的右边
        //如此反复，一圈下来，最大的数就会跑到最右边。
        //最外层的for循环代表的就是这个思想，所以他会有arr.length-1次循环次数
        for (int i = 0;i < arr.length - 1;i++){
            //内层for循环代表的是在减去已经排好序的个数i，然后再减去1，就可以实现冒泡排序了
            //至于为什么要减1，你可以简单的尝试一下，有5个数的话，他们俩俩比较需要几次？
            //没错，只需要4次就可以！
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
