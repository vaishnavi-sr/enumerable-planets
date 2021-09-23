package modeldatapackage;

public enum Planets {
    // list the planets here.
    MERCURY("Mercury",88),
    VENUS("venus",225),
    EARTH("Earth",365),
    MARS("Mars",687),
    JUPITER("jupiter",4333),
    SATURN("Saturn",10759),
    URANUS("Uranus",30687),
    NEPTUNE("Neptune",60200);

    private final String name;

    public int getYearLength() {
        return yearLength;
    }

    private final int yearLength;

    public String getName() {
        return name;
    }



    Planets(String name,int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }
}

