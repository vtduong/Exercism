class PrimeCalculator {

    int nth(int nth) {
    	int count = 0; //
    	int num = 2;
    	int prime = 0;

    	//increment count until it reaches nth
    	while (count <= nth){
    		//check if num is prime
    		if(isPrime(num)){
    			//increase count and assign prime
    			count++;
    			prime = num;
    		}
    		num++;
    	}
    	return prime;
    }

    private boolean isPrime(int num){
    	int max = (int)Math.sqrt(num);
    	int i = 2;
    	while(i < max){
    		if(num % i == 0)
    			return false;
    	}
    	return true;
    }

}
