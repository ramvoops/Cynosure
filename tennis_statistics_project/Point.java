public class Point
{
    private Player server;
    private int first;
    private int second;
    private int doubleFault;
    private int serveVolley;
    private Player returner;
    private int returnWinner;
    private int strong;
    private int IP;
    private int weak;
    private int forced;
    private int unforced;
    private int netPts;
    private Player whoHitLastShot;
    private int winner;
    private int unforcedError;
    private int forcedError;
    private String shot;
    private String where;
    private String fromWhere;
    private String fromWhereInRed;
    
    //constructor
    public Point( Player _server, int firstServeIn, int secondServeIn, int _doubleFault, int _serveVolley,
                    Player _returner, int _returnWinner, int strongReturn, int _IP, int _weak, int forcedError,
                    int unforcedError, int _netPts, Player _whoHitLastShot, int _winner, int _unforcedError,
                    int _forcedError,String _shot, String _where,String _fromWhere, String _fromWhereInRed)
    {
        _server = server;
        firstServeIn = first;
        secondServeIn = second;
        _doubleFault = doubleFault;
        _serveVolley = serveVolley;
        _returner = returner;
        _returnWinner = returnWinner;
        strongReturn = strong;
        _IP = IP;
        _weak = weak;
        forcedError = forced;
        unforcedError = unforced;
        _netPts = netPts;
        _whoHitLastShot = whoHitLastShot;
        _winner = winner;
        _unforcedError = unforcedError;
        _forcedError = forcedError;
        _shot = shot;
        _where = where;
        _fromWhere = fromWhere;
        _fromWhereInRed = fromWhereInRed;
    }
    
    //accessor
    public Player getServer(){ return server;}
    public int getFirst(){ return first;}
    public int getSecond(){return second;}
    public int getDoubleFault(){return doubleFault;}
    public int getServeVolley(){return serveVolley;}
    public Player getReturner(){return returner;}
    public int getReturnWinner(){return returnWinner;}
    public int getStrong(){return strong;}
    public int getIP(){return IP;}
    public int weak(){return weak;}
    public int getForcedReturn(){return forced;}
    public int getUnforcedReturn(){return unforced;}
    public int getNetPts(){return netPts;}
    public Player getWhoHitLastShot(){return whoHitLastShot;}
    public int getWinner(){return winner;}
    public int getUnforcedError(){ return unforcedError; }
    public int getForcedError(){ return forcedError; }
    public String getShot(){return shot;}
    public String getWhere(){return where;}
    public String getFromWhere(){return fromWhere;}
    public String getFromWhereInRed(){return fromWhereInRed;}
}
