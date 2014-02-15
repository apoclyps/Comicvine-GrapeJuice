import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVinePublisher;
import uk.co.kyleharrison.grapejuice.comicvine.ComicVineResponse;
import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.service.ComicVineConnection;
import uk.co.kyleharrison.grapejuice.utils.URLReader;

public class Main {

	public static void main(String[] args) {
		
		ComicVineConnection cvc = new ComicVineConnection();
		ComicVineResponse cvr = cvc.ConnectAndRequest("http://www.comicvine.com/api/publishers/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
				+ "&format=json&sort=id:asc&field_list=name,id&offset=0");
		System.out.println("cvr"+cvr.toString());
		/*
		
		URLReader urlReader = new URLReader();
		urlReader.setUrl("http://www.comicvine.com/api/publishers/?api_key=2736f1620710c52159ba0d0aea337c59bd273816"
				+ "&format=json&sort=id:asc&field_list=name,id&offset=0");;
		String jsonResponse = urlReader.readFromUrl();
		System.out.println(jsonResponse);
		
		if(jsonResponse!=null){
			try {
				JSONObject json = (JSONObject)new JSONParser().parse(jsonResponse);
				System.out.println(json);
				
				System.out.println(json.get("error").toString());
				System.out.println(json.get("status_code"));
				
				if(Integer.parseInt(json.get("status_code").toString())==1){
					System.out.println(json.get("status_code"));
					System.out.println(json.get("results"));
				}
				
				if(json.get("error").toString().equalsIgnoreCase("OK")){
					System.out.println(json.get("error"));
					System.out.println(json.get("results"));
				}
				
				//JSONArray jsonArray = (JSONArray)new JSONParser().parse(json.get("results").toString());
				//System.out.println(jsonArray.toString());
				JSONArray jsonArray2 = (JSONArray) json.get("results");
				System.out.println(jsonArray2.toString());
				
				for(Object obj : jsonArray2){
					JSONObject jsoObj = (JSONObject) obj;
					mapToPojo(jsoObj);
				}
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
		
		public static void mapToPojo(JSONObject json){
			ObjectMapper mapper = new ObjectMapper();
			
			try {
				ComicVinePublisher user = mapper.readValue(json.toJSONString(), ComicVinePublisher.class);
				System.out.println(user.getId() + " "+ user.getName()+ " : ");
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

}
