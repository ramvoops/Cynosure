package data;

public class Point {
    private Player server;
    private Player returner;
    private Player lastHit;
    private String shot;
    private String where;
    private String fromWhere;
    private String fromWhereInRed;
    private int netPts;


    //constructor
    public Point(Player server, Player returner, Player lastHit,
                    String shot, String where, String fromWhere,
                    String fromWhereInRed, int netPts) {
        this.server = server;
        this.returner = returner;
        this.lastHit = lastHit;
        this.shot = shot;
        this.where = where;
        this.fromWhere = fromWhere;
        this.fromWhereInRed = fromWhereInRed;
        this.netPts = netPts;
    }

    //accessor
    public Player getServer() {
        return this.server;
    }

    public Player getReturner() {
        return this.returner;
    }

    public Player getLastHit() {
        return this.lastHit;
    }
}
