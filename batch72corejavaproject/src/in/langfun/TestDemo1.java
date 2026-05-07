package in.langfun;

//WAP to find sum and avg of 10th class student marks..?
public class TestDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		
		double sum = 0;//99 197 
		double avg = 0;
		
		for(int m:marks) {
			sum = sum + m;
		}

		avg = sum/marks.length;
		
		System.out.println("sum of total mark : " + sum );
		System.out.println("avg of all marks : " + avg);

	}

}
