package cw1;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Account act = new Account();
		//����10���߳�
		Thread[] threadList = new Thread[10];
		//����������Ǯ�̣߳�ż��������Ǯ�߳�
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
