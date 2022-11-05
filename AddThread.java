package cw1;

public class AddThread implements Runnable{
	private Account act;
	
	public AddThread(Account act) {
		this.act = act;
	}
	//¼ÓÇ®+1
	public void run() {
		this.act.add();
	}
}
