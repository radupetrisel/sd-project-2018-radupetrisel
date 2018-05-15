package dataAccess.repositories;

import dataAccess.entities.Pass;
import dataAccess.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassRepository extends JpaRepository<Pass, Integer> {

    Pass findByOwner(Person owner);

}
