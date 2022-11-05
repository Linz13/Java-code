package cw1;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Account act = new Account();
		//创建10个线程
		Thread[] threadList = new Thread[10];
		//奇数创建减钱线程，偶数创建加钱线程
		for(int i = 0;i<10;i++) {
			if(i%2 == 0) {
				threadList[i] = new Thread(new AddThread(act));
				threadList[i].start();
			}else {
				threadList[i] = new Thread(new SubThread(act));
				threadList[i].start();
			}
		}
	}
}
