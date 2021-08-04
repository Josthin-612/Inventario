package dol;
import java.io.Serializable;

public class InfoProducto implements Serializable
{
	/**
	 *  Author: Examen I Parcial 
	 *  Grupo Promecys II - Aldo, Justhin, Camilo.
	 */
	private static final long serialVersionUID = 1L;
	private String nombreProducto;
	private int cantidad;
	private double precioUnitario;
	private double Total;
	
	public InfoProducto()
	{
		super();
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	@Override
	public String toString() {
		return "InfoProducto [nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", precioUnitario="
				+ precioUnitario + ", Total=" + Total + "]";
	}

	public InfoProducto(String nombreProducto, int cantidad, double precioUnitario, double total) {
		
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		Total = total;
	}
	
	}
