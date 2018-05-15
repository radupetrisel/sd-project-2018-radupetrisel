package dataAccess.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "passes")
public class Pass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn
    private Person owner;

    @OneToOne
    @JoinColumn
    private Bus bus;

    @Column(name = "expiry_date")
    private Date expiryDate;

}
