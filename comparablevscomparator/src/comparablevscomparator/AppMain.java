package comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppMain {

	public static void main(String[] args) {

		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Genesis", 3000, 8200));
		cars.add(new Car("X90", 2400, 7700));
		cars.add(new Car("Model-Y", 2000, 9000));
		cars.add(new Car("Wrangler", 3000, 6000));
		cars.add(new Car("S-class", 3000, 15300));
			
		Collections.sort(cars, (o1, o2)->(o1.getPrice()>o2.getPrice()?1:-1));
		
		for(Car c : cars) {
			System.out.println(c.toString());
		}
	}
}
