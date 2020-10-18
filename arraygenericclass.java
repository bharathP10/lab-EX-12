/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.util.Scanner;

/**
 *
 * @author BHARATH sharan
 */
public class arraygenericclass {
    public static void main(String[] args) 
    {
      Integer n[]={11,22,33,44,55,66,77,88,99,123};
      sample<Integer> obj=new sample<>(n);
      Scanner o=new Scanner(System.in);
      System.out.println("ENTER the ELEMENT to INSERT -->");
      int a=o.nextInt();
      obj.add(a);
      System.out.println("ENTER the POSTION to DELETE -->");
      int b=o.nextInt();
      obj.delete(b);
    }
}
    
class sample<AB>
{
    AB[] value;
    
    public sample(AB[] value)
    {
        this.value=value;
    }
    void add(AB t)
    {
      System.out.println("Inserting at BEGINNING:"); 
      
      for(int i=(value.length-1);i>0;i--)
      {
          value[i]=value[i-1];
      }
      
      value[0]=t;
        for (AB value1 : value) {
            System.out.println(value1);
        }
   
      System.out.println("Inserting at MIDDLE:");
      
      for(int i=(value.length-1);i>(4);i--)
      {
          value[i]=value[i-1];
      }
      
      value[4]=t;
        for (AB value1 : value) {
            System.out.println(value1);
        }
    
        System.out.println("Inserting at LAST:");
        
        for(int i=(value.length-1);i>=(9);i--)
        {
          value[i]=value[i-1];
        }
        
      value[9]=t;
        for (AB value1 : value) {
            System.out.println(value1);
        }
    }  
    void delete(int a)
    {
        System.out.println("REMAINING ELEMENT at specifed position --> :");
        for(int i=(a-1);i<(value.length-1);i++)
        {
            value[i]=value[i+1];
        }
        for (AB value1 : value) 
        {
            System.out.println(value1);
        }
    }
    
}