import entities.Course;
import entities.Student;
import entities.Subject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("configs");
        Course course = context.getBean(Course.class);
        System.out.print(course.getId());
    }
}
