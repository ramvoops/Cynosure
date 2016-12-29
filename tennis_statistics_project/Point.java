public class Point {
    private Player server;
    private int first;
    private int second;
    private int doubleFault;
    private int serveVolley;
    private Player returner;
    private int returnWinner;
    private int strong;
    private int ip;
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
    public Point(Player server, int firstServeIn, int secondServeIn,
                 int doubleFault, int serveVolley,
                 Player returner, int returnWinner, int strongReturn, int ip,
                 int weak, int forced, int unforcedError, int netPts,
                 Player whoHitLastShot, int winner, int unForced,
                 int forcedError, String shot, String where,
                 String fromWhere, String fromWhereInRed) {
        this.server = server;
        firstServeIn = first;
        secondServeIn = second;
        this.doubleFault = doubleFault;
        this.serveVolley = serveVolley;
        this.returner = returner;
        this.returnWinner = returnWinner;
        strongReturn = strong;
        this.ip = ip;
        this.weak = weak;
        forcedError = forced;
        unforcedError = unforced;
        this.netPts = netPts;
        this.whoHitLastShot = whoHitLastShot;
        this.winner = winner;
        this.unforcedError = unforcedError;
        this.forcedError = forcedError;
        this.shot = shot;
        this.where = where;
        this.fromWhere = fromWhere;
        this.fromWhereInRed = fromWhereInRed;
    }

    //accessor
    public Player getServer() {
        return server;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getDoubleFault() {
        return doubleFault;
    }

    public int getServeVolley() {
        return serveVolley;
    }

    public Player getReturner() {
        return returner;
    }

    public int getReturnWinner() {
        return returnWinner;
    }

    public int getStrong() {
        return strong;
    }

    public int getIP() {
        return ip;
    }

    public int weak() {
        return weak;
    }

    public int getForcedReturn() {
        return forced;
    }

    public int getUnforcedReturn() {
        return unforced;
    }

    public int getNetPts() {
        return netPts;
    }

    public Player getWhoHitLastShot() {
        return whoHitLastShot;
    }

    public int getWinner() {
        return winner;
    }

    public int getUnforcedError() {
        return unforcedError;
    }

    public int getForcedError() {
        return forcedError;
    }

    public String getShot() {
        return shot;
    }

    public String getWhere() {
        return where;
    }

    public String getFromWhere() {
        return fromWhere;
    }

    public String getFromWhereInRed() {
        return fromWhereInRed;
    }
}
