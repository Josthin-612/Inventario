package bll;
import java.io.File;
import java.util.Scanner;

import dal.ProductoFile;
import dol.InfoProducto;

public class ProductoBll {
	private InfoProducto producto;
	private ProductoFile file;
	Scanner scan = new Scanner(System.in);
	
	public ProductoBll()
	{
		file = new ProductoFile();
	}
	public void setProductoData(InfoProducto c)
	{
		producto = c;
		file = new ProductoFile();
	}
	public void guardar(String path)
	{
		File miRuta = new File(path);
		if(miRuta!=null) {
			file.guardar(miRuta, producto);
		}
	}
	public String getFormattedInfo() {
		String formattedInfo;
		formattedInfo = "+________________________________________+\n";
		formattedInfo +="|   Nombre   |   Cantidad  |  Precio Unitario   |   Total \n";
		formattedInfo += String.format("%20s%4.2d%10.2d%10.2d%n", producto.getNombreProducto(), producto.getCantidad(), producto.getPrecioUnitario(), producto.getTotal());
		formattedInfo += "+_______________________________________+\n";
		return formattedInfo;
			
	}
}