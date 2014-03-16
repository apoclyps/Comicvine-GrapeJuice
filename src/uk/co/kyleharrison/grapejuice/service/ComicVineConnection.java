package uk.co.kyleharrison.grapejuice.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineResponse;
import uk.co.kyleharrison.grapejuice.utils.URLReader;

public class ComicVineConnection {

	private ComicVineResponse comicVineResponse;
	
	public ComicVineConnection(ComicVineResponse comicVineResponse) {
		super();
		this.comicVineResponse = comicVineResponse;
	}

	public ComicVineConnection() {
		super();
	}

	public ComicVineResponse ConnectAndRequest(String query){
		
		comicVineResponse = new ComicVineResponse();
		
		//HTTP Web Request
		URLReader urlReader = new URLReader();
		urlReader.setUrl(query);
		
		JSONObject jso = convertStringToJSONObject(urlReader.readFromUrl());
		
		if(!(jso.equals(null))){
			checkResults(jso);
		}
		
		return getComicVineResponse();
	}
	
	public JSONObject convertStringToJSONObject(String jsonResponse){
		try {
			return  (JSONObject)new JSONParser().parse(jsonResponse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean checkResults(JSONObject json){
		
		if(json!=null){
			System.out.println(json.toJSONString());
			
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
			
/*			for(Object obj : jsonArray2){
				JSONObject jsoObj = (JSONObject) obj;
			//	mapToPojo(jsoObj);
			}*/
		}
		return false;
	}

	public ComicVineResponse getComicVineResponse() {
		return comicVineResponse;
	}

	public void setComicVineResponse(ComicVineResponse comicVineResponse) {
		this.comicVineResponse = comicVineResponse;
	}
}
