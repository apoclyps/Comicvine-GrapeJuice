package uk.co.kyleharrison.grapejuice.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;

public class URLReader {

	private String url;
	private String response;

	public URLReader() {
		super();
	}

	public URLReader(String url) {
		super();
		this.url = url;
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

	public String readFromUrl() throws IOException {
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
		} catch (Exception e) {
			System.out.println("URL Reader Error : " + new Date().toString());
			e.printStackTrace();
		}
		is.close();
		return null;
	}

	public void resetURLReader() {
		this.url = null;
		this.response = null;
	}

}