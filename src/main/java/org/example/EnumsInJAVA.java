package org.example;

public class EnumsInJAVA {
   public enum city{
        GORAKHPUR("Famous for longest platform in world"),
        KHALILABAD,
        PUNE("IT Hub you can say..."),
        KERLA("Litracy in india"),
        KOCCHI("I dont know...");

       private static String countyName="India";
        city(){};
        String custMessage;
        city(String customMessage){
           custMessage=customMessage;
        }
    }

    public static void main(String[] args) {
        city cityName = city.KHALILABAD;
        System.out.println(cityName.custMessage);
        System.out.println(cityName.name()+"---"+cityName.toString()+"---"+cityName.ordinal());
        switch (cityName){
            case GORAKHPUR:
            case PUNE:
            case KHALILABAD:
                System.out.println("Known to me place....");
                break;
            case KERLA:
            case KOCCHI:
                System.out.println("I haven't been to these places yet....");
                break;
            default:
                System.out.println("Kya bakchdoi hai...");
        }
    }
}
