package data;

public class Player {

    private String name;
    private int age;
    private String country;
    private int ranking;

    public Player(String name, int age, String country, int ranking) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.ranking = ranking;
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
}
