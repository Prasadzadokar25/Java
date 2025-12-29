import java.util.concurrent.*;

class BlockingQueueDemo3 {

        public static void main (String args [] ){

                PriorityBlockingQueue bq = new PriorityBlockingQueue ();

                bq.offer("P");
                bq.offer("A");
                bq.offer("S");
                bq.offer("A");
                bq.offer("X");
                bq.offer("Q");
                bq.offer("Z");


                System.out.println(bq);
        }
}
