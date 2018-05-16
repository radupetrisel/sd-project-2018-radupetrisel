package dataAccess.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "line_number", unique = true)
    private String name;

    @ManyToMany
    @JoinTable(name = "stops", joinColumns = @JoinColumn(name = "id_bus"), inverseJoinColumns = @JoinColumn(name = "id_station"))
    private List<Station> stations;

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
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
