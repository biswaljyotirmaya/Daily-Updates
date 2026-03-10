package outer;

import org.springframework.stereotype.Component;

@Component
public class OuterClass {
	OuterClass() {
		System.out.println("OuterClass--------------------------");
	}
}
