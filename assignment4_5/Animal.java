public abstract class Animal {
    public String name;
    public int age;

    // Animal constructor
    public Animal (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String makeSound();


    // Subclasses

    //Lion subclass
    public static class Lion extends Animal{
        public Lion(String name, int age) {
            super(name, age);
        }

        @Override
        public String makeSound() {
            return "Roar";
        }
    }

    //Tiger subclass
    public static class Tiger extends Animal {
        public Tiger(String name, int age) {
            super(name, age);
        }

        @Override
        public String makeSound() {
            return "Grawl";
        }

    }

    //Elephant subclass
    public static class Elephant extends Animal {
        public Elephant(String name, int age) {
            super(name, age);
        }

        @Override
        public String makeSound() {
            return "Trumpet";
        }
    }

    public static class Main{
        public static void main(String[] args){
            Tiger tiger = new Tiger("Ryuk", 5);
            Elephant elephant = new Elephant("Hulk", 25);
            Lion lion = new Lion("Leo", 13);

            System.out.println("When " +tiger.getName() + " was " + tiger.getAge() + " years old he could " + tiger.makeSound());
            System.out.println(elephant.getName() + " is now " + elephant.getAge() + " years old and she can " + elephant.makeSound());
            System.out.println(lion.getName() + " is now " + lion.getAge() + " years old and he can " + lion.makeSound());

            lion.setAge(15);
            System.out.println(tiger.getName() + " is currently " + tiger.getAge() + " years old");
        }
    }

}



