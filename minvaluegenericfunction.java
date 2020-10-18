/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;
import java.lang.Comparable;


/**
 *
 * @author BHARATH sharan
 */
public class minvaluegenericfunction { 
    public static void main(String[] args) {
           Integer [] intArray ={12,22,3,45,6,88};
       System.out.println("The MINIMUM value is -->"+min(intArray));
    }
    
public static <B extends Comparable<B>> B min(B... elements) 
{
    B min = elements[0];
    for (B element : elements) {
        if (element.compareTo(min) < 0) {
            min = element;
        }
    }
    return min;
}
    
}

    

