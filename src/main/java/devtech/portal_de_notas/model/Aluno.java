package devtech.portal_de_notas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ALUNO")
public class Aluno {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="CODIGOALUNO")
	private Integer codigoAluno;
	
	@ManyToOne(targetEntity=Curso.class)
	@JoinColumn(name="CODIGOCURSO", referencedColumnName="CODIGOCURSO")
	private Curso codigoCurso;
	
	@Column(name="NOME")
	private String nome;

	public Aluno(Integer codigoAluno, String nome, Curso codigoCurso) {
		this.codigoAluno = codigoAluno;
		this.nome = nome;
		this.codigoCurso = codigoCurso;
	}
	
	public Aluno(){
		
	}

	public Integer getCodigoAluno() {
		return codigoAluno;
	}

	public void setCodigoAluno(Integer codigoAluno) {
		this.codigoAluno = codigoAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Curso codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
}
