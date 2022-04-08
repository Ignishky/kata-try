import io.vavr.collection.List;

public class PrimeFilter {

    public static void filter(String[] args) {

	System.out.println(List.range(0, Integer.parseInt(args[0])).filter(PrimeFilter::isPrime));

	System.out.println(args[1]);


    }

	private static Boolean isPrime(Integer toBeTested) {
		
		if(toBeTested == 0 || toBeTested == 1) {
			return false;
		}

		for (Integer dividor = 2; dividor < toBeTested-1 ; dividor++) {

                        if ( toBeTested % dividor == 0) {

                		return false;	                

                        }

                }

		return true;
	}

}
