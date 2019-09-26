import java.util.*;

public class TestCar {
   public static void main(String[] args) {
        //Car 1
        Car car1 = new Car();
        car1.setName("bmw");
        car1.setYear(2019);
        car1.setHorsepower(220);
        System.out.println("Car 1: " + car1);

        //car 2
        Car car2 = new Car("mercedes", 2018, 290, 200000);
        System.out.println("Car 2: " + car2);
        
        //car 3
        Car car3 = new Car("tesla", 2017, 100, 130000);
        System.out.println("Car 3: " + car3);
        
        System.out.println();
        
        //let user create in a car object
        Car car4 = new Car();
        Scanner console = new Scanner(System.in);
        System.out.println("Now create your own Car object...");
        System.out.println();
        System.out.println("Car name?");
        car4.setName(console.next());
        System.out.println("Year produced?");
        car4.setYear(console.nextInt());
        System.out.println("Horsepower of the car?");
        car4.setHorsepower(console.nextInt());
        System.out.print("Car 4: " + car4);
        System.out.println();
    
        //store Car objects in array
        Car[] carArray = new Car[4];
        carArray[0] = car1;
        carArray[1] = car2;
        carArray[2] = car3;
        carArray[3] = car4;
    
        int yes = 0;
        int no = 0; 
        for (int i = 0; i <= 3; i++) { 
            if (Car.isAudiOrMercedes(carArray[i])) {
               yes++;
            } else {
               no++;
            }
        }
    
        System.out.println();
        System.out.println(yes + " cars are new and fast.");
        System.out.println(no + " cars aren't.");
  
        int yes1 = 0;
        int no1 = 0; 
        for (int i = 0; i <= 3; i++) { 
            if (Car.isAudiOrMercedes(carArray[i])) {
               yes1++;
            } else {
               no1++;
            }
        }
        
        System.out.println();
        System.out.println(yes1 + " cars are either Audi or Mercedes.");
        System.out.println(no1 + " cars aren't."); 
        System.out.println();
        
        int cheap = 0;
        int medium = 0;
        int expensive = 0; 
        for (int i = 0; i <= 3; i++) { 
            System.out.println("Car " + (i + 1) + " is " + Car.priceLevel(carArray[i]) + ".");
        }
    }
}