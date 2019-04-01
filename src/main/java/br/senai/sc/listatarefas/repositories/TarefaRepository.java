package br.senai.sc.listatarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senai.sc.listatarefas.domain.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer>{

}
