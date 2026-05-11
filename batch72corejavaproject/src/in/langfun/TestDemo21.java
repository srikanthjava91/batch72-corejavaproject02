package in.langfun;

//WAP to find total sum & avg of 10th class student marks..?
public class TestDemo21 {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		double sum = 0;
		double avg = 0;
		
		for(int m : marks) {
			sum = sum + m;
		}

		avg = sum/marks.length;
		
		System.out.println("Total marks : " + sum);
		System.out.println("avg marks  " + avg);

	}

}
