package uk.co.kyleharrison.grapejuice.facade;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;
import uk.co.kyleharrison.grapejuice.utils.URLReader;

public class GrapeVineFacade {

	private ArrayList<ComicVineVolume> comicVineVolumes;
	private long limit = 100;
	private long offset = 0;
	private long number_of_page_results = 0;
	private long number_of_total_results = 0;

	public GrapeVineFacade() {
		super();
		comicVineVolumes = new ArrayList<ComicVineVolume>();
	}

	public long getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public long getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public long getNumber_of_page_result() {
		return number_of_page_results;
	}

	public void setNumber_of_page_result(int number_of_page_result) {
		this.number_of_page_results = number_of_page_result;
	}

	public long getNumber_of_total_results() {
		return number_of_total_results;
	}

	public void setNumber_of_total_results(int number_of_total_results) {
		this.number_of_total_results = number_of_total_results;
	}

	public ArrayList<ComicVineVolume> getComicVineVolumes() {
		return comicVineVolumes;
	}

	public void setComicVineVolumes(ArrayList<ComicVineVolume> comicVineVolumes) {
		this.comicVineVolumes = comicVineVolumes;
	}

	public String PreformQuery(String query) {
		URLReader urlReader = new URLReader();
		urlReader.setUrl(query);
		;
		String jsonResponse = urlReader.readFromUrl();
		System.out.println(jsonResponse);
		JSONObject json = null;
		if (jsonResponse != null) {
			try {
				json = (JSONObject) new JSONParser().parse(jsonResponse);
				System.out.println(json);

				// System.out.println(json.get("error").toString());
				// System.out.println(json.get("status_code"));

				if (Integer.parseInt(json.get("status_code").toString()) == 1) {
					// System.out.println(json.get("status_code"));
					// System.out.println(json.get("results"));
				}

				if (json.get("error").toString().equalsIgnoreCase("OK")) {
					// System.out.println(json.get("error"));
					// System.out.println(json.get("results"));
				}

				number_of_page_results = (long) json
						.get("number_of_page_results");
				limit = (long) json.get("limit");
				offset = (long) json.get("offset");
				number_of_total_results = (long) json
						.get("number_of_total_results");

				JSONArray jsonArray2 = (JSONArray) json.get("results");
				System.out.println(jsonArray2.toString());

				this.comicVineVolumes = new ArrayList<ComicVineVolume>();

				for (Object obj : jsonArray2) {
					JSONObject jsoObj = (JSONObject) obj;
					try {
						if (jsoObj.containsKey("name")) {
							if (!(jsoObj.get("name").toString().equals("null"))) {
								System.out.println(jsoObj.get("id") + " : "
										+ jsoObj.get("name"));
							}
							mapToPojo(jsoObj);
						}
					} catch (NullPointerException e) {
						// e.printStackTrace();
					}
				}
				System.out.println("Total Results : " + jsonArray2.size());

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return json.toString();
	}

	public void mapToPojo(JSONObject json) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			ComicVineVolume comicVineVolume = mapper.readValue(
					json.toJSONString(), ComicVineVolume.class);
			this.comicVineVolumes.add(comicVineVolume);
			System.out.println(comicVineVolume.getId() + " "
					+ comicVineVolume.getName());
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