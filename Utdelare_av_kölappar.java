package Kölappsutdelare1;

public class Utdelare_av_kölappar {

    public static void main(String[] args) {
        //First queue
        QueueTicketDispenser q1 = new QueueTicketDispenser();

        int myNumber = q1.getNextNumber();
        System.out.println("Könummer a: " + myNumber);

        //Second Queue
        QueueTicketDispenser q2 = new QueueTicketDispenser();

        myNumber = q2.getNextNumber();
        System.out.println("Könummer b: " + myNumber);
      
    }
}