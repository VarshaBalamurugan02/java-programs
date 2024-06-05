package javaprogram;




	class person {
	   
	   void get1() {
	    	
	        
	        System.out.println("employee details");
	    }
	}

	class staff  extends person {
	    void get1(int empid1) 
	    
	    {
	        System.out.println("your empid  is::"+empid1);
	    }
	}

	
	class workers extends person{
	    
	    void get1(int empid2) {
	        System.out.println("your empid is::"+empid2);
	    }
	}
	public class methodoveridingconcepts {
	
	    

		public static void main(String[] args) {
	        
	         staff g1 = new staff();
	         workers g2 = new workers();
	        
	        g1.get1(1001);
	        
			g2.get1(1002);
	    }
	}

