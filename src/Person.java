public class Person {
    public  String firstName;
    public  String lastName;
    public  int myAge;
    public  String myGender;


    public Person(String firstName, String lastName, int myAge, String myGender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myAge = myAge;
        this.myGender = myGender;
    }

    public void showInfo(){
        System.out.println("Czesc mam na imie" + firstName + " " + "moje nazwisko to: " + " " + lastName);
    }


    public int yearCalculation(int x){
        int finalResult = 0 ;
           int result = x + 2;
           int resultTwo = 2*(x-8);
        if(result == resultTwo){
            finalResult = resultTwo;
            System.out.println("dzialania sa identyczne ");
        } else {
            System.out.println("nie sa rowne ");
        }

        return finalResult;
    }
}


