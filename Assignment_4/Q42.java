/*42.	Create a class Tile to store the edge
 length of a square tile, and create another 
class Floor to store length and width of a
 rectangular floor. Add method totalTiles(Tile t) 
in Floor class with Tile as argument to calculate
 the whole number of tiles needed to cover the
 floor completely */
import java.util.*;

class Tile{
	
	private static int edgeLength;
	
	Tile(int edgeLength) 
        {  
        this.edgeLength = edgeLength; 
        }
		
			
	static int areaOfTile() 
        { 
        return (edgeLength * edgeLength);
        }
		
		
}

class Floor{	
	private static int length;
	private static int width;
	
	Floor(int length,int width) 
        {
		this.length = length;
		this.width = width;
	}
	
	static int totalTiles(int Tile_t) 
        {		
		return ((length * width) / Tile_t);
	}
	
}

public class Q43{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of square tile.");
		int edgeLength = sc.nextInt();
		
		Tile obj = new Tile(edgeLength);
		int Tile_t = Tile.areaOfTile();
		
		System.out.println("Enter length and width of floor.");
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		Floor obj1 = new Floor(length, width);
		
		int res = Floor.totalTiles(Tile_t);
		System.out.println("total tiles required for the floor are: "+res);
	}
}
