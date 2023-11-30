
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa {
	private String nome;
	private int idade; 
	private String genero;
	final LocalDate now = LocalDate.now();
	private LocalDate data;
	public DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	private String dataString ;

	
	public Pessoa(String nome, String genero, String dataString) {
		
		this.nome = nome;
		this.genero = genero;
		this.dataString = dataString;
		this.data = LocalDate.parse(dataString, parser);
		this.idade = Period.between(this.data, now).getYears();
	}
	
	public void now() {
		System.out.println(now);
	} 
	
	public void dataNascimento() {
		System.out.println(this.getDataString());
	}
	
	public void idade() {
		System.out.println(this.getIdade());
	}
	
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDataString() {
		return dataString;
	}

	public void setDataString(String dataString) {
		this.dataString = dataString;
	}
	
	
	
}
