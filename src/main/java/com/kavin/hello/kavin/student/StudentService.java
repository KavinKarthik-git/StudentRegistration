package com.kavin.hello.kavin.student;
import com.kavin.hello.kavin.exception.Alreadyexist;
import com.kavin.hello.kavin.exception.NotNewException;
import com.kavin.hello.kavin.exception.Notexist;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentDAO studentDao;

    public StudentService(@Qualifier("jpa") StudentDAO studentDao)

    {
        this.studentDao = studentDao;
    }
    public List<Student> getStudents()
    {
        return studentDao.selectAllStudent();
    }
    public Student getStudent(Integer id) {
        return studentDao.selectStudentByID(id).orElseThrow();

    }
    public void addStudent(StudentReq streq){

         if (studentDao.isNameExist((streq.name()))){
             throw new Alreadyexist("Student already exist");
         }

         Student student = new Student(streq.name(),streq.address(),streq.age());
         studentDao.addStudent(student);

    }

    public void deleteService(Integer id){
        if (!studentDao.isIdExist((id))){
            throw new Notexist("Student did not  exist");
        }
        studentDao.deleteStudent(id);

    }

    public void updateService(Integer id,UpdateReq updreq){
       Student student = getStudent(id);
       boolean changes = false;
       if(updreq.name()!=null && !updreq.name().equals(student.getName()))
       {
           student.setName(updreq.name());
           changes = true;
       }
       if(updreq.age()!=null && !updreq.age().equals(student.getAge()))
        {
            student.setAge(updreq.age());
            changes = true;
        }
        if(updreq.address()!=null && !updreq.address().equals(student.getAddress()))
        {
            student.setAddress(updreq.address());
            changes = true;
        }
        if(!changes)
        {
            throw new NotNewException("There is no change in data");
        }
        studentDao.updateStudent(student);
    }


}
