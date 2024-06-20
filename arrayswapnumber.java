package javaprogram;

public class arrayswapnumber {

	public static void main(String[] args) {
		int n =123456;
		int r=0,s=0,t=n,i;
		for(i=n;i>0;s=s*10+(i%10),i=i/10);
		for(i=s;i>0;r=r*100+(i%100),i=i/100);
		System.out.println(r);

	}

}
