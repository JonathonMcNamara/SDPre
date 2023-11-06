public class Objective7Lab4 {
	public static void main (String[] args){
	int count = 0;
	int total = 1;
	int sum = 0;

	while(count <20){
	count++;
	sum += total;
	total++;
	}
	System.out.println(sum);
	}
}