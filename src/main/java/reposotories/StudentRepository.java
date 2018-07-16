package reposotories;

import entities.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository extends JpaRepository<Student, Long> {
}
