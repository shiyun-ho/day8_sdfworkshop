package sg.edu.nus.iss;

//implements comparable 
public class Employee implements Comparable<Employee> {
    private String staffNo;
    private String fullName; 
    private String department; 
    private String role; 
    private String email;
    private Integer salary;

//generates constructors

    public Employee(String staffNo, String fullName, String department, String role, String email, Integer salary) {
            this.staffNo = staffNo;
            this.fullName = fullName;
            this.department = department;
            this.role = role;
            this.email = email;
            this.salary = salary;
        }

    //generates getters and setters
    

    

//generate to string


@Override
public int compareTo(Employee o) {
    // TODO Auto-generated method stub
    //implement comparable library by manually sorting 
    //sorts  by abcdefg
    return this.getFullName().compareTo(o.getFullName());
}

public String getStaffNo() {
    return staffNo;
}

public void setStaffNo(String staffNo) {
    this.staffNo = staffNo;
}

public String getFullName() {
    return fullName;
}

public void setFullName(String fullName) {
    this.fullName = fullName;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

public String getRole() {
    return role;
}

public void setRole(String role) {
    this.role = role;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public Integer getSalary() {
    return salary;
}

public void setSalary(Integer salary) {
    this.salary = salary;
}

@Override
public String toString() {
    return "Employee [staffNo=" + staffNo + ", fullName=" + fullName + ", department=" + department + ", role=" + role
            + ", email=" + email + ", salary=" + salary + "]";
}




}





