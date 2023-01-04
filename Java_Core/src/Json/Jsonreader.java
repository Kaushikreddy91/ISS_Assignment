package Json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Jsonreader {

	public static void main(String[] args) {
		JSONParser jsonP=new JSONParser();
		
		try(FileReader reader=new FileReader("stud.json")){
			Object obj=jsonP.parse(reader);
			JSONArray studlist=(JSONArray) obj;
			System.out.println(studlist);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
