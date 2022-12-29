// Superclass
class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("Berjalan dengan " + legs + " kaki.");
    }

    public void eat() {
        System.out.println("Memakan...");
    }
}

// Interface
interface Pet {
    String getName();
    void setName(String name);
    void play();
}

// Subclass
class Ular extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Memakan Tikus");
    }
}

// Subclass that extends Animal and implements Pet
class kelinci extends Animal implements Pet {
    public String name;

    public kelinci() {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Menggerutu");
    }

    @Override
    public void eat() {
        System.out.println("Memakan Wortel");
    }
}

// Subclass that extends Animal and implements Pet
class Bird extends Animal implements Pet {
    public String name;

    public Bird() {
        super(2);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Berkicau-kicau");
    }

    @Override
    public void eat() {
        System.out.println("Memakan jagung/Pakan khusus burung");
    }
}
