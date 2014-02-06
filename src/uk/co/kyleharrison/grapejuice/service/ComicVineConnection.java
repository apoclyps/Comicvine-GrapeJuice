package uk.co.kyleharrison.grapejuice.service;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineResponse;
import uk.co.kyleharrison.grapejuice.utils.URLReader;

public class ComicVineConnection {

	private ComicVineResponse comicVineResponse;
	
	public ComicVineConnection(ComicVineResponse comicVineResponse) {
		super();
		this.comicVineResponse = comicVineResponse;
	}

	public ComicVineResponse ConnectAndRequest(String query){
		
		setComicVineResponse(new ComicVineResponse());
		
		//HTTP Web Request
		
		//Get Response
		//comicVineResponse.Status = "OK";
        // comicVineResponse.Response = streamReader.ReadToEnd();
		//webResponse.Close();
		
		URLReader urlReader = new URLReader();
		urlReader.setUrl(query);
		
		return getComicVineResponse();
	}

	public ComicVineResponse getComicVineResponse() {
		return comicVineResponse;
	}

	public void setComicVineResponse(ComicVineResponse comicVineResponse) {
		this.comicVineResponse = comicVineResponse;
	}
}
