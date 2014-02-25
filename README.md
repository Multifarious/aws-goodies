# aws-goodies
----

This repository collects odds and ends useful for accessing AWS from [Dropwizard](http://dropwizard.codahale.com/)
services.

## Access with Maven

### Coordinates

Include the following in your `pom.xml`:

<pre>
&lt;dependency>
  &lt;groupId>io.ifar.aws-goodies&lt;/groupId>
  &lt;artifactId>aws-goodies&lt;/artifactId>
  &lt;version>${version}&lt;/version>
&lt;/dependency>
</pre>

Where `${version}` is the version you want to depend on.

### Snapshots

Snapshots are available from the Sonatype OSS snapshot repository:

<pre>
&lt;repository>
  &lt;id>sonatype-oss-snapshots&lt;/id>
  &lt;name>Sonatype OSS Snapshot Repository&lt;/name>
  &lt;url>https://oss.sonatype.org/content/repositories/snapshots/&lt;/url>
  &lt;snapshots>
    &lt;enabled>true&lt;/enabled>
  &lt;/snapshots>
  &lt;releases>
    &lt;enabled>false&lt;/enabled>
  &lt;/releases>
&lt;/repository>
</pre>

### Releases

Releases are published on Maven Central.

## License

The license is [BSD 2-clause](http://opensource.org/licenses/BSD-2-Clause).  This information is also present in the `LICENSE` file and in the `pom.xml`.
