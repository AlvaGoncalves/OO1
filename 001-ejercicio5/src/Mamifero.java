import java.time.LocalDateTime;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDateTime fecha;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloMaterno;
	private Mamifero abuelaMaterna;
	private Mamifero abueloPaterno;
	private Mamifero abuelaPaterna;
	
	
	public Mamifero(String unId, String unaEsp, LocalDateTime unaF, Mamifero P, Mamifero M, Mamifero abueloM, Mamifero abuelaM
			, Mamifero abueloP, Mamifero abuelaP) {
		identificador = unId;
		especie = unaEsp;
		fecha = unaF;
		padre = P;
		madre = M;
		abueloMaterno = abueloM;
		abuelaMaterna = abuelaM;
		abueloPaterno = abueloP;
		abuelaPaterna = abuelaP;
	}
	
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		return abueloMaterno;
	}
	public void setAbueloMaterno(Mamifero abueloMaterno) {
		this.abueloMaterno = abueloMaterno;
	}
	public Mamifero getAbuelaMaterna() {
		return abuelaMaterna;
	}
	public void setAbuelaMaterna(Mamifero abuelaMaterna) {
		this.abuelaMaterna = abuelaMaterna;
	}
	public Mamifero getAbueloPaterno() {
		return abueloPaterno;
	}
	public void setAbueloPaterno(Mamifero abueloPaterno) {
		this.abueloPaterno = abueloPaterno;
	}
	public Mamifero getAbuelaPaterna() {
		return abuelaPaterna;
	}
	public void setAbuelaPaterna(Mamifero abuelaPaterna) {
		this.abuelaPaterna = abuelaPaterna;
	}

	private boolean esMaterno(Mamifero m) {
		return this.getAbuelaMaterna().equals(m) || this.getAbueloMaterno().equals(m) || this.getMadre().equals(m);
	}
	
	private boolean esPaterno(Mamifero m) {
		return this.getAbuelaPaterna().equals(m) || this.getAbueloPaterno().equals(m) || this.getPadre().equals(m);
	}
	
	public boolean tieneComoAncestroA(Mamifero m) {
		return this.esMaterno(m) || this.esPaterno(m);
	}
	
}
