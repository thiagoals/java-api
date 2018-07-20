package devtech.portal_de_notas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devtech.portal_de_notas.model.Curso;
import devtech.portal_de_notas.repositories.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {
	
	@Autowired
	private CursoRepository curso;
	
	@RequestMapping("/recupera")
	public ResponseEntity<?> recupera(){
		return ResponseEntity.ok(this.curso.findAll());
	}
	
	@RequestMapping("/recupera/{id}")
	public ResponseEntity<?> recupera(@PathVariable("id") Long id){
		return ResponseEntity.ok(this.curso.findOne(id));
	}
	
	@RequestMapping("/remove/{id}")
	public ResponseEntity<?> remove(@PathVariable("id") Long id){
		curso.delete(id);
		return ResponseEntity.ok("Curso deletado com sucesso");
	}
	
	@RequestMapping("/insere/{id}/{nome}")
	public ResponseEntity<?> insere(@PathVariable("id") Integer id, @PathVariable("nome") String nome){
		Curso c = new Curso(id,nome);
		return ResponseEntity.ok(this.curso.save(c));
	}
}
