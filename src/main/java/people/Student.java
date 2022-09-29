package people;

public class Student {

   private  String programmingLanguage;
    private String gender;
    private int age;

    //Konstruktor
//    public Student(String programmingLanguage,String gender,int age){
//        this.programmingLanguage = programmingLanguage;
//        this.gender = gender;
//        this.age = age;
//    }


    //getter and setter for age
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }


// getter and setter for progammingLanguage
    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

// getter and setter for age
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

   //  toString um alle werte als string auszugeben ansosnten kommt nur ein hascode raus
public String toString(){
        return programmingLanguage+"\n" + age+"\n" + gender;
}

}
