public class GenericsPractice<T> {

    public void setName(T name) {
        this.name = name;
    }

    private  T name;
    private T id;


    public static void main(String[] args) {
        GenericsPractice<String> genericsPractice=new GenericsPractice();
      printNames(new Integer []{1,3,4,44,5,5});

        System.out.println(genericsPractice.getId());
        System.out.println(genericsPractice.getName());
    }


    public static  <T> void printNames(T [] values){
        for (T value:values){
            System.out.println(value);
        }
    }


    public T getId() {
        return id;
    }



    public T getName() {
        return name;
    }

public void setId(T idValue){
        this.id=idValue;
}



}
