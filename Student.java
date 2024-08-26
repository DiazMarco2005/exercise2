package exercise2;
import java.util.ArrayList;
public class Student {
    private String name;
    private String lastName;
    private int id;
    private String birthDate;
    private String email;
    ArrayList<Grade> grades ;

    public Student(String name, String lastName, int id, String birthDate, String email, ArrayList<Grade> grades) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.birthDate = birthDate;
        this.email = email;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Grade> getGrades() {
        return grades;
    }
    public void setGrades(Grade score) {
        this.grades.add(score);
    
   
    
}}