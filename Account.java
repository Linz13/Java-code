package cw1;

public class Account {
	private int money = 0;
	//symbol = true ���мӷ�
	//symbol = false ���м���
	private boolean symbol = true;//���мӼ����л�
	
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
		//�ӳ�
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.money ++;
		//��ӡThreadID�͵�ǰMoney
		System.out.println("ThreadID: " + Thread.currentThread().getName() + " Money = " + this.money);
		//��symbol���Ϊfalse���м���
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
		//��ӡThreadID�͵�ǰMoney
		System.out.println("ThreadID: " + Thread.currentThread().getName() + " Money = " + this.money);
		this.symbol = true;
		super.notifyAll();
	}

}
