import java.util.Stack;

//如何用栈实现队列
public class StackImplQueue {
    //定义两个栈来实现队列，一个负责插入新元素，一个负责移除老元素
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    //入栈操作
    public void enQueue(int element){
        stack1.push(element);
    }
    //出栈操作
    public Integer deQueue(){
        if (stack2.isEmpty()){
            if (stack1.isEmpty()){
                return null;
            }
            fetchFormStack1();
        }
        return stack2.pop();
    }
    //从stack1栈中拿到出栈元素压入栈2
    private void fetchFormStack1(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    public static void main(String[] args) {
        StackImplQueue stackQueue = new StackImplQueue();
        stackQueue.enQueue(1);
        stackQueue.enQueue(2);
        stackQueue.enQueue(3);
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());
        stackQueue.enQueue(4);
        System.out.println(stackQueue.deQueue());
    }
}
