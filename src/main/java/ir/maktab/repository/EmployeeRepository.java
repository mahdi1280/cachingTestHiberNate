package ir.maktab.repository;

import ir.maktab.model.Employee;
import ir.maktab.session.MySession;
import org.hibernate.Session;

public class EmployeeRepository {

    public void save(Employee employee){
        Session session = MySession.getSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
    }

    public Employee findById(long id){
        Session session=MySession.getSession();
        return session.find(Employee.class,id);
    }
}
