package estructuras;

public class Enfermedad {
	
	public Enfermedad() {
	}
	
	public boolean contagioso(LaMadre persona){
		
		double causa = persona.getSalud() * (persona.getEdad()*0.001);		
		return causa < 0.5 ? false : true;
	}

}
