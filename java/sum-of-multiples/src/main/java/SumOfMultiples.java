import java.util.ArrayList;
class SumOfMultiples {
	int sum = 0;

    SumOfMultiples(int number, int[] set) {
        //for each number in the set, find multiples, compare with number, then add them to the list
        ArrayList<Integer> multiples = new ArrayList<>();
        for (int i = 0; i < set.length; i++){
        	int product = 0;
        	int multiplier = 1;
        	while(product < number){
        		//only keep unique values
        		if(!multiples.contains(product)){

        			multiples.add(product);
        			//add product to sum
        			sum += product;
        		}
        		
        		product = set[i] * multiplier;
        		multiplier++;
        	}

        }
        
    }

    int getSum() {
        return sum;
    }

}
