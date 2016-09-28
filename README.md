A simple project to demonstrate a bug with the autoconfigured JestProperties. 

Trying to start the spring application will result in a crash, because Spring attempts to set() the configured URI into the unmodifiable URI list in JestProperties.

    @ConfigurationProperties("spring.elasticsearch.jest")
    public class JestProperties {

	/**
	 * Comma-separated list of the Elasticsearch instances to use.
	 */
	private List<String> uris = Collections.singletonList("http://localhost:9200");