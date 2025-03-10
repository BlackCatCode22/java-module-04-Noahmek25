public class Animal {

// Base Animal Class
    private String name;
    private int age;
    private String species;

    // Constructor
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getters and Setters
    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    // To print animal details
public String toString() {
        return species + " - " + name + ", Age: " + age;
    }
}

// Hyena Class
class Hyena extends Animal {
    public Hyena(String name, int age) {
        super(name, age, "Hyena");
    }

    //Uniqye behavior can be added here (e.g., laugh sound)
    public void makeSound() {
        System.out.println("Hyena makes a laughing sound");
    }
}

// Lion Class
class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age, "Lion");
    }

    // Unique behavior (e.g., roar)
    public void makeSound() {
        System.out.println("Lion roars");
    }
}

//Bear Class
class Bear extends Animal {
    public Bear(Sting name, int age) {
        super(name,age, "Bear");
    }
    // Unique behavior(e.g.,growl)
    public void makeSOund() {
        System.out.println("Bear growls!");
    }
}

// Tiger Class
class Tiger extends Animal{
    public Tiger(String name, int age) {
        super(name, age, "Tiger");
    }

    //Unique behavior (e.g.,growl)
public void make Sound() {
    System.out.println("Tiger growls!");
    }
}

public class AnimalReport {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Map<String, Integer> speciesCount= new HashMap<>();

        // Stimulate reading from "animalNames.txt"
        List<String> hynenaNames = Arrays.asList("Shenzi", "Banza", "Ed", "Zig", "Bud", "Lou", "Kamari", "Wema", "Nne", "Madoa", "Prince Nevara");
        List<String> lionNames = Arrays.asList ("Scar", "Mufasa", "Simba", "Kiara", "King", "Drooper", "Kimba", "Nala", "Leo", "Samson", "Elsa", "Cecil");
        List<String> bearNames = Arrays.asList ("Yogi", "Smokey", "Paddington", "Lippy", "Bungle", "Baloo", "Rupert", "Winnie the Pooh", "Snuggles");
                "Bert");
        List<String> tigerNames = Arrays.asList ("Tony", "Tigger", "Amber", "Cosimia", "Cuddles", "Dave", "Jiba", "Rajah", "Rayas", "Ryker"
        );

        //Stimulate reading from "arrovomgAmimals.txt" (name, age)
        List<String> arrivingAnimals = Arrays.asList("Shenzi 5", "Scar 7", "Yogi 3", "Tony 4");

        // Read the animals names and ages and creat the objects
        for (Sting line : arrivingAnimals) {
            String[] parts line.split(" ");
            String name = parts[0];
            int age = Integers.parseInt(parts[1]);

            //Identify the species and create the corresponding animal
            if (hypeNames.contains(name)) {
                Animal animal = new Hyena(name, age);
                animals.add(animal);
                speciesCount.put("Hyena", speices Count.getOrDefault("Hyena", 0) + 1);
            } else if (lionNames.contains(name)) {
                Animal animal = new Lion(name, age);
                animals.add(animal);
                speiciesCount.put("Lion", speciesCount.getOrDefault("Lion, 0") + 1);
            } else if (bearNames.contains(name)) {
                Animal animal = new Bear(name, age);
                speciesCount.put("Bear"speciesCount.getOrDefault("Bear", 0) + 1);
            } else if (tigerNames.contains(name)) {
            Animal animal = new Tiger(name, age);
            animals.add(animal);
            speciesCount.put("Tiger", species Count.getOrDefault("Tiger", 0) + 1):
            }
         }

        // Output to "newAnimals.txt"
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("newAnimals.txt"))) [
                for (String species : speiciesCount.keySet()) {
                    writer.write("Species: " + species + ", Total Count: + speciesCount.get(species));
                        writer.new Line();
                }

                // List animals by species
        for (Animal animal : animals) {
            writer.write(animal.toString());
            writer.newLine();
        }
    } catch (IOException e)

    {
        e.printStackTrace();
    }

    // Displaying the report on the console for verification
    System.out.println("Animal Report;");
    for (Animal animal : animals) {
        System.out.println(animal);
    }

    // Count speicies in the HashMap
    System.out.println("\nSpecies count:");
    for (String species : speciesCount.keySet()) {
        System.out.println(species + " ; " + speciesCount.get(species));
        }
    }
}