package cw1;

public class AddThread implements Runnable{
	private Account act;
	
	public AddThread(Account act) {
		this.act = act;
	}
	//��Ǯ+1
	public void run() {
		this.act.add();
	}
}
