package this_keyword;

class Point_Demo{
	
	private int x;
	private int y;
	
	public Point_Demo() {
		this(1,1);
		System.out.println("-----------Default()-----");
		
	}
	
	public Point_Demo(int x,int y){
		System.out.println("-----------Parameterized (x,y)-----");	
		this.x=x;
		this.y=y;
	}
	
	public Point_Demo(Point_Demo p){
		this(p.x,p.y);
		System.out.println("-----------Point()-----");
	}
	
	void printCoordinaate(){
		
		System.out.println("X="+ x + ", Y="+y);
	}
	
}


public class TestDemo {

	public static void main(String[] args) {
		
		Point_Demo p1=new Point_Demo();
		p1.printCoordinaate();
		
		
		
		Point_Demo p2=new Point_Demo(20,30);
		p2.printCoordinaate();
		
		Point_Demo p3=new Point_Demo(p2);
		p3.printCoordinaate();
		
	}
}
