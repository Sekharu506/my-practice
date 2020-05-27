/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;


class Students {
    
    private static int count=0;
    private final String dept="CSE";
    private String name;
    
 static
         {
             System.out.println("Students data");
         }
 Students(String n)
 {
     count++;
     this.name=n;
 }
 void dis()
 {
     System.out.println("   Total Students  "+"Present Student NAME"+"  Branch ");
     System.out.println("   "+count+"          "+name+"               "+dept);
 } 
 
}
