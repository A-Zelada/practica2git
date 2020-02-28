
public class Factura 
{

	public int num;
	public float base;
	public float tipoIva;
	//public Estados estado;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		IFactura factura = new IFactura();
		float base = 0;
		System.out.println("Facturas:");
		System.out.println("Nueva factura:");
		System.out.print("Introducir Base: ");//
		base = (float)
				input.nextFloat()
				;
		System.out.print("Introducir IVA: ");
		factura.setCantidadIva(
				(float)
				input.nextFloat()
				);
		
		factura.setTotal(base + base*factura.getCantidadIva()/100 );

		System.out.println(factura.toString());

		input.close();
	}

	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) 
	{
		this.num = num;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) 
	{
		this.base = base;
	}

	public float getTipoIva() 
	{
		return tipoIva;
	}

	public void setTipoIva(float tipoIva) 
	{
		this.tipoIva = tipoIva;
	}
}
