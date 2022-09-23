/* -----------------------------------------
 * Projet Neptune
 *
 * Ecole Centrale Nantes
 * Jean-Yves MARTIN
 * ----------------------------------------- */
package fr.centrale.nantes.neptune.repositories;

import fr.centrale.nantes.neptune.items.*;
import java.util.Collection;

public interface StudentgroupRepositoryCustom {

    /**
     * Create new Studentgroup
     * @param studentgroupName
     * @return Studentgroup
     */
    public Studentgroup create(String studentgroupName);

    /**
     * Remove Studentgroup
     * @param item
     */
    public void remove(Studentgroup item);

    /**
     * Get a Studentgroup from its ID
     * @param studentgroupId
     * @return Studentgroup
     */
    public Studentgroup getByStudentgroupId(Integer studentgroupId);

}
