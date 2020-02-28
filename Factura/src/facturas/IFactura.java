package Factura.src.facturas;

/**
 * @author adrian.caballero
 */
public class IFactura {
	/*
	 * Alumno A: adrian.caballero
	 * 
	 * 1. Crea un proyecto Java con nombre facturas y este súbelo al repositorio
	 * remoto a la rama Master.
	 * 
	 * 2. Crea una rama "alumno A" para trabajar tu.
	 * 
	 * 3. Se te ha encargado crear una interfaz que será implementada por todas las
	 * facturas.
	 * 
	 * 4. Crea un interfaz llamado IFactura.java, con tres métodos:
	 * 
	 * void cambiarEstado(Estados estado); float getTotal(); float getCantidadIva();
	 * 
	 * 5. Crea una clase enumerado llamado Estados.java, que se llame Estados y que
	 * tenga como valores Aprobada, Pendiente y Cobrada.
	 * 
	 * 6. Crea un commit para añadir el enum.
	 * 
	 * 7. Crea un commit para añadir la interfaz.
	 * 
	 * 8. Vuelca el trabajo a la rama Master y borra la rama que has usado.
	 * 
	 * 9. Cuando tengas en tu repositorio la clase Factura que ha implementado tu
	 * compañero, crea una rama para corregir un bug referente a la propiedad estado
	 * de la clase Factura.
	 * 
	 * 10. Corrige el bug: cambia la visibilidad de public a private. Haz un commit
	 * con esta corrección.
	 * 
	 * 11. Vuelca la modificación a la rama Master y borra la rama que has usado.
	 * 
	 * 12. Cuando esté lista la primera puesta en producción mediante la rama
	 * master, bájatela a tu repositorio local.
	 */
	/*
	 * Alumno B
	 * 
	 * 1. Se te ha encargado empezar el esqueleto de la clase Factura. Crea una rama
	 * para ello llamada "Alumno B" a partir de la versión actualizada de Master.
	 * 
	 * 2. Crea un archivo llamado Factura.java para la clase Factura, con los
	 * siguientes miembros además del método main():
	 * 
	 * public int num; public float base; public float tipoIva; public Estados
	 * estado;
	 * 
	 * 3. Comenta la línea de la propiedad "estado", porque aún no está implementado
	 * el enum Estados.
	 * 
	 * 4. Crea un commit con la clase.
	 * 
	 * 5. Vuelca el trabajo a la rama Master y borra la rama que has usado.
	 * 
	 * 6. Cuando tengas la interfaz y el enum (desarrollada por otro compañero) en
	 * tu repositorio local, crea una rama para aplicar los siguientes cambios.
	 * 
	 * 7. Descomenta la línea que comentaste en el punto 5 y haz un commit con esta
	 * modificación.
	 * 
	 * 8. Implementa la interfaz en tu clase Factura (no hace falta que implementes
	 * los métodos, déjalos en blanco).
	 * 
	 * 9. Crea un commit con este último cambio.
	 * 
	 * 10. Corrige un bug: cambia la visibilidad de la propiedad estado a protected.
	 * Haz un commit con esta corrección. Si más adelante hay un conflicto con algún
	 * compañero del equipo, ésta es la visibilidad que tiene que quedarse
	 * definitivamente.
	 * 
	 * 11. Vuelca el trabajo a la rama Master y borra la rama que has usado.
	 * 
	 * 12. Eres el encargado de preparar la primera versión que irá a producción:
	 * 
	 * 13. Añade un tag al último commit de master con la versión 0.1.0.
	 */
	/*
	 * Alumno C
	 * 
	 * 1. Se te ha encargado implementar algunos métodos de la clase Factura y un
	 * enum de estados. Empieza creando una rama llamada "Alumno C" para el enum a
	 * partir de la versión actualizada de Master.
	 * 
	 * 2. Crea un archivo llamado Estados.java para un enum, que se llame Estados y
	 * que tenga como valores Aprobada, Pendiente, Cobrada y Anulada.
	 * 
	 * 3. Si más adelante aparece este mismo enum en la rama de algún compañero del
	 * equipo y hay conflictos, éstos son los cuatro valores definitivos que tienen
	 * que quedar.
	 * 
	 * 4. Crea un commit para añadir el enum.
	 * 
	 * 5. Vuelca el trabajo a la rama Master y borra la rama que has usado.
	 * 
	 * 6. Cuando tus compañeros hayan añadido estos dos métodos a la clase Factura,
	 * impleméntalos:
	 * 
	 * getTotal(); getCantidadIva();
	 * 
	 * 7. Crea un commit con los cambios.
	 * 
	 * 8. Vuelca el trabajo a la rama Master y borra la rama que has usado.
	 * 
	 * 9. Sube los cambios de develop al repositorio remoto.
	 * 
	 * 10. Cuando esté lista la primera puesta en producción mediante la rama
	 * master, bájatela a tu repositorio local.
	 */

