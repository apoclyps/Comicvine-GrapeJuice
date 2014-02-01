package uk.co.kyleharrison.grapejuice.model.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class ConsumeAPI {

	public static void main(String [] arguments){
		

		try {
			readJsonFromUrl("https://mbchb.dundee.ac.uk/category/year1/feed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

	  public static JsonObject readJsonFromUrl(String url) throws IOException {
	    InputStream is = new URL(url).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	   //   Gson gson = new Gson();
	      JsonObject json = new JsonObject();
	   //   json = gson.fromJson(jsonText, JsonObject.class);
	      
	      System.out.println(jsonText);
	      
	      return json;
	    } finally {
	      is.close();
	    }
	  }
	
}
	



