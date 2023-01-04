package Json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Jsonwriter {
	
	/*
	 * [
	 * 		Student[
	 * 					Name:Kaushik,
	 * 					Roll_no:192023,
	 * 					Branch:MPC,
	 * 					Percentage:85,
	 * 					Status:Passed
	 * 					
	 * 		],
	 * ]
	 */
	public static void main(String[] args) {
		
		JSONObject kaushik=new JSONObject();
		kaushik.put("Name","Kaushik");
		kaushik.put("Roll_no","192023");
		kaushik.put("Branch","MPC");
		kaushik.put("Percentage","88");
		kaushik.put("Status","Passed");
		
		JSONObject Virat=new JSONObject();
		Virat.put("Name","Virat");
		Virat.put("Roll_no","212023");
		Virat.put("Branch","MEC");
		Virat.put("Percentage","28");
		Virat.put("Status","Failed");
		
		JSONArray studlist=new JSONArray();
		studlist.add(kaushik);
		studlist.add(Virat);
		
		try(FileWriter file =new FileWriter("stud.json")){
			file.write(studlist.toJSONString());
			System.out.println("Completed");
			file.flush();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
