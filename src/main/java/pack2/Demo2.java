/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack2;
import pack1.NewClass;
/**
 *
 * @author Batna Chandra Sekhar
 */
public class Demo2 {
    
    public static void main(String a[])
    {
      showAll();  
    }
    private static void showAll()
    {
        NewClass n1,n2;
        n1 = new NewClass("aravindh");
        n1.getDetails("srinagar","vizag",8,"second class");
        n2= new NewClass("ramu");
        n2.getDetails("bommuru","east godavari",8,"first class");
        
       n1.showDetails();
       n2.showDetails();
        
    }
}
