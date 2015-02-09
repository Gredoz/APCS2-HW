public class Solutions{

    //This codingbat question is the same as the fib(n) function you wanted
    //us to write
    public int fibonacci(int n) {
	if (n == 1) {
	    return 1;
	}
	if (n == 0) {
	    return 0;
	}
	else {
	    return fibonacci(n-1) + fibonacci(n-2);
	}
    }

    public int len(String s) {
	if (s.length() == 1){
	    return 1;
	}
	else{
	    return 1 + len.substring(1, s.length());
	}
    }

    //This codingbat question is the same as count(s,c) you wanted us to write
    public int strCount(String str, String sub) {
	int ans = 0;
	//base case
	if (str.length() == 0){
	    return 0;
	}
	if (str.length() == sub.length()-1){
	    return 0;
	}
      
	//testing
	if (str.substring(0, sub.length()).equals(sub) == true){
	    return 1 + strCount(str.substring(sub.length(), str.length()), sub);
	}
	if (str.substring(0, sub.length()).equals(sub) == false){
	    return strCount(str.substring(1, str.length()), sub);
	}
	return 0;

    }

    //THESE ARE THE SOLUTIONS TO THE CODINGBAT QUESTIONS
    public int bunnyEars2(int bunnies) {
	if (bunnies == 0){
	    return 0;
	}
 
	if (bunnies%2 == 0){
	    return 3 + bunnyEars2(bunnies-1);
	}
	if (bunnies%2 == 1){
	    return 2 + bunnyEars2(bunnies-1);
	}
	return 0;
    }



    public int sumDigits(int n) {
	if (n/10==0){
	    return n;
	}

	return n%10 + sumDigits(n/10);
    }



    public String allStar(String str) {
	if (str.length()==0){
	    return "";
	}
	if (str.length()==1){
	    return str;
	}
	return str.substring(0,1) + "*" + allStar(str.substring(1, str.length()));
  
    }

}