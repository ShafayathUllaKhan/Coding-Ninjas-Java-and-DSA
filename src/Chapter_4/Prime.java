package Chapter_4;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2;i<=50;i++) {
			boolean isPrime = true;
			
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i + "is a prime number");
			}
		}
	}
}
//
//Okay — let’s strip it down to just the basics, no fancy math talk.
//
//1. What we’re doing
//We want to check if a number is prime.
//A prime number has only 2 divisors: 1 and itself.
//
//2. Your way now
//You’re checking all numbers from 1 to i.
//Example: For i = 50, you check:
//
//Copy
//Edit
//1, 2, 3, 4, ..., 50
//That’s a lot of work.
//
//3. The trick
//If a number is not prime, it can be split into two numbers that multiply to make it.
//
//Example:
//
//50 = 2 × 25
//
//50 = 5 × 10
//
//Here’s the trick: One of those two numbers will always be smaller than or equal to the square root of 50.
//
//4. Why that’s true
//Take the square root of 50:
//
//50
//≈
//7.07
//50
//​
// ≈7.07
//If both factors were bigger than 7,
//for example 8 × 8 = 64,
//then the result would be bigger than 50.
//So that can’t happen.
//This means you only need to check up to 7, not all the way to 50.
//
//5. Example with 49
//√49 = 7
//
//Divisors: 1, 7, 49
//
//Once you hit 7, you’ve already found a factor — no need to check the rest.
//
//✅ Simple rule:
//To see if a number is prime, check only from 2 up to its square root.
//If no divisors are found, the number is prime.

//Almost right — you’ve got the core idea, but there’s a small twist.
//
//For a number to be prime, it must not have any factors (other than 1 and itself) that are less than or equal to its square root.
//
//Let’s break your example:
//
//n = 20
//
//20
//≈
//4.47
//20
//​
// ≈4.47
//
//Factors of 20: (1, 20), (2, 10), (4, 5)
//
//Here’s why it’s not prime:
//
//We find 4, which is less than 
//20
//20
//​
//  ✅ (means composite, not prime)
//
//As soon as we find one such factor ≤ √n, we can stop — the number is composite.
//
//For a number to be prime:
//
//No factor (other than 1) exists that is ≤ √n.
//
//Example: n = 19
//
//19
//≈
//4.35
//19
//​
// ≈4.35
//
//Check 2, 3, 4 → none divide 19 → prime ✅
//
//So your sentence could be refined to:
//
//"For a number to be prime, there must be no factors (other than 1) that are less than or equal to its square root."