public class Cyclometer{ 
  public static void main(String [] args){
    int secsTrip1=480;  // seconds for trip 1
    int secsTrip2=3220;  // seconds for trip 2
    int countsTrip1=1561;  // rotations for trip 1
    int countsTrip2=9037; // rotations for trip 2
    double wheelDiameter=27.0,
        // Useful constants to do calculations with
         PI=3.14159, //
         feetPerMile=5280,  //
         inchesPerFoot=12,   //
         secondsPerMinute=60;  //
    double distanceTrip1, distanceTrip2,totalDistance;
    // Print out results
    System.out.println("Trip 1 took "+
           (secsTrip1/secondsPerMinute)+" minutes and had "+
           countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
           (secsTrip2/secondsPerMinute)+" minutes and had "+
           countsTrip2+" counts.");
    distanceTrip1=countsTrip1*wheelDiameter*PI; //calculation for the distance of trip 1
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;
    // Print out results 
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
  }
}
