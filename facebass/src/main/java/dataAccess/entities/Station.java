package dataAccess.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stations")
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", unique = true)
    private String name;

    @ManyToMany(mappedBy = "stations")
    private List<Bus> busses;

    public List<Bus> getBusses() {
        return busses;
    }

    public void setBusses(List<Bus> busses) {
        this.busses = busses;
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
