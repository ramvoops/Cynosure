public class Player{
    
    private String name;
    private int age;
    private String country;
    private int ranking;
    
    public Player(String _name, int _age, String _country, int _ranking)
    {
        _name = name;
        _age = age;
        _country = country;
        _ranking = ranking;
    }
    
    //accessors
    public String getName(){ return name;}
    public int getAge(){ return age;}
    public String getCountry(){ return country;}
    public int getRanking(){ return ranking;}
}
