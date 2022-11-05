package cw1;

public class Account {
	private int money = 0;
	//symbol = true 进行加法
	//symbol = false 进行减法
	private boolean symbol = true;//进行加减的切换
	
	public Account() {
		
	}
	
	public int getmoney() {
		return money;
	}
	
	public void setmoney(int money) {
		this.money = money;
	}
	
	public synchronized void add() {
		if(this.symbol = false) {
			try {
				super.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		//延迟
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.money ++;
		//打印ThreadID和当前Money
		System.out.println("ThreadID: " + Thread.currentThread().getName() + " Money = " + this.money);
		//将symbol标记为false进行减法
		this.symbol = false;
		super.notifyAll();
	}
	
	public synchronized void sub() {
		if(this.symbol = true) {
			try {
				super.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.money --;
		//打印ThreadID和当前Money
		System.out.println("ThreadID: " + Thread.currentThread().getName() + " Money = " + this.money);
		this.symbol = true;
		super.notifyAll();
	}

}
