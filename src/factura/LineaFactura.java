
/**
 * Genera las líneas de factura
 * 
 * @author Pedro (del java doc)
 * @version 1.0
 */
package factura;

/**
 * Clase <b>LineaFactura</b>
 */
public class LineaFactura {

	public String id_producto; // identificador (codigo) del producto
	public String nombre_producto; // nombre del producto
	public float precio; // precio por una unidad del producto
	public float cantidad; // cantidad de unidades compradas
	public float descuento; // descuento de la unidad (no se esta utilizando)

	/**
	 * @param id_producto
	 *            Identificación del producto
	 * @param nombre_producto
	 *            Nombre del producto
	 * @param precio
	 *            Precio por unidad del producto
	 * @param cantidad
	 *            Cantidad de unidades compradas
	 * @param descuento
	 *            Descuento de la unidad (no se está utilizando)
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}

	/**
	 * Genera la cadena de la línea de factura
	 * 
	 * @Override
	 */
	public String toString() {
		return "\n\tLineaFactura [" + "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto + ", precio=" + precio
				+ ", cantidad=" + cantidad + ", descuento=" + descuento + "]";
	}

	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la
	 * cantidad de productos pedidos de esa unidad
	 * 
	 * @param total
	 *            Total del precio por la cantidad
	 * @return total Total de precio por cantidad
	 */
	public float getTotal() {
		float total = this.precio * this.cantidad;
		return total;
	}

}