
public class Funcionario extends Pessoa {
	private String setor;
	private String funcao;
	private float salario;

	public Funcionario(Pessoa pessoa, String setor, String funcao, float salario) {
        super(pessoa.getNome(), pessoa.getGenero(), pessoa.getDataString());
        this.setor = setor;
        this.funcao = funcao;
        this.salario = salario;
	} 
	
	
	public void funcionario() {
		System.out.println("Salário: "+ this.getSalario());
		System.out.println("Função: "+ this.getFuncao());
		System.out.println("Setor: "+ this.getSetor());
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Gênero: " + this.getGenero());
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
