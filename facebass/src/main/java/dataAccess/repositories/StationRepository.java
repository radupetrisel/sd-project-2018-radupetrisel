package dataAccess.repositories;

import dataAccess.entities.Station_;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station_, Integer> {

}
