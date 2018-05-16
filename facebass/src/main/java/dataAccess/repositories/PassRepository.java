package dataAccess.repositories;

import dataAccess.entities.Pass_;
import dataAccess.entities.Person_;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassRepository extends JpaRepository<Pass_, Integer> {

    Pass_ findByOwner(Person_ owner);

}
