
import java.util.*;

public class PQ{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
      @Override
      public int compareTo(Student s2){
       return this.rank-s2.rank;
      }

    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Raj",50));
        pq.add(new Student("Rani",15));
        pq.add(new Student("shani",1));
        pq.add(new Student("Pinki",115));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank+" ");
            pq.remove();
        }
    }
}