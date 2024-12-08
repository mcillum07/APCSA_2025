public class Animal {
    
    // Fields / Properties
    // please add 4 different properties that an animal could have.
    // In this 4, you want to include a variable that will indicate what kind of animal it is.
    // Beside the 4 you decide, please add a double value named: runDistance
    private String kind;
    private double runDistance;


    // Constructor
    // Please complete your constructor build
    public Animal(String theKind) {
        this.kind = theKind;
    }

    // Methods
    // Please add any getter and setter if you think it's needed.
    // Create a method that will assign value for runDistance
    public void setRunDistance(double theRunDistance) {
        this.runDistance = theRunDistance;
    }


    // Complete the following Method:
    /* This method will compare the runDistance between two animals (this and other) 
     * Think about how to get the information you need.
    */

    public String whoRunsMore(Animal other) {
        if (this.runDistance > other.runDistance) {
            return this.kind + " runs more.";
        }
        return other.kind + " runs more.";
    }

    public static void main(String[] args) {
        // create two Animal obj
        // Structure to create any non-string object:
        // (class)type_name var_name = new Constructor();
        Animal a1 = new Animal("Cat");
        Animal a2 = new Animal("Dog");
        
        a1.setRunDistance(2000002.2);
        a2.setRunDistance(30000.2);

        System.out.println(a1.whoRunsMore(a2));
    }
}
