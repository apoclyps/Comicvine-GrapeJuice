Comicvine-GrapeJuice
====================
A set of java bindings for the comic vine API.

Features
=====================
Generic searches - can be preformed that will return a list of volumes containing the keywords.
Volume search    - A specific volume query can be preformed using the Query ID to return detailed information about the volume such as issues contained within.
Issue search - accepts a issue id and returns all information about that issue as an object to the volume object.

Caching with Cassandra
=====================
To reduce on the number of queries required to the ComicVineAPI. Queries will be cached in Cassandra. 
E.g. Publisher ID's will be stored to allow look-ups without the need for an additional query. Cassandra has been selected over MySQL due to large volume batch writes / reads that MySQL cannot consistently write/read.

Current Maven Dependancies
=====================

		<dependency>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpclient</artifactId>
			<version>4.0-alpha4</version>
		</dependency>

		<dependency>
			<groupId>com.google.code.gson</groupId>
			<artifactId>gson</artifactId>
			<version>2.2.4</version>
		</dependency>

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
		</dependency>

		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-io</artifactId>
			<version>1.3.2</version>
		</dependency>

		<dependency>
			<groupId>org.codehaus.jackson</groupId>
			<artifactId>jackson-core-asl</artifactId>
			<version>1.9.13</version>
		</dependency>
		
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>1.7.5</version>
		</dependency>
		
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-log4j12</artifactId>
			<version>1.7.5</version>
		</dependency>
		
		<dependency>
			<groupId>com.googlecode.json-simple</groupId>
			<artifactId>json-simple</artifactId>
			<version>1.1</version>
		</dependency>

		<dependency>
			<groupId>org.codehaus.jackson</groupId>
			<artifactId>jackson-mapper-asl</artifactId>
			<version>1.9.13</version>
		</dependency>
