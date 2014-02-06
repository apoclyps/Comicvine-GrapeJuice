import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import uk.co.kyleharrison.grapejuice.utils.URLReader;

public class Main {

	public static void main(String[] args) {
		URLReader urlReader = new URLReader();
		urlReader.setUrl("http://www.comicvine.com/api/publishers/?api_key=2736f1620710c52159ba0d0aea337c59bd273816&format=json&sort=name&field_list=name,id&offset=2300");;
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
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
