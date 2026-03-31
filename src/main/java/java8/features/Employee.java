package java8.features;

public class Employee {
    int id;
    String name;
    int age;
    public Employee(int id,int age,String name){
        this.age=age;
        this.id=id;
        this.name=name;

    }
    public String toString(){
        return this.id+"<--->"+this.age+"<--->"+this.name;
    }
}
