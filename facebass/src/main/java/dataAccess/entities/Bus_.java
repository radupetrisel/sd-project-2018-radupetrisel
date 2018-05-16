package dataAccess.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buses")
public class Bus_ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "line_number", unique = true)
    private String name;

    @ManyToMany
    @JoinTable(name = "stops", joinColumns = @JoinColumn(name = "id_bus"), inverseJoinColumns = @JoinColumn(name = "id_station"))
    private List<Station_> stations;

    public List<Station_> getStations() {
        return stations;
    }

    public void setStations(List<Station_> stations) {
        this.stations = stations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
