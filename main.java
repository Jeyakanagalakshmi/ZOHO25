//binary search

import java.lang.*;
import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]<t){
                l=mid+1;
            }
            else if(a[mid]>t){
                r=mid-1;
            }
            else{
                System.out.println(mid);
                break;
            }
        }
        
    }
}