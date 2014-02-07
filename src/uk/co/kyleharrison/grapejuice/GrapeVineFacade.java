package uk.co.kyleharrison.grapejuice;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return json.toString();
	}
	
}
