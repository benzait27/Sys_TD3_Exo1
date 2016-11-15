
public class Threade extends Thread{

	private Nombre nb;
	private int numF;
	
	public Threade(Nombre nb, int numF) {
		super();
		this.nb = nb;
		this.numF = numF;
	}

	@Override
	public void run() {
		
		if (numF==1) {
			
			while (!this.isInterrupted()) {
				try {
					sleep(100);
					nb.afficher();
					
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			
		}} 
		
		else   {
		
			try {
			while (!this.isInterrupted()) {
			
				sleep(200);
				nb.calculer();
			} }
			catch (Exception e) {
				e.printStackTrace();
				/* on met pas le break car le try est on dehor de while*/
			}
		
	} 
			}}



