import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

        static class myComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            int val1 = o1;
            int val2 = o2;

            if(val2 >= val1) return 1;
            return -1;

        }
        
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>(new myComparator());
        // PriorityQueue<Integer> myQueue = new PriorityQueue<>();
        // myQueue.add(10);
        myQueue.add(10);
        myQueue.add(80);
        myQueue.add(910);
        System.out.println(myQueue.poll());
        // myQueue.add(9);
        // myQueue.add(-1);
        // myQueue.add(-15);
        // myQueue.add(90);
        // printList(myQueue);
        // System.out.println(myQueue.poll());
        // System.out.println(myQueue.poll());
        // PriorityQueue<String> myQueue = new PriorityQueue<>();
        // PriorityBlockingQueue<String> myQueue = new PriorityBlockingQueue<>();
        // myQueue.add("a");
        // myQueue.add("a");
        // myQueue.add("a");
        // myQueue.add("d");
        // myQueue.add("e");
        // myQueue.add("ab");
        // myQueue.add("ac");
        // System.out.println(myQueue.poll());
        // System.out.println(myQueue.poll());
        // System.out.println(myQueue.poll());

       


    }

    public static void printList(PriorityQueue<Integer> myQueue){
        for(int e:myQueue){
            System.out.print(e+" ");
        }
        System.out.println();
    }
}

//  implement a comparator which will return multiple of 2 while performing
// poll() operation


//  2, 5, 6,3, 7, 8, 10