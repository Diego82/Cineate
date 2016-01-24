package salacine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import clases.Reserva;

public class ListasCine {

	List<JButton> listaAsientos1 = Collections.synchronizedList(new ArrayList<JButton>());
	List<Reserva> listaReservas = Collections.synchronizedList(new ArrayList<Reserva>());//lista asientos con su estado
	// listados de la pelicula 1
	List<Reserva> listaReservas1 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas2 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas3 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas4 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas5 = Collections.synchronizedList(new ArrayList<Reserva>());
	// listas de la pelicula 2
	List<Reserva> listaReservas6 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas7 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas8 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas9 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas10 = Collections.synchronizedList(new ArrayList<Reserva>());
	// listas de la pelicula 3
	List<Reserva> listaReservas11 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas12 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas13 = Collections.synchronizedList(new ArrayList<Reserva>());																							// estado
	List<Reserva> listaReservas14 = Collections.synchronizedList(new ArrayList<Reserva>());																							// estado
	List<Reserva> listaReservas15 = Collections.synchronizedList(new ArrayList<Reserva>());
	// listas de la pelicula 4
	List<Reserva> listaReservas16 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas17 = Collections.synchronizedList(new ArrayList<Reserva>());																							// estado
	List<Reserva> listaReservas18 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas19 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas20 = Collections.synchronizedList(new ArrayList<Reserva>());
	// listas de la pelicula 5
	List<Reserva> listaReservas21 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas22 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas23 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas24 = Collections.synchronizedList(new ArrayList<Reserva>());																							// estado
	List<Reserva> listaReservas25 = Collections.synchronizedList(new ArrayList<Reserva>());
	// listas de la pelicula 6
	List<Reserva> listaReservas26 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas27 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas28 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas29 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas30 = Collections.synchronizedList(new ArrayList<Reserva>());
	// listas de la pelicula 7
	List<Reserva> listaReservas31 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas32 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas33 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas34 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas35 = Collections.synchronizedList(new ArrayList<Reserva>());
	// listas de la pelicula 8
	List<Reserva> listaReservas36 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas37 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas38 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas39 = Collections.synchronizedList(new ArrayList<Reserva>());
	List<Reserva> listaReservas40 = Collections.synchronizedList(new ArrayList<Reserva>());

	static List<Reserva> listaReservaFinal = Collections.synchronizedList(new ArrayList<Reserva>());
	List<JRadioButton> listaHoras = Collections.synchronizedList(new ArrayList<JRadioButton>());
	// listas para las horas
	ArrayList<String> horas = new ArrayList<String>();


	public ListasCine() {
		crearSalaPrincipal(listaReservas1);
		crearSalaPrincipal(listaReservas2);
		crearSalaPrincipal(listaReservas3);
		crearSalaPrincipal(listaReservas4);
		crearSalaPrincipal(listaReservas5);
		crearSalaPrincipal(listaReservas6);
		crearSalaPrincipal(listaReservas7);
		crearSalaPrincipal(listaReservas8);
		crearSalaPrincipal(listaReservas9);
		crearSalaPrincipal(listaReservas10);
		crearSalaPrincipal(listaReservas11);
		crearSalaPrincipal(listaReservas12);
		crearSalaPrincipal(listaReservas13);
		crearSalaPrincipal(listaReservas14);
		crearSalaPrincipal(listaReservas15);
		crearSalaPrincipal(listaReservas16);
		crearSalaPrincipal(listaReservas17);
		crearSalaPrincipal(listaReservas18);
		crearSalaPrincipal(listaReservas19);
		crearSalaPrincipal(listaReservas20);
		crearSalaPrincipal(listaReservas21);
		crearSalaPrincipal(listaReservas22);
		crearSalaPrincipal(listaReservas23);
		crearSalaPrincipal(listaReservas24);
		crearSalaPrincipal(listaReservas25);
		crearSalaPrincipal(listaReservas26);
		crearSalaPrincipal(listaReservas27);
		crearSalaPrincipal(listaReservas28);
		crearSalaPrincipal(listaReservas29);
		crearSalaPrincipal(listaReservas30);
		crearSalaPrincipal(listaReservas31);
		crearSalaPrincipal(listaReservas32);
		crearSalaPrincipal(listaReservas33);
		crearSalaPrincipal(listaReservas34);
		crearSalaPrincipal(listaReservas35);
		crearSalaPrincipal(listaReservas36);
		crearSalaPrincipal(listaReservas37);
		crearSalaPrincipal(listaReservas38);
		crearSalaPrincipal(listaReservas39);
		crearSalaPrincipal(listaReservas40);
	}

	// PINTAR SALA
	public void crearSalaPrincipal(List<Reserva> listaAux) {
		for (int i = 0; i < 40; i++) {
			// Reserva sillon = new Reserva(1,i, "1", "1", "1", 0, 1, true);
			Reserva sillon = crearSillon(i);
			listaAux.add(sillon);
			int posicion = i;
			sillon.getBoton().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.out.println("Tamaño lista aux " + listaAux.size());
					// hay que llamar a una funcion con el objeto listas
					System.out.println("Posicion = " + posicion);
					pintarAsiento(listaAux, posicion);
					// listas.pintarAsiento(sillonAux);
					System.out.println(listaAux);
				}
			});
		}
	}

	// crear sillon
	public Reserva crearSillon(int i) {
		Reserva sillon = new Reserva(1, i, "1", "1", "1", 0, 1, true);
		return sillon;
	}

	// Utilizamos esta clase para pintar el asiento segun el estado en que se
	// encuentra
	public void pintarAsiento(List<Reserva> listaAux, int i) {

		System.out.println("pintando asiento");
		System.out.println("Tamaño lista principal " + listaReservas1.size());

		Reserva sillonAux = listaAux.get(i);

		if (listaAux.get(i).isReserva()) {
			System.out.println("PINTA OCUPADO el asiento: "+i);
			sillonAux.getBoton().setIcon(new ImageIcon(MainCine.class.getResource("/imagenesAsientos/ocupado16.png")));
			sillonAux.setReserva(false);
		} else {
			System.out.println("PINTA LIBRE el asiento: "+i);
			sillonAux.getBoton().setIcon(new ImageIcon(MainCine.class.getResource("/imagenesAsientos/libre16.png")));
			sillonAux.setReserva(true);
		}
		// System.out.println("Valores de la lista" + listaAux);
	}
}