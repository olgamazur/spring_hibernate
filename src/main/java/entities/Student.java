package entities;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="student")
@Data
public class Student {
    @Column
    Long id;
}
