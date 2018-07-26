package cinema.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="hall")
public class Hall implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hallID")
    private Long id;
    @Column(name="hall_number")
    private int hallNumber;

    @OneToMany(mappedBy = "hall",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Row> rows;

    public Hall() {
    }

    public Hall(Long id, int hallNumber, List<Row> rows) {
        this.id = id;
        this.hallNumber = hallNumber;
        this.rows = rows;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}
