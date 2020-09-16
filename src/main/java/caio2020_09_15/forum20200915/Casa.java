package caio2020_09_15.forum20200915;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Casa {
	@Id
	private String id;
	private String nome;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "casa_id")
	private List<Morador> moradores = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "casa_id")
	private List<AnimaisEstimacao> animaisEstimacao = new ArrayList<>();

	@OneToOne
	@JoinColumn(name = "morador_principal_id", table = "casa")
	private Morador moradorPrincipal;

	public Casa() {
		this.id = UUID.randomUUID().toString();
	}

	public Casa(String nome) {
		this();
		this.nome = nome;
	}

	public void addAnimalEstimacao(AnimaisEstimacao novo) {
		this.animaisEstimacao.add(novo);
	}

	public String getNome() {
		return nome;
	}

	public void addMorador(Morador novo) {
		this.moradores.add(novo);
	}

	public String getId() {
		return id;
	}

	public void setMoradorPrincipal(Morador portaPrincipal) {
		this.moradorPrincipal = portaPrincipal;
	}

	public Morador getMoradorPrincipal() {
		return moradorPrincipal;
	}
}