/* -----------------------------------------
 * Projet Neptune
 *
 * Ecole Centrale Nantes
 * Jean-Yves MARTIN
 * ----------------------------------------- */
package fr.centrale.nantes.neptune.repositories;

import fr.centrale.nantes.neptune.items.*;
import java.util.Optional;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class DiplomRepositoryCustomImpl implements DiplomRepositoryCustom {

    @Autowired
    @Lazy
    private DiplomRepository repository;

    @Override
    public Diplom create(String diplomName) {
        if ((diplomName != null)) {
            Diplom item = new Diplom();
            item.setDiplomName(diplomName);
            item.setDiplomActive(true);
            repository.saveAndFlush(item);

            Optional<Diplom> result = repository.findById(item.getDiplomId());
            if (result.isPresent()) {
                return result.get();
            }
        }
        return null;
    }

    @Override
    public void remove(Diplom item) {
        if (item != null) {
          repository.delete(item);
        }
    }

    @Override
    public Diplom getByDiplomId(Integer diplomId) {
        Optional<Diplom> result = repository.findById(diplomId);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }
}
