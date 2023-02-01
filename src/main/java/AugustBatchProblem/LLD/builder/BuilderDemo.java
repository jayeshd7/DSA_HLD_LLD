package AugustBatchProblem.LLD.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Person person = employeeBuilder.withName("Jayesh").worksAs("SDE").build();
        System.out.println(person);
    }
}

class Person{
    String name;
    String designation;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

class PersonBuilder <SELF extends PersonBuilder<SELF>>{
    protected Person person = new Person();

    public SELF withName(String name){
        person.name = name;
        return toSelf();
    }

    public Person build(){
        return person;
    }

    public SELF toSelf(){
        return (SELF) this;
    }


}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{
    public EmployeeBuilder worksAs(String designation){
        person.designation = designation;
        return this;
    }

    @Override
    public EmployeeBuilder toSelf() {
        return this;
    }
}
