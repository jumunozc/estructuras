package estructuras;

public abstract class LaMadre {

	public final  int limiteEdad = 100;

	public abstract void caminar();
	
	public abstract boolean muerta();
	
	public abstract boolean muerta(String enfermedad);

	public abstract boolean muerta(char fase_enfermedad);
	
	public abstract int getEdad();
	
	public abstract double getSalud();



}
