package edu.miu.cs.cs.cs425.eregistrar.service.Impl;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.miu.cs.cs.cs425.eregistrar.model.Student;
import edu.miu.cs.cs.cs425.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs.cs425.eregistrar.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Optional<List<Student>> getAllStudents() {
        // TODO Auto-generated method stub
        return Optional.of(studentRepository.findAll());
    }

    @Override
    public Optional<Student> createStudent(Student student) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(studentRepository.save(student));
    }

    @Override
    public void removeStudent(long id) {
        // TODO Auto-generated method stub
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<Student> getStudentById(long id) {
        // TODO Auto-generated method stub
        return studentRepository.findById(id);
    }

    @Override
    public Optional<List<Student>> searchStudents(String searchWord) {
        // TODO Auto-generated method stub
        return Optional.ofNullable(studentRepository.searchStudents(searchWord));
    }

    @Override
    public void updateStudent(Student student) {
        // TODO Auto-generated method stub
        studentRepository.save(student);
    }
}




