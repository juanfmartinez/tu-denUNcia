package PROYECTOFINAL;
import java.util.*;

public class persona {
	
	
	
		
		//ATRIBUTOS
		
		String nombre;
		int cedula;
		String fecha;
		String tipoDenuncia;
		String edad;
		String ciudad;
		String descripcion;
		
		public void setNombre (String nombre) {
			this.nombre=nombre;
		}
		public String getNombre(String nombre) {
			return nombre;
		}
		
		
		
		public void setCedula(int cedula) {
			this.cedula = cedula;
		}
		public int getCedula(int cedula) {
			return cedula;
		}
		
		
		public void setTipoDenuncia( String tipoDenuncia) {
			this.tipoDenuncia = tipoDenuncia;
		}
		public String getTipoDenuncia(String tipoDenuncia) {
			return tipoDenuncia;
		}
		
		
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		
		public Date getFecha(String fecha) {                       //
			/*String fecha = "02-11-2021"; 2021-11-02
			System.out.println("d�a: " + fecha.substring(0, 2)); // d�a
			System.out.println("mes: " + fecha.substring(3, 5));// mes
			System.out.println("a�o: " + fecha.substring(6));// a�o */
			int a�o =Integer.parseInt(fecha.substring(0,4));
			int mesnum = Integer.parseInt(fecha.substring(5,7));
			int d�a =Integer.parseInt(fecha.substring(8));
			
			int mes =mesnum-1; 
			
			return new Date(a�o,mes,d�a);
		}	
		
		public void setEdad(String edad) {
			this.edad = edad;
		}
		public String getEdad(String edad) {
			return edad;
		}
		
		public void setCiudad (String ciudad) {
			this.ciudad=ciudad;
		}
		public String getCiudad(String ciudad) {
			return ciudad;
		}
		
		public void setDescripcion (String descripcion) {
			this.descripcion=descripcion;
		}
		public String getDescripcion(String descripcion) {
			return descripcion;
		}
		
		public Date convertir_fecha(String fecha) {
			return new Date();
		}
		
		
		
	}

