package devtech.portal_de_notas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devtech.portal_de_notas.model.Aluno;
import devtech.portal_de_notas.model.Curso;
import devtech.portal_de_notas.repositories.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository aluno;
	
	@RequestMapping("/recupera")
	public ResponseEntity<?> recupera(){
		return ResponseEntity.ok(aluno.findAll());	
	}
	
	@RequestMapping("/recupera/{id}")
	public ResponseEntity<?> recupera(@PathVariable("id") Long id){
		return ResponseEntity.ok(aluno.findOne(id));
	}
	
	@RequestMapping("/remove/{id}")
	public ResponseEntity<?> remove(@PathVariable("id") Long id){
		aluno.delete(id);
		return ResponseEntity.ok("Aluno deletado com sucesso");
	}
	
	@RequestMapping("/insere/{idAluno}/{idCurso}/{nome}")
	public ResponseEntity<?> insere(@PathVariable("idAluno") Integer idAluno, 
									@PathVariable("idCurso") Integer idCurso,
									@PathVariable("nome") String nome){
		Curso c = new Curso();
		c.setCodigoCurso(idCurso);
		Aluno a = new Aluno(idAluno, "Marcus", c);
		return ResponseEntity.ok(aluno.save(a));
	}
}
