package br.com.rodrigoeduque.orange.jpa.tests;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.rodrigoeduque.orange.jpa.modelo.AutoAvaliacao;
import br.com.rodrigoeduque.orange.jpa.modelo.AvaliacaoCognitive;

public class TestandoConsultasAutoCorrecao {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT aa FROM AutoAvaliacao aa where aa.avaliacao.aluno.id = 3";
		
		Query query = em.createQuery(jpql);
		
		List<AutoAvaliacao> resultList = query.getResultList();
		
		
		for (AutoAvaliacao autoAvaliacao : resultList) {
			System.out.println("Nome Aluno: " + autoAvaliacao.getAvaliacao().getAluno().getNome());
			System.out.println("Nota: " + autoAvaliacao.getNota());
		}
		

		
	}

}
