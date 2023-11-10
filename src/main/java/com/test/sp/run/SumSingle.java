package com.test.sp.run;

public class SumSingle {

	public static void main(String[] args) {
		long sTime=System.currentTimeMillis();
		long sum=0;
		for(long i=1;i<=1000000000L;i++) {
			sum+=i;
		}
		long eTime=System.currentTimeMillis()-sTime;
		System.out.println("execute time: "+eTime+"ms");

	}

}
