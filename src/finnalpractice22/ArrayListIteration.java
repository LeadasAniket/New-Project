package finnalpractice22;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String>tvSeries = new ArrayList<String>();
		tvSeries.add("MY NAME IS KHAN");
		tvSeries.add("BAJIGAR");
		tvSeries.add("BADASHAHA");
		
		tvSeries.forEach(shows->{
			
			System.out.println(shows);
		});
		

	}

}
