public enum Familymembers {
    ATUL("Atul Singh"),
    MANISH("Manish Singh"),
    SUJEET("Sujeet Chaudhary"),
    SUNIL("Sunil Rao"),
    SUNNY("Prashant Singh");
    public String getFullName() {
        return fullName;
    }

    private   String fullName;
    private Familymembers(String fullName){
        this.fullName=fullName;
    };

    public static void main(String[] args) {
        Familymembers familymembers=Familymembers.SUJEET;
        switch (familymembers){
            case ATUL:{
                System.out.println("Atul");
                ;}
            case MANISH:{
                System.out.println("Manish");
                ;}


        }
    }
}
