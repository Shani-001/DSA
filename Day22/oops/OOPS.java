public class OOPS{
    public static void main(String args[]){
    //   Student s1=new Student("Shani",21);
    // //   s1.setName("Shani");
    // //   s1.setAge(21);
    //   System.out.println(s1.getName());
    //   System.out.println(s1.getAge());
    //   s1.setMarks(90,99,100);
    //   Student s2=new Student(s1);
    //   System.out.println(s2.getName());
    //   System.out.println(s2.getAge());
    //   s1.marks[1]=100;
    //   System.out.println(s2.marks[0]+" "+s2.marks[1]+" "+s2.marks[2]);

     Dog d1=new Dog();
     d1.eat();
     d1.setColor("black");
     System.out.println(d1.getColor());
     d1.setType("German shepard");
   
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("I am Eating");
    }
    void setColor(String color){
        this.color=color;
    }
    String getColor(){
       return this.color;
    }
}

class Dog extends Animal{
    String type;
    void setType(String type){
        this.type=type;
        System.out.println(this.type);
    }
}





// class Student{
//    private String name;
//    private int age;
//    int marks[]=new int[3];
   
//    void setName(String name){
//     this.name=name;
//    }
//    void setAge(int age){
//     this.age=age;
//    }

//    void setMarks(int m1,int m2,int m3){
//     this.marks[0]=m1;
//     this.marks[1]=m2;
//     this.marks[2]=m3;
//    }

//    String getName(){
//     return this.name;
//    }

//    int getAge(){
//     return this.age;
//    }
   
//    //shallow copy
// //    Student(Student s){
// //      this.name=s.name;
// //      this.age=s.age;
// //      this.marks=s.marks;
// //    }

// //deep copy
// Student(Student s){
//     marks=new int[3];
//      this.name=s.name;
//      this.age=s.age;
//      for (int i = 0; i < s.marks.length; i++) {
//          this.marks[i]=s.marks[i];
//      }
//    }

//    Student(String name,int age){
//     this.name=name;
//     this.age=age;
//    }

// }