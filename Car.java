public class Car {
   
   //fields
   private String name;
   private int year;
   private String model;
   private String engine;
   private int doors;
   private String make;
   private int horsepower;
   private double price;
   
   //constructs a new car with default values
   public Car() {}
   
   //constructs a new car with given values
   public Car(String name, int year, int horsepower, double price) {
        this.name = name;
        this.year = year;
        this.horsepower = horsepower;
        this.price = price;
   }
      
   //getters - return the value of the name field  
   public String getName() {
      return name;
   }
   
   public int getYear() {
      return year;
   }
   
   public String getModel() {
      return model;
   }
   
   public String getEngine() {
      return engine;
   }
   
   public int getDoors() {
      return doors;
   }
   
   public String getMake() {
      return make;
   }
   
   public int getHorsepower() {
      return horsepower;
   }
   
   public double getPrice() {
      return price;
   }
   
   //setters
   public void setName(String name) {
       this.name = name;
   }
   
   public void setYear(int year) {
       this.year = year;
   }   
   
   public void setModel(String model) {
       this.model = model;
   }
   
   public void setEngine(String engine) {
       this.engine = engine;
   }
   
   public void setDoors(int doors) {
       this.doors = doors;
   }
   
   public void setMake(String make) {
       this.make = make;
   }
   
   public void setHorsepower(int horsepower) {
       this.horsepower = horsepower;
   }
   
   public void setPrice(double price) {
       this.price = price;
   }
   
   //returns a String representation of this car
   public String toString() {
      return "{" + 
              "name = " + name +
              ", year = " + year + ", horsepower = " + 
              horsepower + "}";
   }
   
   //method returns true if a car is newer than 2016 and has more than 200HP.
   public static boolean isNewAndHp(Car car) {
       return car.year > 2016 && car.horsepower > 200;
   }

   //method returns true if a car is audi or mercedes
   public static boolean isAudiOrMercedes(Car car) {
      String x = car.name;
      x = x.toUpperCase();
      return x.equals("AUDI") || x.equals("MERCEDES");
   }

   public static String priceLevel(Car car) {
      if (car.price < 100000) {
         return "cheap";
      } else if (car.price >= 100000 && car.price < 500000) {
         return "medium";
      } else {
         return "expensive";
      }   
      
   }

}
