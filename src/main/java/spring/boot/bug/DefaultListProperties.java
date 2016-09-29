package spring.boot.bug;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates weird behavior with default property list values.
 * The configured list doesn't replace the default property, but is instead copied into
 * the beginning of the default list.
 */
@Configuration
@ConfigurationProperties("defaultListProperties")
public class DefaultListProperties {

	private List<String> configuredList = new ArrayList<>(Arrays.asList("foo", "foo"));

	public List<String> getConfiguredList() {
		return configuredList;
	}

	public void setConfiguredList(final List<String> configuredList) {
		this.configuredList = configuredList;
	}
}
