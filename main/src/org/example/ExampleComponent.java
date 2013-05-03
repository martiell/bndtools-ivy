package org.example;

import org.apache.commons.lang.time.FastDateFormat;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;

@Component
public class ExampleComponent {

	@Activate
	public void x() {
		FastDateFormat fmt = FastDateFormat.getInstance("HH:mm:ss");
		long time = System.currentTimeMillis();
		System.out.println("Hello, it's " + fmt.format(time));
	}

}
