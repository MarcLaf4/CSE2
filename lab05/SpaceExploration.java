// Marc Laflamme 
// Lab 05 Space Exploration, February 20th 2015, CSE 2
// write a program that gives evnets in space exploration given the input of a 
// year within the timeline
//
//set up class
public class SpaceExploration{
    //make main method
    public static void main(String[] args){
        int year1 =(int)(Math.random()*(10)) + 2000;
        int initialYear= 2000;
        int yearsSince=year1-initialYear;
        String event1= "2000: A spacecraft first orbits an asteroid.";
        String event2= "2001: First spacecraft lands on an asteroid.";
        String event3= "2003: Largest infrared telescope released.";
        String event4= "2005: Spacecraft collies with comet.";
        String event5= "2006: Spacecraft returns with collections from a comet.";
        String event6= "2008: Kepler launched to study deep space.";
        String event7= "2010: SpaceX successfully sends spacecraft to orbit and back.";
        String event;
        switch (yearsSince) {
            case 0: 
                System.out.println("The event that occured in 2000:");
                System.out.println(event1);
                break;
            case 1: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);    
                break;
            case 2: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);    
                break;
            case 3: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);
                System.out.println(event3);
                break;
            case 4: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);
                System.out.println(event3);
                break;
            case 5: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);
                System.out.println(event3);
                System.out.println(event4);
                break;
            case 6: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);
                System.out.println(event3);
                System.out.println(event4);
                System.out.println(event5);
                break;
             case 7: 
                 System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);
                System.out.println(event3);
                System.out.println(event4);
                System.out.println(event5);
                break;
            case 8: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);
                System.out.println(event3);
                System.out.println(event4);
                System.out.println(event5);
                System.out.println(event6);
                break;
            case 9: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);
                System.out.println(event3);
                System.out.println(event4);
                System.out.println(event5);
                System.out.println(event6);
                break;
            case 10: 
                System.out.println("These are the major space exploration events between "+initialYear+" and "+year1);
                System.out.println(event1);
                System.out.println(event2);
                System.out.println(event3);
                System.out.println(event4);
                System.out.println(event5);
                System.out.println(event6);
                System.out.println(event7);
                break;
            default: System.out.println("An error has occurred.");
            
        }
    }
}
       
        
