package caio2020_09_15.forum20200915;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnimaisEstimacao {
	@Id
	private String id;
	private String nome;

	public AnimaisEstimacao() {
		this.id = UUID.randomUUID().toString();
	}

	public AnimaisEstimacao(String nome) {
		this();
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
