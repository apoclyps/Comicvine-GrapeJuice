package uk.co.kyleharrison.grapejuice.comicvine;

public class ComicVineResponse {

    public String Status;
    public String ErrorMessage;
    public String Response;
    
    public ComicVineResponse() {
		super();
		Status = null;
		ErrorMessage = null;
		Response = null;
	}
    
	public ComicVineResponse(String status, String errorMessage, String response) {
		super();
		Status = status;
		ErrorMessage = errorMessage;
		Response = response;
	}
	
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getErrorMessage() {
		return ErrorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	}
    
    
    
}