	public enum Estados {
		Aprobada, Pendiente, Cobrada,
		/* Anulada */}

	public float total;
	public float cantidadIva;
//	public Estados estado;
//	public int num;
//	public float base;
//	public float tipoIva;
//	public Estados estado;

	/**
	 * @author adrian.caballero
	 * @return the total
	 */
	public float getTotal() {
		return total;
	}

	/**
	 * @author adrian.caballero
	 * @return the cantidadIva
	 */
	public float getCantidadIva() {
		return cantidadIva;
	}

	/**
	 * @author adrian.caballero
	 * @return the num
	 */
//	public int getNum() {return num;}

	/**
	 * @author adrian.caballero
	 * @return the base
	 */
//	public float getBase() {return base;}

	/**
	 * @author adrian.caballero
	 * @return the tipoIva
	 */
//	public float getTipoIva() {return tipoIva;}

	/**
	 * @author adrian.caballero
	 * @return the estado
	 */
//	public Estados getEstado() {return estado;}

	/**
	 * @author adrian.caballero
	 * @param total the total to set
	 */
	public void setTotal(float total) {
		this.total = total;
	}

	/**
	 * @author adrian.caballero
	 * @param cantidadIva the cantidadIva to set
	 */
	public void setCantidadIva(float cantidadIva) {
		this.cantidadIva = cantidadIva;
	}

	/**
	 * @author adrian.caballero
	 * @param num the num to set
	 */
//	public void setNum(int num) {this.num = num;}

	/**
	 * @author adrian.caballero
	 * @param base the base to set
	 */
//	public void setBase(float base) {this.base = base;}

	/**
	 * @author adrian.caballero
	 * @param tipoIva the tipoIva to set
	 */
//	public void setTipoIva(float tipoIva) {this.tipoIva = tipoIva;}

	/**
	 * @author adrian.caballero
	 * @param estado the estado to set
	 */
//	public void cambiarEstado(Estados estado) {this.estado = estado;}

	/**
	 * @author adrian.caballero
	 * @param total
	 * @param cantidadIva
	 * @param num
	 * @param base
	 * @param tipoIva
	 * @param estado
	 */
	public IFactura(float total, float cantidadIva, int num, float base, float tipoIva, Estados estado) {
		this.total = total;
		this.cantidadIva = cantidadIva;
//		this.num = num;
//		this.base = base;
//		this.tipoIva = tipoIva;
//		this.estado = estado;
	}

	/**
	 * @author adrian.caballero
	 * 
	 */
	public IFactura() {
	}

	/**
	 * @author adrian.caballero
	 *
	 */
	@Override
	public String toString() {
		return "factura:\ntotal=" + total + "\ncantidadIva=" + cantidadIva 
//				+ "\nnum=" + num + "\nbase=" + base + "\ntipoIva=" + tipoIva + "\nestado=" + estado 
				+ ".";
	}

//	public static void main(String[] args) {}

}
