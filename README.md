A simple project to demonstrate a bug with `@ConfigurationProperties` classes that have default list property values.

Although a list of length one is configured in application.yml, the resulting list in `DefaultListProperties` still has two elements.