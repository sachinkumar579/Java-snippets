// https://www.hackerrank.com/challenges/count-triplets-1

public class CountTriplets {

	public static void main(String[] args) {
;
		Long[] arr = new Long[]{1L,3L,9L}; 
		
		long number = 0;
		long ratio = 3;
		int[] nterms = new int[arr.length];
		int counter = 0;
                int finalCount =0;
		
		for (int i = 0; i < arr.length; i++) {
			number = arr[i];
			counter = 0;
			if (number == 1) {
				counter = 0;
			}
			while (number != 1) {
				if (number % ratio == 0) {
					counter++;
					number = number / ratio;
				} else if (number == ratio && number % ratio == 0) {
					counter++;
					number = 1;
				} else {
					number = 1;
					counter = -1;
				}
			}
			nterms[i] = counter;
		}

		for (int j = 0; j < nterms.length - 2; j++) {
			for (int k = j + 1; k < nterms.length - 1; k++) {
				if (nterms[k] == nterms[j] + 1) {
					for (int l = k + 1; l < nterms.length; l++) {
						if (nterms[l] == nterms[k] + 1) {
							System.out.println(j + "," + k + "," + l);
							finalCount=finalCount+1;
						}

					}
				}
			}
		}
		
		System.out.println(finalCount);
	}

}
