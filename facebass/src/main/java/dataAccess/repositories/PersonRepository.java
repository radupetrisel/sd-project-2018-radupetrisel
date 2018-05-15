package dataAccess.repositories;

import dataAccess.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findByFaceApiId(String faceApiId);

}
