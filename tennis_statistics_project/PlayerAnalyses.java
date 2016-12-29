import java.util.ArrayList;

public class PlayerAnalyses
{
    private ArrayList<Point> points;
    private Player p1;
    private Player p2;
    
    public PlayerAnalyses(ArrayList<Point> _points , Player Player1, Player Player2)
    {
        _points = points;
        Player1 = p1;
        Player2 = p2;
    }
    
    private String player1Name()
    {
        return p1.getName();        
    }
    
    private String player2Name()
    {
        return p2.getName();        
    }
    
    private ArrayList<Point> player1HitLastList()
    {
        String player1 = player1Name();
        ArrayList<Point> a = new ArrayList<Point>();
        for( int i = 0; i < points.size(); i++ )
        {
            if( points.get(i).getWhoHitLastShot().getName().equals(player1) )
                a.add( points.get(i));
        }
        return a;
    }
    
    private ArrayList<Point> player2HitLastList()
    {
        String player2 = player2Name();
        ArrayList<Point> a = new ArrayList<Point>();
        for( int i = 0; i < points.size(); i++ )
        {
            if( points.get(i).getWhoHitLastShot().getName().equals(player2) )
                a.add( points.get(i));
        }
        return a;
    }
    
    public int player1Aces()
    {
        int aces = 0;
        for( int i = 0; i < player1HitLastList().size(); i++ )
        {
            if( player1HitLastList().get(i).equals( "Ace" ) )
            aces++;
        }
        System.out.println( player1Name() + "hit" + String.valueOf(aces) + "aces." );
        return aces;        
    }
    
    public int player2Aces()
    {
        int aces = 0;
        for( int i = 0; i < player2HitLastList().size(); i++ )
        {
            if( player2HitLastList().get(i).equals( "Ace" ) )
            aces++;
        }
        System.out.println( player2Name() + "hit" + String.valueOf(aces) + "aces." );
        return aces;        
    }
    
    public int player1PointsWon()
    {
        int pts = 0;
        for( int i = 0 ; i < points.size(); i++ )
        {
            if( points.get(i).getWhoHitLastShot().equals( player1Name() ) )
            {
                if( points.get(i).getWinner()==1 )
                pts++;
            }
            if( points.get(i).getWhoHitLastShot().equals( player2Name() ) )
            {
                if( points.get(i).getForcedError()==1 || points.get(i).getUnforcedError()==1)
                pts++;
            }
        }
        return pts;
    }
    
    public int player2PointsWon()
    {
        int pts = 0;
        for( int i = 0 ; i < points.size(); i++ )
        {
            if( points.get(i).getWhoHitLastShot().equals( player2Name() ) )
            {
                if( points.get(i).getWinner()==1 )
                pts++;
            }
            if( points.get(i).getWhoHitLastShot().equals( player1Name() ) )
            {
                if( points.get(i).getForcedError()==1 || points.get(i).getUnforcedError()==1)
                pts++;
            }
        }
        return pts;
    }
           
    public int player1FstServes()
    {
        int fstServes = 0;
        for( int i = 0 ; i < points.size() ; i++ )
        {
            if( points.get(i).getServer().equals( player1Name() ) )
            {
                if( points.get(i).getFirst() == 1 )
                fstServes++;
            }
        }     
        return fstServes;
    }
    
    public int player2FstServes()
    {
        int fstServes = 0;
        for( int i = 0 ; i < points.size() ; i++ )
        {
            if( points.get(i).getServer().equals( player2Name() ) )
            {
                if( points.get(i).getFirst() == 1 )
                fstServes++;
            }
        }     
        return fstServes;
    }
    
    public int player1SndServes()
    {
        int SndServes = 0;
        for( int i = 0 ; i < points.size() ; i++ )
        {
            if( points.get(i).getServer().equals( player1Name() ) )
            {
                if( points.get(i).getFirst() == 1 )
                SndServes++;
            }
        }     
        return SndServes;
    }
    
    public int player2SndServes()
    {
        int SndServes = 0;
        for( int i = 0 ; i < points.size() ; i++ )
        {
            if( points.get(i).getServer().equals( player2Name() ) )
            {
                if( points.get(i).getFirst() == 1 )
                SndServes++;
            }
        }     
        return SndServes;
    }
}

