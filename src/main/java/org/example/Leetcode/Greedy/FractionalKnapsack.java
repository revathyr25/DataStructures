package main.java.org.example.Leetcode.Greedy;

import java.util.Arrays;
import java.util.Comparator;

class Item{
    int value;
    int weight;
    Item(int value,int weight){
        this.value=value;
        this.weight=weight;
    }

}
public class FractionalKnapsack {
    public static void main(String[] args) {
//        Item item1=new Item(100,20);
//        Item item2=new Item(60,10);
//        Item item3=new Item(100,50);
//        Item item4=new Item(200,50);
//        Item item1=new Item(8,10);
//        Item item2=new Item(2,1);
//        Item item3=new Item(10,7);
//        Item item4=new Item(1,7);
//        Item item5=new Item(9,5);
//        Item item6=new Item(7,1);
//        Item item7=new Item(2,8);
//        Item item8=new Item(6,6);
//        Item item9=new Item(4,8);
//        Item item10=new Item(9,7);
        Item item1=new Item(1,4);
        Item item2=new Item(5,9);
        Item item3=new Item(7,6);
        Item item4=new Item(2,3);
        Item item5=new Item(7,7);
        Item item6=new Item(10,3);
        Item[] arr=new Item[6];
        arr[0]=item1;
        arr[1]=item2;
        arr[2]=item3;
        arr[3]=item4;
        arr[4]=item5;
        arr[5]=item6;
        int weight=24;
        System.out.println(fractionalKnapsack(weight,arr,6));
    }
    public static double fractionalKnapsack(int w, Item arr[], int n) {
        Comparator<Item> comparator=new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double f1=(double)o1.value/(double)o1.weight;
                double f2=(double)o2.value/(double)o2.weight;
                if(f1 < f2) return 1;
                else if(f1 > f2) return -1;
                else return 0;
            }
        };
        Arrays.sort(arr,comparator);
        double maxValue=0;
        for(int i=0;i<n;i++){
            if(arr[i].weight<=w){
                maxValue=maxValue+arr[i].value;
                w=w-arr[i].weight;
            }else{
                double perValue=(double)arr[i].value/(double)arr[i].weight;
                maxValue=maxValue+(perValue*w);
                return maxValue;
            }
        }
        return maxValue;
    }
}
