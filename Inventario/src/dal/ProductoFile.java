package dal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import dol.InfoProducto;

public class ProductoFile {
	public void guardar(File file, InfoProducto ic)
	{
		if (file!=null)
		{
			try 
			{
				ObjectOutputStream e = new ObjectOutputStream(new FileOutputStream(file));
				e.writeObject(ic);
				e.close();
			}
			catch(IOException e)
			{
				e.getMessage();
				System.out.println("Ocurrio un error al guardar, OOS ln 28");
			}
		}
	}
}
