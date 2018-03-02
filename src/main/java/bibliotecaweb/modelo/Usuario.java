package bibliotecaweb.modelo;

public class Usuario {
	private String nome;

	private String matricula;
	
	private String empresa;

	public Usuario(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

}
