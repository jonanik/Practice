import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		Collections.shuffle(list);
		for(int i=0; i<5;i++) {
			System.out.println(list.get(i));
			
		}
	}

}

class Num {

}