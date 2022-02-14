package ChunksOfCodes;

public class Dogs {
        String name;
        public static void main (String[] args) {
            // make a Dog object and access it
            Dogs dog1 = new Dogs();
            dog1.bark();
            dog1.name = "Bart";
            // now make a Dog array
            Dogs[] myDogs = new Dogs[3];
            // and put some dogs in it
            myDogs[0] = new Dogs();
            myDogs[1] = new Dogs();
            myDogs[2] = dog1;

            // assign names to dogs in the array
            myDogs[0].name = "Fluffy";
            myDogs[1].name = "Rubic";
            myDogs[2].name = "Jack";
        }
    public void bark() {
        System.out.println(name + " says Ruff!");
    }
}
