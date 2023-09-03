package com.training.quest1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,List<String>> hashMap = new HashMap<>();
		List<String> AndhraCity=new ArrayList<String>();
		AndhraCity.add("Vijayawada");

		AndhraCity.add("Guntur");
		AndhraCity.add("Khamam");
		AndhraCity.add("Tenali");
		AndhraCity.add("Kondapli");
		
		
		List<String> TelanganaCity=new ArrayList<String>();
		TelanganaCity.add("Hyderabad");
		TelanganaCity.add("Mhabubabad");
		TelanganaCity.add("Warangal");
		TelanganaCity.add("Nijambad");
		TelanganaCity.add("Old city");
		
		List<String> KaranatakaCity= new ArrayList<String>();
		KaranatakaCity.add("Banglore");
		KaranatakaCity.add("Krishnarajpura");
		KaranatakaCity.add("Mg road");
		KaranatakaCity.add("Marthali");
		KaranatakaCity.add("Koramangal");
		
		hashMap.put("Andhrapradaesh", AndhraCity);
		hashMap.put("Telangan", TelanganaCity);
		hashMap.put("Karantaka", KaranatakaCity);
		
		//System.out.println(hashMap.get("Andhrapradesh"));
		Set<String>keys=hashMap.keySet();
		for(String key:keys) {
			System.out.println(key+" "+hashMap.get(key));
		}
         
	}

}
