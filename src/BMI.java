
public class BMI {
	// 練習問題1-6

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("身長を入力してください(cm)>>");
		double height = new java.util.Scanner(System.in).nextInt();
		System.out.print("体重を入力してください(kg)>>");
		double weight = new java.util.Scanner(System.in).nextInt();
		System.out.println("あなたのBMIは"+getBMI(height,weight)+"です");
		
	}
	public static double getBMI(double heightCm, double weightKg) {
		double heightM = heightCm/100;
		return weightKg / (heightM*heightM);
	}
}
