package uk.co.kyleharrison.grapejuice.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class URLReader {

	private String url;
	private String response;
	private Logger logger;

	public URLReader() {
		super();
		logger = LoggerFactory.getLogger(URLReader.class);
	}

	public URLReader(String url) {
		super();
		this.url = url;
		logger = LoggerFactory.getLogger(URLReader.class);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getResponse() {
		return response;
	}

	private String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public String readFromUrl() {
		InputStream is = null;
		try {
			is = new URL(this.url).openStream();

			BufferedReader rd = new BufferedReader(new InputStreamReader(is,
					Charset.forName("UTF-8")));
			this.response = readAll(rd);
			is.close();
			return this.response;
		} catch (IOException e1) {
			e1.printStackTrace();
			logger.info("CLASS : URLReader \t IOException readFromURL \t"+ new Date().toString());
		} catch (Exception e) {
			System.out.println("URL Reader Error : " + new Date().toString());
			e.printStackTrace();
			logger.info("CLASS : URLReader \t Exception readFromURL \t"+ new Date().toString());
		}
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
			logger.info("CLASS : URLReader \t IOException closing connection \t"+ new Date().toString());
		}
		return null;
	}

	public void resetURLReader() {
		this.url = null;
		this.response = null;
	}

}