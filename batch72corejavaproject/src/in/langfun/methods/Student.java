package in.langfun.methods;

//WAP to find sum & avg of all the marks of 10th class student ..? 
public class Student {

	void main() {

		System.out.println("main method started");

		int[] marks = { 99, 98, 97, 96, 95, 94 };

		double sum = 0;
		double avg = 0;
		
		for(int m : marks) {
			sum = sum + m;
		}
		
		avg = sum/marks.length;
		
		System.out.println("sum = : " + sum);
		System.out.println("avg = : " + avg);

	}

}
