public class OOPS{
    public static void main(String[] args) {
        Student s1=new Student(); //created an object of class
        Student s2=new Student();
        s1.setName("shani");
        s1.setAge(21);
        s1.setGrade('A');
        // s1.id=3;
        s1.setId(5);
        System.out.println(s1.getName()+" "+s1.getAge()+" "+s1.getGrade()+" "+s1.getId());


       s2.setName("Ram");
       s2.setAge(23);
       s2.setGrade('A');
       s2.setId(1);
       System.out.print(s2.getName()+" "+s2.getAge()+" "+s2.getGrade()+" "+s2.getId());

     
    }
}

class Student{
   private String name;
   private int age;
   private char grade;
    private int id;

    //getters
    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }
    char getGrade(){
        return this.grade;
    }
    int getId(){
        return this.id;
    }
  

  //setters
    void setName(String newName){
       name=newName;
    }
    void setAge(int newAge){
        age=newAge;
    }
    void setGrade(char newGrade){
        grade=newGrade;
    }
    public void setId(int newId){
        id=newId;
        // System.out.print(id+" ");
    }
}