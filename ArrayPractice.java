
public class ArrayPractice {

	public static void main(String[] args) {
		int size = 10000000;
		double[] date = new double[size];
		System.out.println("data: " + data);
		Random random - new Random();
		random.setSeed(22);;
		for(int i = 0; i < data.length; i++)
			data[i] = random.nextDouble(size*100);
		
		System.out.printlln("data[453562] is " + data[453562]);
	}

}
