package estructuras;

public class Hijo extends LaMadre {
	
	public int edad = 20;
	public double estadoSalud = 32.5; //0 es malo 

	@Override
	public void  caminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean muerta() {
		// TODO Auto-generated method stub
		return edad < limiteEdad ? false : true;
	}

	@Override
	public boolean muerta(String enfermedad) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean muerta(char fase_enfermedad) {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSalud() {
		// TODO Auto-generated method stub
		return 0;
	}
	
public static void main(String[] args) {
		
		Hijo pedro = new Hijo();
		
		pedro.muerta();
		
		Enfermedad en = new Enfermedad();
		System.out.println(en.contagioso(pedro));
	}

}
