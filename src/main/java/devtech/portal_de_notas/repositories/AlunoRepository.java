package devtech.portal_de_notas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import devtech.portal_de_notas.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
}
