import java.util.Random;

public class driver7 {

    public static void main(String args[]){
	//main method
	Q7 s = new Q7();
	Random r = new Random();
	Random coin = new Random();

	int num = 123;
	System.out.println(s.reverse(num));
	num = -123;
	System.out.println(s.reverse(num));
	num = 123456789;
	System.out.println(s.reverse(num));
	num = 1;
	System.out.println(s.reverse(num));
	num = 0;
	System.out.println(s.reverse(num));

	// for(int i = 0; i < 10; i++){
	//     num = r.nextInt(999);
	//     int flip = coin.nextInt(11);
	//     if (flip < 5){
	// 	num = num * -1;
	//     }
	//     System.out.println("The initial number is: " + num);
	//     System.out.println("The flipped number is: " + s.reverse(num));
	// }
	
    }

}
