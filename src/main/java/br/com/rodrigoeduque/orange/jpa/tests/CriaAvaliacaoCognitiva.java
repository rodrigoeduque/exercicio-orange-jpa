package br.com.rodrigoeduque.orange.jpa.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.rodrigoeduque.orange.jpa.modelo.Aluno;
import br.com.rodrigoeduque.orange.jpa.modelo.Avaliacao;
import br.com.rodrigoeduque.orange.jpa.modelo.AvaliacaoCognitive;

public class CriaAvaliacaoCognitiva {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos");
		
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Francis Castle");
		aluno.setEmail("punisher@zup.com.br");
		aluno.setIdade((byte) 40);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.setTitulo("Curso | Introdução ao SQL com MySQL");
		avaliacao.setDescricao("Manipule e consulte dados");
		
		
		AvaliacaoCognitive avaliacaoCognitive = new AvaliacaoCognitive();
		
		avaliacaoCognitive.setAluno(aluno);
		avaliacaoCognitive.setResposta("Lorem ipsum dolor sit amet, consectetur "
				+ "adipiscing elit. Fusce eget mi cursus, sollicitudin dui vitae, luctus augue. Proin quis mauris sed nisl ultricies sagittis. Proin sed semper neque. Nunc eget ipsum quis metus elementum placerat. Morbi finibus nisl urna, nec finibus "
				+ "massa lobortis quis. Morbi consectetur lectus molestie, dignissim nibh nec, volutpat enim. Praesent ut arcu eget arcu elementum vestibulum.");
		avaliacaoCognitive.setAvaliacao(avaliacao);

		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.persist(avaliacao);
		em.persist(avaliacaoCognitive);
		em.getTransaction().commit();
		em.close();


	}
}
