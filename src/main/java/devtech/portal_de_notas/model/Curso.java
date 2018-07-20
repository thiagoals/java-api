package devtech.portal_de_notas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CURSO")
public class Curso {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="CODIGOCURSO")
	private Integer codigoCurso;

	@Column(name="NOME")
	private String nome;

	public Curso(Integer codigoCurso, String nome) {
		this.codigoCurso = codigoCurso;
		this.nome = nome;
	}
	
	public Curso(){
		
	}

	public Integer getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
