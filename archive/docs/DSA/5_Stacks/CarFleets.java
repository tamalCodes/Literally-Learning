import java.util.*;

class CarFleets {
    public static int carFleet(int target, int[] position, int[] speed) {
        class Car {
            public int position;
            public double time;
            public int speed;

            public Car(int position, double time, int speed) {
                this.position = position;
                this.time = time;
                this.speed = speed;
            }
        }

        Car[] cars = new Car[position.length];

        for (int i = 0; i < position.length; i++) {
            double time = (double) (target - position[i]) / (double) speed[i];
            cars[i] = new Car(position[i], time, speed[i]);
        }

        Arrays.sort(cars, new Comparator<Car>() {
            public int compare(Car car1, Car car2) {
                return car2.position - car1.position;
            }
        });

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car-" + (i + 1) + " " + "Time taken: " + cars[i].time + " Speed was: " + cars[i].speed);

        }

        int fleetcount = 0;
        double previousTime = 0.0;

        for (int i = 0; i < cars.length; i++) {

            if (cars[i].time > previousTime) {
                fleetcount++;
                previousTime = cars[i].time;
            }
        }

        return fleetcount;
    }

    public static void main(String[] args) {
        int[] position = { 0, 4, 2 };
        int[] speed = { 2, 1, 3 };
        int target = 10;

        int totalfleets = carFleet(target, position, speed);
        System.out.println("The total number of fleets is: " + totalfleets);
    }
}