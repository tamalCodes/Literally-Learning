import java.util.HashMap;
import java.util.Map;

public class UnderGroundSystem {

    static class Pair {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    // ID, (checkinStation, checkinTime)
    Map<Integer, Pair<String, Integer>> checkinMap;

    // startStation->endStation, (TotalTimetaken, TotalTravelsmade)
    Map<String, Pair<Integer, Integer>> travelMap;

    public UndergroundSystem() {
            checkinMap = new HashMap<>();
            travelMap = new HashMap<>();
        }

    public void checkIn(int id, String checkinStation, int checkinTime) {
        checkinMap.put(id, new Pair(checkinStation, checkinTime));
    }

    public void checkOut(int id, String checkoutStation, int checkoutTime) {

        // p will have basically the checkinStation and checkinTime as key-val pair

        Pair p = checkinMap.remove(id);

        String checkinStation = (String) p.getKey();
        int checkinTime = (Integer) p.getValue();
        String route = checkinStation + "->" + checkoutStation;

        // now it is time to add it to the travelMap
        // we will search for the route, if it doesnot exists we return some default
        // value
        // if "A->B" doesnot exist we will return (0,0)

        int totalTime = 0;
        int totalTravels = 0;

        Pair datafortheRoute = travelMap.getOrDefault(route, new Pair(totalTime, totalTravels));

        totalTime = (Integer) datafortheRoute.getKey();
        totalTravels = (Integer) datafortheRoute.getValue();

        totalTime += (checkoutTime - checkinTime);
        totalTravels += 1;

        travelMap.put(route, new Pair(totalTime, totalTravels));

    }

    public double getAverageTime(String checkinStation, String checkoutStation) {

        String route = checkinStation + "->" + checkoutStation;
        Pair datafortheRoute = travelMap.get(route);

        double totalTime = (Integer) datafortheRoute.getKey();
        int totalTravels = (Integer) datafortheRoute.getValue();

        double averageTime = totalTime / totalTravels;

        return averageTime;

    }

}
