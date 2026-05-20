package in.langfun.constructors;

//WAP to find sum & avg of all the 10th class student ..? 99 98 97 96 95 94
public class TestDemo1 {

	void main() {
		System.out.println("main method strated ");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double sum = 0;
		double avg = 0;
		
		for(int m:marks) {
			sum = sum +m;
		}
		
		avg = sum/marks.length;

		System.out.println("Total marks : " + sum);
		System.out.println("avg of all marks : " + avg);

	}

}
