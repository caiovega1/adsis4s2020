package caio2020_09_15.forum20200915;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// uma casa pode ter zero ou um dono  
// uma casa pode ter zero ou varias portas 
// uma casa pode ter zero ou varias janelas

@Service
@Transactional
public class SimplificandoService {
    @Autowired
    private EntityManager em;

	public void testarPersistência() {
        em.createQuery("delete from ").executeUpdate();
        em.createQuery("delete from ").executeUpdate();


        Casa casa = new Casa("Germinada");
        
        Morador morador1 = new Morador("Roberto");
        Morador morador2 = new Morador("Maria");
        
        AnimaisEstimacao animal1 = new AnimaisEstimacao ("Gato filos");
        AnimaisEstimacao animal2 = new AnimaisEstimacao ("Gato Miautricos");
   

    
        casa.addMorador(morador1);
        casa.addMorador(morador2);
        
        casa.addAnimalEstimacao(animal1);
        casa.addAnimalEstimacao(animal2);

        casa.setMoradorPrincipal(morador1);


        em.persist(casa);
	}

}
