package cw1;

public class SubThread implements Runnable{
	private Account act;
	
	public SubThread(Account act) {
		this.act = act;
	}
	//ºı«Æ-1
	public void run() {
		this.act.sub();
	}
}
