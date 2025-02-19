//hash map example

import java.lang.*;
import java.util.*;
class Zoho{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap <Integer,Integer>map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:a){
            System.out.print(i+" : "+map.get(i));
        }
        //print once
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" : "+ e.getValue());
        }
    }
}