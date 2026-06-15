public class CircularQ{

    public static class CircularQueue{
        static int size;
        static int arr[];
        static int front;
        static int rear;

        public CircularQueue(int n) {
            arr=new int[n];
            front=-1;
            rear=-1;
            size=n;
        }
        //isEmpty
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //add
        public static void enqueue(int data){
          if(isFull()){
          System.out.println("Queue is full");
          }
         if(front==-1){
            front=0;
         }

          rear=(rear+1)%size;
          arr[rear]=data;
        }

        //remove
        public static int dequeue(){
            if(isEmpty()){
                return -1;
            }
            int top=arr[front];
            if(front==rear){
                rear=front=-1;
            }
            else{
            front=(front+1)%size;
            }
            return top;
        }

       //peek
       public static int peek(){
        if(isEmpty()){
            return -1;
        }
         return arr[front];
       }
        
    }
    public static void main(String[] args) {
        CircularQueue q=new CircularQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        while(!q.isEmpty()){
          System.out.println(q.peek());
          q.dequeue();
        }

    }
}