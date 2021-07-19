package edu.miu.cs.cs.cs425.eregistrar.model;
import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    @Column(nullable = false)
    private String studentNumber;

    @Column(nullable = false)
    private String firstName;

    private String middleName;
    @Column(nullable = false)
    private String lastName;
    private double cgpa;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfEnrollment;

    @Type(type = "yes_no")
    @Column(nullable = false)
    private boolean isInternational;


    public Student() {
    }
    public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa,
                   LocalDate dateOfEnrollment) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
    public long getStudentId() {
        return studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }
    public String getIsInternational() {
        if(isInternational)
            return "Yes";
        return "No";
    }
    public void setInternational(boolean isInternational) {
        this.isInternational = isInternational;
    }
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName
                + ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment="
                + dateOfEnrollment + ", isInternational=" + isInternational + "]";
    }
}
