package Kölappsutdelare1;

public class Utdelare_av_kölappar {

    public static void main(String[] args) {
        QueueTicketDispenser q = new QueueTicketDispenser();
        int myNumber = q.getNextNumber();
        System.out.println("Könummer: " + myNumber);
        
        
        //Vad händer om vi skapar ett objekt till?
        QueueTicketDispenser q2 = new QueueTicketDispenser();
        myNumber = q2.getNextNumber();
        System.out.println("Könummer: " + myNumber);
        //Det andra objektet levererar samma serie nummer som det första,
        //lösning: skapa bara ett objekt av klassen
        
      
    }
}