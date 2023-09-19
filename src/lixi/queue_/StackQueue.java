/**
 * @author ��ΰ��
 * @version 1.0
 * @date 2022/10/3 2:05
 */


package lixi.queue_;

import java.util.Stack;

public class StackQueue<E> {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

//    1.�����
    public void push(int x){
        stack1.push(x);
    }
//    2.������
    public int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
//    3.��ȡ����ͷԪ��
    public int peek(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
//    4.�ж϶����Ƿ�Ϊ��
    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }





}
