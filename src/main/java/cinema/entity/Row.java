package cinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="row")
public class Row implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="rowID")
    private Long id;
    @Column(name="row_number")
    private Long rowNumber;
    @OneToMany(mappedBy = "row", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Seat> seats;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="hallID", insertable = true)
    private Hall hall;

    public Row() {
    }

    public Row(Long id, Long rowNumber, List<Seat> seats, Hall hall) {
        this.id = id;
        this.rowNumber = rowNumber;
        this.seats = seats;
        this.hall = hall;
    }

    public Long getId() {
        return id ;
    }

    public void setId(Long id) {
        this.id  = id;
    }

    public Long getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Long rowNumber) {
        this.rowNumber = rowNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }
}
