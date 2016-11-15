

public class Nombre  {
 int n;
 int carre;
 int indicateur;
 
 public  Nombre() {
	super();
	this.n = 0;
	this.carre = 0;
	indicateur=1;
}

public synchronized void afficher() throws InterruptedException 
 {
	if (indicateur==1)
	{
	indicateur=0;
	System.out.println("le nombre"+n); 
	System.out.println("son carre"+carre);
	notifyAll();
	}
	else { wait();}
 }
 
 public synchronized void calculer() throws InterruptedException
 {
	 if (indicateur==0)
	{
	indicateur=1;
	this.n++;
	this.carre=this.n*this.n;
	notifyAll();
	}
	else { wait();}
 }


}
