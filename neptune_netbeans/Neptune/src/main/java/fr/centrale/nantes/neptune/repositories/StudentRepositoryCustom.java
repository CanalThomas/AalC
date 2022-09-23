/* -----------------------------------------
 * Projet Neptune
 *
 * Ecole Centrale Nantes
 * Jean-Yves MARTIN
 * ----------------------------------------- */
package fr.centrale.nantes.neptune.repositories;

import fr.centrale.nantes.neptune.items.*;
import java.util.Collection;

public interface StudentRepositoryCustom {

    /**
     * Create new Student
     * @param studentIdnumber
     * @return Student
     */
    public Student create(String studentIdnumber);

    /**
     * Remove Student
     * @param item
     */
    public void remove(Student item);

    /**
     * Get a Student from its ID
     * @param studentId
     * @return Student
     */
    public Student getByStudentId(Integer studentId);

}
