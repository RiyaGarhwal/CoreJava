package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {

	public static void main(String[] args) {

		List<Contestent> list = new ArrayList<Contestent>();

		list.add(new Contestent("Sanat ", "8764886373"));
		list.add(new Contestent("Riya", "9837783687"));
		list.add(new Contestent("Prakhar", "7773566355"));
		list.add(new Contestent("Rahul", "8377673678"));
		list.add(new Contestent("Deepak", "9764836477"));
		list.add(new Contestent("lavish", "7455635673"));
		list.add(new Contestent("Pooja", "8366833873"));

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}

}
