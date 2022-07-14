package Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String plot () {
        return "no plot here";
    }
}

class SpiderMan extends Movie {
    public SpiderMan() {
        super("spider man");
    }

    @Override
    public String plot() {
        return "Spider guy trying to save the world";
    }
}

class Titanic extends Movie {
    public Titanic() {
        super("titanic");
    }

    @Override
    public String plot() {
        return "Jack and Rose found love in a sinking ship";
    }
}

class Terminator extends Movie {
    public Terminator() {
        super("terminator");
    }

    @Override
    public String plot() {
        return "Machine guy trying to kidnap humans";
    }
}

class Goal extends Movie {
    public Goal() {
        super("goal");
    }

    @Override
    public String plot() {
        return "achieving the dream of a professional footballer";
    }
}

class Avengers extends Movie {
    public Avengers() {
        super("avengers");
    }

    @Override
    public String plot() {
        return "A group of super heroes trying to save the world";
    }
}

class Unknown extends Movie {
    public Unknown() {
        super("unknown");
    }
    //no plot method
}



public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie myMovie = randomMovie();
            System.out.println("Movie #" + i + " :" + myMovie.getName() + "\n" +
                              "Plot: " + myMovie.plot() + "\n");
        }
    }

    // create a method to pick movies at random
    public static Movie randomMovie () {
        //typecast to (int) as the return type of Math.random() is double
        int randomNumber = (int) (Math.random() * 6) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new SpiderMan();
            case 2:
                return new Titanic();
            case 3:
                return new Terminator();
            case 4:
                return new Goal();
            case 5:
                return new Avengers();
            case 6:
                return new Unknown();
            default:
                return null;
        }
    }
}
