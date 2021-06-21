package br.com.rodrigoeduque.orange.jpa.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rodrigoeduque.orange.jpa.modelo.Aluno;
import br.com.rodrigoeduque.orange.jpa.modelo.Avaliacao;

public class CriaAvaliacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos");
		

		Avaliacao avaliacao = new Avaliacao();
		
		avaliacao.setTitulo("Curso | Spring");
		avaliacao.setDescricao("Criando aplicações API REST");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(avaliacao);
		em.getTransaction().commit();


	}
}
