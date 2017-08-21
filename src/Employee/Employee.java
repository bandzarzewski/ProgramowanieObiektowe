package Employee;

/**
 * Created by Maciek on 19.08.2017.
 */
public class Employee {
    private int _id;
    private String _firstName;
    private String _lastName;
    private int _salary;

    public Employee(int id, String lastName, String firstName, int salary){
        this._id=id;
        this._firstName=firstName;
        this._lastName=lastName;
        this._salary=salary;
    }
    public int getID(){
        return _id;
    }
    public String getFirstName(){
        return _firstName+" "+_lastName;
    }
    public String getLastName(){
        return _lastName;
    }
    public int getSalary(){
        return _salary;
    }
    public void setSalary(int salary){
        _salary=salary;
    }
    public int getAnnualSalary(){
        return _salary*12;
    }
    public int raiseSalary(int percent){
        return _salary=_salary+(_salary*percent/100);
    }
    public String toString(){
        return "Employee{id="+_id+" ,name="+getFirstName()+" ,salary="+_salary+"]";
    }
}
