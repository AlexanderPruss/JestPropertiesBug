package spring.boot.bug;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultListPropertiesTest {

	@Autowired
	private DefaultListProperties properties;

	/**
	 * BUG:
	 * 1. The configured list in application.yml is a list with a single element, "bar".
	 * 2. The default value of the list in DefaultListProperties is a list with two elements : {"foo", "foo"}
	 * 3. Instead of replacing the default value, the configured list is put into the beginning of the list.
	 * Result: {"bar", "foo"}.
	 */
	@Test
	public void listEqualsConfiguredList() {
		assertEquals(1, properties.getConfiguredList());
	}

}
