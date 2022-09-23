/* -----------------------------------------
 * Projet Neptune
 *
 * Ecole Centrale Nantes
 * Jean-Yves MARTIN
 * ----------------------------------------- */
package fr.centrale.nantes.neptune.repositories;

import fr.centrale.nantes.neptune.items.*;
import java.util.Collection;

public interface ProgramRepositoryCustom {

    /**
     * Create new Program
     * @param diplomId
     * @param academicyearId
     * @return Program
     */
    public Program create(Diplom diplomId, Academicyear academicyearId);

    /**
     * Remove Program
     * @param item
     */
    public void remove(Program item);

    /**
     * Get a Program from its ID
     * @param programId
     * @return Program
     */
    public Program getByProgramId(Integer programId);

}
