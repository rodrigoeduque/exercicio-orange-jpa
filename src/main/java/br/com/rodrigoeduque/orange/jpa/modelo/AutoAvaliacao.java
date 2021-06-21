package br.com.rodrigoeduque.orange.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_autoavaliacao")
public class AutoAvaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Byte nota;

	@OneToOne
	private AvaliacaoCognitive avaliacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Byte getNota() {
		return nota;
	}

	public void setNota(Byte nota) {
		this.nota = nota;
	}

	public AvaliacaoCognitive getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(AvaliacaoCognitive avaliacao) {
		this.avaliacao = avaliacao;
	}

}
