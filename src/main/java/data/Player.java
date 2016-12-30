package data;

public class Player {

    private String name;
    private int age;
    private String country;
    private int ranking;
    private Serve serve;
    private PointError errors;
    private PointReturn returns;

    public Player(String name, int age, String country, int ranking) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.ranking = ranking;
        serve = new Serve();
        errors = new PointError();
        returns = new PointReturn();
    }

    //accessors
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public int getRanking() {
        return ranking;
    }

    public int
}
