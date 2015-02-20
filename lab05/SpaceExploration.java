//Camden Fischer
//
public class SpaceExploration {
    public static void main(String[] args) {
        double dYear = Math.random() *11 + 2000;
        int year = (int) dYear;
        System.out.println("Here is a timeline of space exploration events from "+year+
        " to 2000");
        switch( year ){ //It will go to whatever year was chosen and start printing down from there
            case 2010:
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
            case 2009:
                System.out.println("2009: NA");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space");
            case 2007:
                System.out.println("2007: NA");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet");
            case 2005:
                System.out.println("2005: Spacecraft collides with comet");
            case 2004:
                System.out.println("2004: NA");
            case 2003:
                System.out.println("2003: Largest infrared telescope released");
            case 2002:
                System.out.println("2002: NA");
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid");
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");
                break;
        }//end of switch
    }//end of container
} //end of class