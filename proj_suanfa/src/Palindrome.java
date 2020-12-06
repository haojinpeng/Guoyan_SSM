
//判断是否为回文数
public class Palindrome {
    public static void main(String[] args) {
        boolean res = isPalindrome(1221);
        System.out.println(res);
    }
    //回文数判断
    public static boolean isPalindrome(int x){
        //如果变量x小于0,那么则为负数，负数一定不是回文数
        //例如：-10   01-
        if(x < 0){
            return false;
        }
        //String.valueOf(int i):将int类型变量x转换成字符串
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length()-1;
        //toCharArray() 方法将字符串转换为字符数组。
        char[] arr = str.toCharArray();
        while (right > left){
            if (arr[left++] != arr[right--]){
                return false;
            }
        }
        return true;
    }
}
