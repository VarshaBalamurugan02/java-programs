package javaprogram;

public class jaggedarray {

	public static void main(String[] args) {
		
		 int jaggedarray[][]=new int[3][];
		 jaggedarray[0]=new int[3];
		 jaggedarray[1]=new int[2];
		 jaggedarray[2]=new int[1]; 
		 int count=0;
		 
		 for(int i=0;i<jaggedarray.length;i++) 
			for( int j=0;j<jaggedarray[i].length;j++) 
				jaggedarray[i][j]=count++;
				
		 for(int i=0;i<jaggedarray.length;i++) {
			for( int j=0;j<jaggedarray[i].length;j++) {
				 System.out.print(jaggedarray[i][j]+" ");
				 
			}
			System.out.println();
		 }
		  
	}

}
