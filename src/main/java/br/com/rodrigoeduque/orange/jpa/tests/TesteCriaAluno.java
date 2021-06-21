package br.com.rodrigoeduque.orange.jpa.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCriaAluno {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alunos");
		EntityManager createEntityManager = emf.createEntityManager();
		emf.close();
	}

}
