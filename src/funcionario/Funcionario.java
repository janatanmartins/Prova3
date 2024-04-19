package funcionario;

public class Funcionario {
	
	    private String nome;
	    private String cargo;
	    private String habilidades;
	    private int idade;
	    private String sexo;
	    private String endereco;
	    private String cidade;
	    private String estado;

	    public Funcionario() {
			super();
			// TODO Auto-generated constructor stub
		}

		// Construtor
	    public Funcionario(String nome, String cargo, String habilidades, int idade, String sexo, String endereco, String cidade, String estado) {
	        this.nome = nome;
	        this.cargo = cargo;
	        this.habilidades = habilidades;
	        this.idade = idade;
	        this.sexo = sexo;
	        this.endereco = endereco;
	        this.cidade = cidade;
	        this.estado = estado;
	    }

	    // Métodos Get
	    public String getNome() {
	        return nome;
	    }

	    public String getCargo() {
	        return cargo;
	    }

	    public String getHabilidades() {
	        return habilidades;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public String getCidade() {
	        return cidade;
	    }

	    public String getEstado() {
	        return estado;
	    }

	    // Métodos Set
	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public void setCargo(String cargo) {
	        this.cargo = cargo;
	    }

	    public void setHabilidades(String habilidades) {
	        this.habilidades = habilidades;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public void setSexo(String sexo) {
	        this.sexo = sexo;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public void setCidade(String cidade) {
	        this.cidade = cidade;
	    }

	    public void setEstado(String estado) {
	        this.estado = estado;
	    }
	}


