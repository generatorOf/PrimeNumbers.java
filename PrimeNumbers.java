import java.util.ArrayList;

// A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
// Write a method that returns all prime numbers up to a given number.

public class PrimeNumbers {
    
    public static ArrayList getPrimesUntil(int last) {
	
	ArrayList<Integer> primes = new ArrayList<>();
	
	primes.add(2);
	for (int candidate=3; candidate<= last; candidate+=2) {
	    boolean isprime = true;
	    int candidate_sqrt = (int) (Math.sqrt((double) candidate));
	  
	    
	    for (int i =0; i < primes.size() ; i++) {
		if (candidate % primes.get(i) == 0) {  
		    isprime = false;
		    break;
		    };
		if (primes.get(i) > candidate_sqrt) break;	 
	    }
	    if (isprime==true) {
		primes.add(candidate);
		    
	    }
	    
	} 
	
	System.out.println("until" + last + "there found" + primes.size() + " prime numbers");
	return primes;
    }
    
    public static void main (String[] args) {
	
	System.out.println(getPrimesUntil(10_000_000));
	// it took about 3 sec to get printed result,
	//but the output of the arraylist was not finished for ca. 10 sec more
	
	
	
    }

}