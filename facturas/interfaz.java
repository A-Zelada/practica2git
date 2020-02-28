package facturas;

import java.util.Scanner;

public class interfaz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IFactura factura = new IFactura();
		float base = 0;
		System.out.println("Facturas:");
		System.out.println("Nueva factura:");
		System.out.print("Introducir Base: ");
		base = (float)14.55
//				input.nextFloat()
				;
		System.out.print("Introducir IVA: ");
		factura.setCantidadIva(
				(float)1.45
				//input.nextFloat()
				);
		
		factura.setTotal(base + base*factura.getCantidadIva()/100 );

		System.out.println(factura.toString());

		input.close();
	}

}
