package gui;

import java.util.Scanner;

import bll.ProductoBll;
import dol.InfoProducto;
//import util.Validaciones;

public class InfoProductoGui {
	Scanner scan = new Scanner(System.in);	
	public void pedirDatos()
	{	
		InfoProducto producto = new InfoProducto();
		System.out.println("Ingrese el nombre del producto");
		producto.setNombreProducto(scan.nextLine());
		System.out.println("cantidad de ingresos/Monto recibido");
		producto.setCantidad (scan.nextInt());
		System.out.println("Precio Unitario");
		producto.setPrecioUnitario(scan.nextDouble());
		System.out.println("Total a recibir en moneda Local");
		producto.setTotal(scan.nextDouble());
		
		
			
		// ** se envia a guardar el setContactoData la informacion del contacto **
		ProductoBll cb= new ProductoBll();
		cb.setProductoData(producto);
		System.out.print(cb.getFormattedInfo());
		System.out.println("Indica la ruta donde guardar el archivo");
		cb.guardar(scan.next());	
		System.out.println("Contacto guardado con exito");
	}
	public void MenuPrincipal()
	{
	    System.out.println("***    Bienvenido al Menu Principal   ***");
		System.out.println("***    BIENVENIDO AL MENU PRINCIPAL   ***");
		System.out.println("***  1.          Inventario              ***");
		System.out.println("***  2.           Venta                  ***");
		System.out.println("***  3.           Salir                  ***");
		System.out.println("*** Ingrese una opcion  para continuar ***   ");
	}
}
