public class Cat {
    //Attributes
    String type;
    int age;
    String behavior;
    double averageweight;
    String Commoncolour;
    //Constructor
    public Cat(String type, int age, String behavior, double averageweight, String Commoncolour) //Parameters//
    {
        this.type = type;
        this.age = age;
        this.behavior = behavior;
        this.averageweight = averageweight;
        this.Commoncolour = Commoncolour;
    }
    //Method
    public void displayInfo() {
        System.out.println("Type : " + type);
        System.out.println("Age : " + age);
        System.out.println("Behavior : " + behavior);
        System.out.println("AverageWeight : " + averageweight + " kg");
        System.out.println("CommonColour : " + Commoncolour);
    
        
    }

        

}

