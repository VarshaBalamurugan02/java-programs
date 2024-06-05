package javaprogram;

public class nestedforloop {
   void nestedloop()
   {
	   int i,j,n,m;
	   for (i=0;i<3;i++)
	   {
		   for(j=0;j<3;j++) {
			   System.out.println("I value is::"+i+"J value is"+j);
		   }
	   }
   }
   public static void main(String[]args) {
	   nestedforloop f1=new nestedforloop();
	   f1.nestedloop();
   }
   
}

