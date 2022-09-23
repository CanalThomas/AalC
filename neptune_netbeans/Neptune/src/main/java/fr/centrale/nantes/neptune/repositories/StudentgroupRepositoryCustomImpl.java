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
public class StudentgroupRepositoryCustomImpl implements StudentgroupRepositoryCustom {

    @Autowired
    @Lazy
    private StudentgroupRepository repository;

    @Override
    public Studentgroup create(String studentgroupName) {
        if ((studentgroupName != null)) {
            Studentgroup item = new Studentgroup();
            item.setStudentgroupName(studentgroupName);
            repository.saveAndFlush(item);

            Optional<Studentgroup> result = repository.findById(item.getStudentgroupId());
            if (result.isPresent()) {
                return result.get();
            }
        }
        return null;
    }

    @Override
    public void remove(Studentgroup item) {
        if (item != null) {
          repository.delete(item);
        }
    }

    @Override
    public Studentgroup getByStudentgroupId(Integer studentgroupId) {
        Optional<Studentgroup> result = repository.findById(studentgroupId);
        if (result.isPresent()) {
            return result.get();
        }
        return null;
    }
}
