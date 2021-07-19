package edu.miu.cs.cs.cs425.eregistrar.service;
import java.util.List;
import java.util.Optional;
import edu.miu.cs.cs.cs425.eregistrar.model.Student;

public interface StudentService {
    public Optional<List<Student>> getAllStudents();

    public Optional<Student> createStudent(Student student);

    public void removeStudent(long id);

    public Optional<Student> getStudentById(long id);

    public Optional<List<Student>> searchStudents(String searchWord);

    public void updateStudent(Student student);
}
