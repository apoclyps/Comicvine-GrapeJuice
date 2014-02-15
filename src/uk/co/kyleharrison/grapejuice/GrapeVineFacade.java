package uk.co.kyleharrison.grapejuice;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.utils.URLReader;

public class GrapeVineFacade {

	public GrapeVineFacade(){
		super();
	}
	
	public String PreformQuery(String query){
		URLReader urlReader = new URLReader();
		urlReader.setUrl(query);;
		String jsonResponse = urlReader.readFromUrl();
		System.out.println(jsonResponse);
		JSONObject json =null;
		if(jsonResponse!=null){
			try {
				json = (JSONObject)new JSONParser().parse(jsonResponse);
				System.out.println(json);
				
			    //System.out.println(json.get("error").toString());
				//System.out.println(json.get("status_code"));
				
				if(Integer.parseInt(json.get("status_code").toString())==1){
					//System.out.println(json.get("status_code"));
					//System.out.println(json.get("results"));
				}
				
				if(json.get("error").toString().equalsIgnoreCase("OK")){
					//System.out.println(json.get("error"));
					//System.out.println(json.get("results"));
				}
				
				JSONArray jsonArray2 = (JSONArray) json.get("results");
				System.out.println(jsonArray2.toString());
				
				for(Object obj : jsonArray2){
					JSONObject jsoObj = (JSONObject) obj;
					try{
					if(jsoObj.containsKey("name")){
						if(!(jsoObj.get("name").toString().equals("null"))){
						System.out.println(jsoObj.get("id")+ " : " +jsoObj.get("name"));
						}
					mapToPojo(jsoObj);
					}}
					catch(NullPointerException e){
						//e.printStackTrace();
					}
				}
				System.out.println("Total Results : "+jsonArray2.size());
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return json.toString();
	}
	
	public static void mapToPojo(JSONObject json){
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			ComicVineVolume user = mapper.readValue(json.toJSONString(), ComicVineVolume.class);
			System.out.println(user.getId() + " "+ user.getName());
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
