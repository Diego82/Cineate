package salacine;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CrearTicket {
	private static Image foto;
	private static String butacas;
	private static int identificadorTicket=0;
	public static void main(String[] args) {
		identificadorTicket++;
		/*POSICION 0: CARTEL PELICULA
		POSICION 1 : TITULO PELICULA
		POSICION 2: SESION
		POSICION 3: DIA/HORA
		POSICION 4: HILO
		POSICION 5 EN ADELANTE: ASIENTOS RESERVADOS*/
		
		
		// Se crea el documento
		Document documento = new Document();

		// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
		FileOutputStream ficheroPdf = null;
		try {
			ficheroPdf = new FileOutputStream("fichero.pdf");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * Se asocia el documento al OutputStream y se indica que el espaciado
		 * entre lineas sera de 20. Esto debe hacerse antes de abrir el
		 * documento
		 */

		try {
			PdfWriter.getInstance(documento, ficheroPdf).setInitialLeading(20);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Se abre el documento.
		documento.open();

		try {
			
			documento.add(new Paragraph("Ticket nº: "+identificadorTicket));
			documento.add(new Paragraph(" "));
			/*documento.add(new Paragraph("PELICULA: OCHO APELLIDOS CATALANES \n" + "HORA: 16:00 H \n" + "BUTACA: 2",
					FontFactory.getFont("arial", // fuente
							22, // tamaño
							Font.ITALIC, // estilo
							BaseColor.CYAN))); // color*/
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Se inserta una imagen

		try {
			GeneradorQR.main();
			foto = Image.getInstance("qrZxing.png");
			foto.scaleToFit(80, 80);

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * //Se inserta una tabla de 4 columnas PdfPTable tabla = new
		 * PdfPTable(4); for (int i = 0; i < 15; i++) { tabla.addCell("celda " +
		 * i); }
		 */

		// creamos una tabla con 4 columnas
		PdfPTable mitablacompleja = new PdfPTable(4);

		// añadimos texto con formato a la primera celda
		PdfPCell celda = new PdfPCell(foto);

		// combinamos la columna con 5 filas

		celda.setRowspan(6);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		// alineamos el contenido al centro

		// añadimos un espaciado
		celda.setPadding(12.0f);
		// colocamos un color de fondo
		// celda.setBackgroundColor(BaseColor.WHITE);
		// se añade a la tabla
		mitablacompleja.addCell(celda);

		// fila 2
		celda = new PdfPCell(new Paragraph("Pelicula: "+ListasCine.listaDatosQR.get(1),
				FontFactory.getFont("arial", 
						10, 
						Font.BOLDITALIC,// 
						BaseColor.BLUE))); // color
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		celda.setColspan(3);

		mitablacompleja.addCell(celda);
		// FILA 3
		celda = new PdfPCell(new Paragraph("Lugar: MULTICINES CINEA-T",
				FontFactory.getFont("arial",
						10, 
						Font.BOLDITALIC,// 
						BaseColor.BLUE))); // color
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		// fila 4
		celda = new PdfPCell(new Paragraph("Sesion: "+ListasCine.listaDatosQR.get(2),
				FontFactory.getFont("arial", 
						10, 
						Font.BOLDITALIC,// 
						BaseColor.BLUE))); // color
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		// fila 5
		celda = new PdfPCell(new Paragraph("Fecha de compra: "+ListasCine.listaDatosQR.get(3),
				FontFactory.getFont("arial",
						10, 
						Font.BOLDITALIC,// 
						BaseColor.BLUE))); // color
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		// fila 6
		
		butacas="Butacas Reservadas: ";
		
		
		for(int i=5;i<=ListasCine.listaDatosQR.size()-1;i++){
			butacas+=1+(Integer.parseInt(ListasCine.listaDatosQR.get(i).toString()))+", ";
		}
		
		butacas=butacas.substring(0, butacas.length()-2);
		
		
		celda = new PdfPCell(new Paragraph(butacas,
				FontFactory.getFont("arial", 
						10, 
						Font.BOLDITALIC,// 
						BaseColor.BLUE))); // color
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		butacas="";
		
		/*
		 * celda = new PdfPCell(new Paragraph("Eximido"));
		 * celda.setBackgroundColor(BaseColor.LIGHT_GRAY);
		 * mitablacompleja.addCell(celda);
		 */

		// fila 7
		celda = new PdfPCell(new Paragraph("Comprador: "+ListasCine.listaDatosQR.get(4),
				FontFactory.getFont("arial", 
						10, 
						Font.BOLDITALIC,// 
						BaseColor.BLUE))); // color
		celda.setColspan(3);
		celda.setBorderColor(BaseColor.LIGHT_GRAY);
		celda.setBorderWidth(1.0f);
		mitablacompleja.addCell(celda);

		try {
			// documento.add(tabla);
			documento.add(mitablacompleja);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		documento.close();
		
		ListasCine.listaDatosQR.clear();
		
		Desktop d = Desktop.getDesktop();
	    try {
			d.open(new File("fichero.pdf"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
