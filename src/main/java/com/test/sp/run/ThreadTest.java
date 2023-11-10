package com.test.sp.run;

class SumThread extends Thread {
	//자바의 기본 동기
	//쓰레드 비동기
	private long sNum = 0;
	private long eNum = 0;

	public SumThread(long sNum, long eNum) {
		this.sNum = sNum;
		this.eNum = eNum;
	}

	@Override
	public void run() {
		int sum=0;
		for(long i=sNum;i<=eNum;i++) {
			sum+=i;
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {

		long sTime=System.currentTimeMillis();
		/*
		 * int cnt=0; while(cnt<10) { System.out.println(cnt++); Thread.sleep(1000); }
		 */
		Thread[] ts = new SumThread[5];
		long max=1000000000L;
		long eachCnt=max/ts.length;  //분담 2000000000L
		//1-2000000000L
		//2000000001L-4000000000L
		//2000000001L-6000000000L
		//..
		
		for (int i = 1; i < ts.length; i++) {
			long eNum=i*eachCnt;
			long sNum=eNum-eachCnt+1;
			
			ts[i - 1] = new SumThread(sNum,eNum);
		}

		for (Thread t : ts) {
			t.start(); //쓰레드 실행 -> 어떤 순서로 실행될지는 모름 -> 시작, 종료 시점이 상관 없을 때 사용
			t.run();   //쓰레드가 아닌 run 함수를 실행하라고 한 것이기 때문에 순서대로 실행! 
		}

	}

}
