package cinema.repository;

import cinema.entity.Row;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RowRepository extends JpaRepository<Row,Long> {
    public Row findById(Long id);
}
