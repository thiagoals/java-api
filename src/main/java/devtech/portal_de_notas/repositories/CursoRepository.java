package devtech.portal_de_notas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devtech.portal_de_notas.model.Curso;

public interface CursoRepository extends  JpaRepository<Curso, Long>{
}
