import java.util.Scanner;

/**
 * 
 * @author subash
 *
 */
public class Euler1 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		int totalLoop = sc.nextInt();
		
		int[] testcaselist = new int[totalLoop];
		
		// Loop Start
		for(int i= 0; i < totalLoop; i++){
			testcaselist[i] = sc.nextInt(); 
		}
		
		for(int j=0; j < testcaselist.length; j++){
			System.out.println(testcaselist[j]);
		}
	}

}
