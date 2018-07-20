package devtech.portal_de_notas.configuration;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import devtech.portal_de_notas.model.Curso;
import devtech.portal_de_notas.repositories.AlunoRepository;
import devtech.portal_de_notas.repositories.CursoRepository;

@Component
public class HibernateConfiguration {
	
	@Autowired
	private CursoRepository curso;
	
	@Autowired
	private AlunoRepository aluno;

	@PostConstruct
	public void init(){
		this.curso.save(new Curso(1, "Sistemas de informação"));
		this.curso.save(new Curso(2, "Engenharia Civil"));
		this.curso.save(new Curso(3, "Direito"));
	}
}
