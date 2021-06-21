package br.com.rodrigoeduque.orange.jpa.tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.rodrigoeduque.orange.jpa.modelo.AvaliacaoCognitive;

public class TestandoConsultas {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT ac FROM AvaliacaoCognitive ac where ac.aluno.id = 3";
		
		Query query = em.createQuery(jpql);
		
		List<AvaliacaoCognitive> resultList = query.getResultList();
		
		for (AvaliacaoCognitive avaliacaoCognitive : resultList) {
			System.out.println("Nome Aluno: " + avaliacaoCognitive.getAluno().getNome());
			System.out.println("Resposta: " + avaliacaoCognitive.getResposta());
			
		}
		

		
	}

}
