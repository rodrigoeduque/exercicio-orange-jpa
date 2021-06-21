package br.com.rodrigoeduque.orange.jpa.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rodrigoeduque.orange.jpa.modelo.Aluno;

public class CriaAluno {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos");
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Rodrigo Duque");
		aluno.setEmail("rodrigo.duque@zup.com.br");
		aluno.setIdade((byte) 50);
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();


	}
}
