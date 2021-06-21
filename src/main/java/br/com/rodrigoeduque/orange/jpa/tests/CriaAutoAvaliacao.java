package br.com.rodrigoeduque.orange.jpa.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rodrigoeduque.orange.jpa.modelo.Aluno;
import br.com.rodrigoeduque.orange.jpa.modelo.AutoAvaliacao;
import br.com.rodrigoeduque.orange.jpa.modelo.Avaliacao;
import br.com.rodrigoeduque.orange.jpa.modelo.AvaliacaoCognitive;

public class CriaAutoAvaliacao {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos");
		EntityManager em = emf.createEntityManager();

		AvaliacaoCognitive avaliacaoCognitive = em.find(AvaliacaoCognitive.class, 1L);
		
		AutoAvaliacao autoAvaliacao = new AutoAvaliacao();
		autoAvaliacao.setNota((byte) 10);
		autoAvaliacao.setAvaliacao(avaliacaoCognitive);
		
		
		
		
		em.getTransaction().begin();
		em.persist(autoAvaliacao);
		em.getTransaction().commit();
		em.close();


	}
}
