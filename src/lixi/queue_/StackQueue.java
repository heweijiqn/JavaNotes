/**
 * @author 何伟健
 * @version 1.0
 * @date 2022/10/3 2:05
 */


package lixi.queue_;

import java.util.Stack;

public class StackQueue<E> {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

//    1.入队列
    public void push(int x){
        stack1.push(x);
    }
//    2.出队列
    public int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
//    3.获取队列头元素
    public int peek(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
//    4.判断队列是否为空
    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }





}
