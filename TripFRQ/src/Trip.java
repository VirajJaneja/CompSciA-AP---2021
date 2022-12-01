import java.util.*;
public class Trip
{
	private ArrayList<Flight> flights=new ArrayList<Flight>();


	/* Constructor expects a list of times of the
	 * form hours:minutes (e.g. "2:15" or "10:32"). Elements
	 * 0 & 1 will form the 1st flight, elements 2 & 3 will form
	 * the 2nd flight, etc.
	 */
	Trip(String[] times){
		for (int i=0; i<times.length/2; i++)
			flights.add(new Flight(new Time(times[i*2])
			,new Time(times[(i*2)+1])));
	}

	
	// stores the flights (if any) in chronological order
	/** @return the number of minutes from the departure of the first flight to the arrival
	 * of the last flight if there are one or more flights in the trip;
	 * 0, if there are no flights in the trip
	 */
	public int getDuration() {
		Flight temp;
		if(flights.size() == 0)
			return 0;
		return flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size()-1).getArrivalTime());

	}/** Precondition: the departure time for each flight is later than the arrival time of its
	}
	 * preceding flight*/
	public int getShortestLayover()
	{ /* to be implemented in part (b) */ 
		if(flights.size() < 2)
			return -1;
		int lowest = 1000000000;
		for(int i = 0; i < flights.size()-1; i++) {
			if(flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDepartureTime()) < lowest)
				lowest = flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDepartureTime());
		}
		return lowest;
	}
	// There may be instance variables, constructors, and methods that are not shown.
	 /** @return the smallest number of minutes between the arrival of a flight and the departure
	 * of the flight immediately after it, if there are two or more flights in the trip;
	 * -1, if there are fewer than two flights in the trip
	 */


	// Do not run this until you are sure it works!!!
	public static void runAcceptanceTest(){
		(new TripTester()).generateCasesAndRun();
	}

	public static void main(String[] args){
		runAcceptanceTest();
	}

	

}