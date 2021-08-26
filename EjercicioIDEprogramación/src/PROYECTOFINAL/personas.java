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
	public String derecho;
	public String code;
	
	public String getCode(int cedula, String fecha, String derecho) {
		String Cedula = String.valueOf(cedula);
		String Fecha = fecha.substring(fecha.length()-2);
		if(derecho.length()==1) {
			derecho = "0".concat(derecho);
		}
		
		
		String code = "UN" + Cedula + "" + Fecha + "" + derecho;
		
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
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
	
	
	public void setContacto (String contacto) {
		this.contacto=contacto;
	}
	public String getContacto(String contacto) {
		return contacto;
		
	}
	public void setderecho (String derecho) {
		this.derecho=derecho;
	}
	public String getderecho(String derecho) {
		return derecho;
		
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
	
	public static boolean ValidarMail(String email) {
		// Patron para validar el email
		Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");

		Matcher mather = pattern.matcher(email);
		return mather.find();
	}
}


