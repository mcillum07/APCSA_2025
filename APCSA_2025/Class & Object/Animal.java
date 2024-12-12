public class Animal {
    
    // Fields / Properties
    // please add 4 different properties that an animal could have.
    // In this 4, you want to include a variable that will indicate what kind of animal it is.
    // Beside the 4 you decide, please add a double value named: runDistance
    private double size;            // shows the animals size (how big it is)
    private String species;         // What animal it is
    private double runDistance;

    // Constructor
    // Please complete your constructor build
    public Animal(double size, String species) {
        this.size = size;
        this.species = species;
    }

    // Methods
    // Please add any getter and setter if you think it's needed.
    // Create a method that will assign value for runDistance

    public double getRunDistance() {
        return this.runDistance;
    }

    public void setRunDistance(double theRunDistance) {
        this.runDistance = theRunDistance;
    }

    public String checkRunDistance() {
        // When you have condtions for return, always remember to add another return for all other cases
        // When the condition is false, you also want to have a return
        // Solution 1: write else statement
        // Solution 2: add a return statment directly
        if (this.getRunDistance() < 25) {
            return "The animal ran more than 25 km";
        }
        return "The animals ran less than or equals to 25 km";
    }

    // Complete the following Method:
    /* This method will compare the runDistance between two animals (this and other) 
     * Think about how to get the information you need.
    */
    // When I call this method with any Animal object, I'm expecting to provide another Animal object in the bracket.
    // The object that called the method can be represented by keyword this in your class.
    public String whoRunsMore(Animal other) {
        if (this.getRunDistance() > other.getRunDistance()) {
            return this.species + " runs more than " + other.species;
        }
        return other.species + " runs more than " + this.species;
    }

    public static void main(String[] args) {
        // create two Animal obj
        // Structure to create any non-string object:
        // (class)type_name var_name = new Constructor();
        
        Animal a1 = new Animal(0.6, "Cat");
        Animal a2 = new Animal(1.2, "Dog");
        
        a1.setRunDistance(2000002.2);
        a2.setRunDistance(3000000.2);

        System.out.println(a1.whoRunsMore(a2));
    }
}
