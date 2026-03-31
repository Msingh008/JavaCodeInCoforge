public class Runner {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Manish");
        Employee employee2=new Employee(1,"Manish");
        Employee employee3=employee1;
        System.out.println(employee1==employee2);
        System.out.println(employee2==employee3);
        System.out.println(employee3==employee1);
        System.out.println();
        System.out.println(employee1.equals(employee2));
        System.out.println(employee2.equals(employee3));
        System.out.println(employee3.equals(employee1));






    }
}
