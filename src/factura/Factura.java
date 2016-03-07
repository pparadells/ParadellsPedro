/**
 * Hace facturas y la imprimes
 * 
 * @author Pedro (del java doc)
 * @version 1.0
 * 
 */

package factura;

import java.util.Arrays;

/**
 * Clase <b>Factura</b>
 */
public class Factura {

	public String id_cliente; // Identificador (codigo) del cliente
	public String nombre_cliente; // Nombre del cliente
	public LineaFactura lineas[]; // lista de productos comprados

	/**
	 * @param id_cliente
	 *            Identificación del cliente
	 * @param nombreCliente
	 *            Nombre del cliente
	 * @param lineas
	 *            Tabla de lineas de factura
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	/**
	 * Devuelve el precio total de la Factura, calculado a partir del precio de
	 * cada linea
	 * 
	 * @param precio
	 *            Total de la factura
	 * @return El total de la factura
	 */
	public float getTotal() {
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++) {
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}

	/**
	 * Genera la cadena de factura
	 * 
	 * @Override
	 * @see #Factura(String, String, LineaFactura[])
	 * @see #getTotal()
	 */
	public String toString() {
		return "Factura [" + "id_cliente=" + id_cliente + ", nombre_cliente="
				+ nombre_cliente + ", getTotal()=" + getTotal() + ", lineas="
				+ Arrays.toString(lineas) + "]";
	}

	/**
	 * El método main que crea la factura y la imprime
	 * 
	 * @see #LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento)
	 */
	public static void main(String[] args) {

		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[] {
				new LineaFactura("P100", "Leche", 0.85f, 6, 0),
				new LineaFactura("P200", "Pan", 0.60f, 1, 0),
				new LineaFactura("P150", "Tomate", 0.85f, 2, 0),
				new LineaFactura("P600", "Cafe", 1.2f, 1, 0) };
		Factura factura1 = new Factura("C100", "Antonio Garcia", lineas);

		// Escribir la factura
		System.out.println(factura1);

	}

}

