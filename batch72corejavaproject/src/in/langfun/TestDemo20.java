package in.langfun;

//Q) wap to find sum & avg of 10th class student marks.
public class TestDemo20 {

	void main() {

		int[] marks = { 99, 98, 97, 96, 94, 93 };

		double sum = 0;//99 + 98 + 97 
		double avg = 0;
		
		for(int m:marks) {
			sum = sum + m;
		}
		
		avg = sum/marks.length;

		System.out.println("sum of all marks : " + sum);
		System.out.println("avg of all marks : " + avg);

	}

}
