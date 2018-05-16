package dataAccess.repositories;

import dataAccess.entities.Person_;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person_, Integer> {

    Person_ findByFaceApiId(String faceApiId);

    Person_ findByEmail(String email);
}
