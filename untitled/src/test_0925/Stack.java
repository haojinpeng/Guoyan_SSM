package test_0925;
//数组模拟一个栈
//栈的特性：先进后出，后进先出
public class Stack {
    private int stck[];
    private int tos;
    Stack(int size){    // 一个参数的构造参数
        stck = new int[size];   // 创建数组（创建堆栈）
        tos = -1;           // 空堆栈标识 -1
    }

    // 入栈
    void push(int item){
        // 定义栈顶位置，元素达到栈顶则无法进栈
        if (tos == stck.length-1){
            System.out.println("Stack is full");
        }else {
            // 元素存入（数组）堆栈，栈顶（自加）
            stck[++tos] = item;
        }
    }

    //出栈
    int pop(){
        // 栈内容为空，则不再执行出栈操作
        if (tos < 0){
            System.out.println("Stack underflow");
            return 0;
        }else {
            // 元素出栈，栈位置自减
            return stck[tos--];
        }
    }

    static class TestStack{
        public static void main(String[] args) {
            Stack mystack1 = new Stack(5);
            Stack mystack2 = new Stack(8);
            // push入栈操作
            for (int i = 0; i < 5; i++) {
                mystack1.push(i);
            }
            for (int i = 0; i < 8; i++) {
                mystack2.push(i);
            }
            //pop出栈操作
            System.out.println("Stack in mystack1:") ;
            for( int i = 0 ; i<5 ; i ++)
                System.out.println(mystack1.pop()) ;
            System.out.println("Stack in mystack2:") ;
            for( int i = 0 ; i<8 ; i ++)
                System.out.println(mystack2.pop()) ;
        }
    }
}
