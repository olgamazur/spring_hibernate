package entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
@Data
public class Subject {
    String name;
}
