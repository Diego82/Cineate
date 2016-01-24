package salacine;

public class MainCine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListasCine listas = new ListasCine();
		//System.out.println("Empezando hilos");
		
		Thread hilo1 = new PantallaInicial(listas);
		Thread hilo2 = new PantallaInicial(listas);
				
		//System.out.println("Arrancando hilos");
		hilo1.start();
		hilo2.start();
		//System.out.println("Hilos arrancados");
		
		try {
			System.out.println("Hacemos el join");
			hilo1.join();hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("imprimimos las lista creadas desde la main");
		//System.out.println(listas);
	}
}