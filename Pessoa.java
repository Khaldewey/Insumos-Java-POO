
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
* <h1>Pessoa</h1>
* A classe pessoa abstrai os principais atributos de uma pessoa
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Israel Alves
* @version 1.0
* @since   01/12/2023
*/
public class Pessoa {
	private String nome;
	private int idade; 
	private String genero;
	final LocalDate now = LocalDate.now();
	private LocalDate data;
	public DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	private String dataString ;

	
	 /**
	   * Este método é utilizado para contruir um objeto do tipo Pessoa
	   * @param nome este é o primeiro parâmetro do método
	   * @param genero este é o segundo parâmetro do método
	   * @param dataString este é o terceiro parâmetro do método
	   * @return não tem retorno
	   */
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
