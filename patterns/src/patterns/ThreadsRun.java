package patterns;


class Happy extends Thread{
	BThreads b;
	@Override
	public void run() {
		try {
			b.happy();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Birthday extends Thread{
	BThreads b;
	@Override
	public void run() {
		try {
			b.birthday();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class Bhagya extends Thread{
	BThreads b;
	@Override
	public void run() {
		try {
			b.bhagya();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


class Heart extends Thread{
	BThreads b;
	@Override
	public void run() {
		try {
			b.heart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




public class ThreadsRun {

	public static void main(String[] args) {
		 
		BThreads bt=new BThreads();
		
		 Happy h= new Happy();
		 h.b=bt;
		 
		 Birthday bth=new Birthday();
		 bth.b=bt;
		 
		 Bhagya bh= new Bhagya();
		 bh.b=bt;
		 
		 Heart he=new Heart();
		 he.b=bt;
		 
		 
		 h.start();
		 bth.start();
		 bh.start();
		 he.start();

	}

}
