package main.java.org.example.Leetcode.Queue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();
    public MyStack() {

    }

    public void push(int x) {
        if(queue1.size()==queue2.size()){
            queue1.add(x);
        }else{
            if(queue1.size()<queue2.size()){
                while(queue2.size()!=0){
                    queue1.add(queue2.poll());
                }
            }
            queue1.add(x);
        }
    }

    public int pop() {
        if(queue1.isEmpty()&&queue2.isEmpty()){
            return -1;
        }else if(queue1.isEmpty()&&!queue2.isEmpty()){
            while(queue2.size()!=1){
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }else{
            while(queue1.size()!=1){
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }

    }

    public int top() {
        if(queue1.isEmpty()&&queue2.isEmpty()){
            return -1;
        }else if(queue1.size()>queue2.size()){
            while(queue1.size()!=1){
                queue2.add(queue1.poll());
            }
            int temp=queue1.poll();
            queue2.add(temp);
            return temp;
        }else{
            while(queue2.size()!=1){
                queue1.add(queue2.poll());
            }
            int temp=queue2.poll();
            queue1.add(temp);
            return temp;
        }
    }

    public boolean empty() {
        if(queue1.isEmpty()&&queue2.isEmpty()){
            return true;
        }
        return false;
    }
}
