package Kölappsutdelare1;

public class QueueTicketDispenser {
    private static int nr = 1;
    
    public int getNextNumber(){
        return nr++;
    }
    
    
}
