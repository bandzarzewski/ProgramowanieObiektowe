package Employee;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maciek on 20.08.2017.
 */
public class EmployeeTest {

    Employee employee=new Employee(3,"Kowalski","Janusz",1000);
    @Test
    public void EmployeeGetIdTest(){
        Assert.assertEquals(3,employee.getID());
    }
    @Test
    public void EmployeeGetLastNameTest(){
        Assert.assertEquals("Kowalski",employee.getLastName());
    }
    @Test
    public void EmployeeGetSalaryTest(){
        Assert.assertEquals(1000,employee.getSalary());
    }

    @Test
    public void EmployeeSetSalaryTest(){
        employee.setSalary(1000);
        Assert.assertEquals(1000,employee.getSalary());

    }
    @Test
    public void EmployeeGetAnnualSaalaryTest(){
        Assert.assertEquals(1000,employee.getSalary());
    }
    @Test
    public void EmployeeRaiseSalaryTest(){
        Assert.assertEquals(1100,employee.raiseSalary(10));
    }

    @Test
    public void EmployeeToStringTest(){
        Assert.assertEquals("Employee{id=1 ,name=Janusz Kowalski ,salary=1000",employee.toString());
    }


}
