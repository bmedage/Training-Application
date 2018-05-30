package this_keyword;

class Point{
	
	private int x;
	private int y;
	
	public Point() {
		x=1;
		y=1;
	}
	
	public Point(int x,int y){
		
		this.x=x;
		this.y=y;
	}
	
	public Point(Point p){
		this.x=p.x;
		this.y=p.y;
	}
	
	void printCoordinaate(){
		
		System.out.println("X="+ x + ", Y="+y);
	}
	
	
	void setX(int x){
		this.x=x;
	}
	
	
	void setY(int y){
		this.y=y;
	}
}

public class PointTest {

	public static void main(String[] args) {
		
	Point p1=new Point();
	p1.printCoordinaate();
	
	
	Point p2=new Point(10,20);
	p2.printCoordinaate();

	Point p3=new Point(p2);
	p3.printCoordinaate();
	
	Point p4=p3;
	
	
	
	
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	System.out.println(p3.hashCode());
	System.out.println(p4.hashCode());
	
	
	p4.setX(100);
	
	p4.printCoordinaate();
	p3.printCoordinaate();
	
	}

}
