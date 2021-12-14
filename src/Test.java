import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class CharArrayReaderTest {
    public static void main(String[] args) {
Exercize e=new Exercize();
        List<Student> collect = e.getStudents().stream()
                .filter(Objects::nonNull)

                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getSecondName)).collect(Collectors.toList());
        System.out.println(collect);
    }


    }

