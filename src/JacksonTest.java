import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import uk.co.kyleharrison.grapejuice.comicvine.ComicVineVolume;


public class JacksonTest {

	public static void main(String [] arguments){
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			ComicVineVolume user = mapper.readValue(new File("c:\\json.txt"), ComicVineVolume.class);
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
