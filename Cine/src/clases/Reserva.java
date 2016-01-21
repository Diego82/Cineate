package clases;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import salacine.InicioCine;

public class Reserva {

	//Atributos
	private int sala;
	private int id_pase;
	private String fecha;
	private String hora;
	private String nombre_sala;
	private int fila;
	private int columna;
	private boolean reserva;
	
	private JButton boton;
	private JRadioButton radioBoton;
	
	/**
	 * @param id_pase
	 * @param fecha
	 * @param hora
	 * @param nombre_sala
	 * @param fila
	 * @param columna
	 * @param reserva
	 */
	public Reserva(int sala,int id_pase, String fecha, String hora, String nombre_sala, int fila, int columna, boolean reserva) {
		this.sala=sala;
		this.id_pase = id_pase;
		this.fecha = fecha;
		this.hora = hora;
		this.nombre_sala = nombre_sala;
		this.fila = fila;
		this.columna = columna;
		this.reserva = reserva;
		boton=new JButton("");
		boton.setIcon(new ImageIcon(InicioCine.class.getResource("/imagenesAsientos/libre16.png")));
		boton.setOpaque(false);
		boton.setContentAreaFilled(false);
		boton.setBorderPainted(false);
		boton.setBorder(null);
		//System.out.println("diegui");
		radioBoton=new JRadioButton("");

		radioBoton.setForeground(Color.WHITE);
		radioBoton.setFont(new Font("Tahoma", Font.BOLD, 13));
		radioBoton.setBackground(new Color(23, 32, 44));
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public JRadioButton getRadioBoton() {
		return radioBoton;
	}
	public void setRadioBoton(JRadioButton radioBoton) {
		this.radioBoton = radioBoton;
	}
	public Reserva(){
	}
	public int getId_pase() {
		return id_pase;
	}
	public void setId_pase(int id_pase) {
		this.id_pase = id_pase;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getNombre_sala() {
		return nombre_sala;
	}
	public void setNombre_sala(String nombre_sala) {
		this.nombre_sala = nombre_sala;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public JButton getBoton() {
		return boton;
	}
	public void setBoton(JButton boton) {
		this.boton = boton;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public boolean isReserva() {
		return reserva;
	}
	public void setReserva(boolean reserva) {
		this.reserva = reserva;
	}
	/*@Override
	public String toString() {
		return "Pase [id_pase=" + id_pase + ", fecha=" + fecha + ", hora=" + hora + ", nombre_sala=" + nombre_sala
				+ ", fila=" + fila + ", columna=" + columna + ", reserva=" + reserva + "]";
	}*/	
}