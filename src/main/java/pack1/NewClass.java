/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

public class NewClass extends Students {
    
    public NewClass(String n) {
        super(n);
    }
   private class Address
   {
       private String town;
       private String district;
       
       Address(String t,String d)
       {
           this.town=t;
           this.district=d;
       }
       
    } Address a;
           
    protected class Score
    {
        protected int grade;
        protected String rank;
        private Score(int g,String r)
                {
                this.grade=g;
                this.rank=r;
                }
         } Score s;
  
    public void getDetails(String t,String d,int g,String r)
    {
         a=new Address(t,d);
         s=new Score(g,r);
    }
    public void showDetails()
    {
        dis();
        System.out.println();
        System.out.println();
        System.out.println("    Town            District    ");
        System.out.println(a.town+"         "+a.district);
         System.out.println();
        System.out.println();
        System.out.println("       Grade         rank");
        System.out.println("  "+s.grade+"          "+s.rank);
        
    }
}
