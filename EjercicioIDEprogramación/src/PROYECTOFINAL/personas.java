package PROYECTOFINAL;
import java.util.*;

public class personas {



		//ATRIBUTOS
		
		public String nombre;
		public int cedula;
		public String fecha;
		public String tipoDenuncia;
		public String edad;
		public String ciudad;
		public String descripcion;
		public String contacto;
		public String victimario;
		public String Status;
		
		public void setStatus(String Status) {
			this.Status=Status;
		}
		public String getStatus(String Status) {
			return Status;
		}
		
		public void setVictimario(String victimario) {
			this.victimario=victimario;
		}
		public String getVictimario (String victimario) {
			return victimario;
		}
		
		public void setNombre (String nombre) {
			this.nombre=nombre;
		}
		public String getNombre(String nombre) {
			return nombre;
		}
		
		
		public void setContaco (String contacto) {
			this.contacto=contacto;
		}
		public String getContacto(String contacto) {
			return contacto;
			
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
		
		public Date getFecha(String fecha) {                     
			int año =Integer.parseInt(fecha.substring(0,4));
			int mesnum = Integer.parseInt(fecha.substring(5,7));
			int día =Integer.parseInt(fecha.substring(8));
			
			int mes =mesnum-1; 
			
			return new Date(año,mes,día);
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


