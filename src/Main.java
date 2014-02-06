import uk.co.kyleharrison.grapejuice.utils.URLReader;

public class Main {

	public static void main(String[] args) {
		URLReader urlReader = new URLReader();
		urlReader.setUrl("http://www.comicvine.com/api/publishers/?api_key=2736f1620710c52159ba0d0aea337c59bd273816&format=json&sort=name&field_list=name,id&offset=2300");;
		System.out.println(urlReader.readFromUrl());

	}

}
