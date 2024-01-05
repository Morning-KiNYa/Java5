
public class Main6c {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double bottom = 10.0;
		double height = 5.0;
		double triangleArea = calcTriangleArea(bottom,height);
		System.out.println("三角形の底辺の長さが"+bottom+"cm、高さが"+height+"cmの場合、"
				+ "面積は"+triangleArea+"㎠");
		
		double radius = 5.0;
		double circleArea = calcCircleArea(radius);
		System.out.println("円の半径が"+radius+"cmの場合、面積は"+circleArea+"㎠");
		calcCircleArea(5);
	}
	
	public static double calcTriangleArea(double bottom,double height) {
		double triangleArea = bottom*height/2;
		return triangleArea;
	}
	
	public static double calcCircleArea(double radius) {
		double circleArea = radius*radius*3.14;
		return circleArea;
	}

}
