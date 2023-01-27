package Day5ExceptionHand;

import java.util.HashMap;
public class CityList {
	private HashMap<Integer,String> cityList;
	public CityList() {
		cityList=new HashMap<>();
	}
	public void addCity(int zip,String city) {
		cityList.put(zip, city);
	}
	public HashMap<Integer, String> getCityList() {
		return cityList;
	}
	public String findCity(int zip)throws Exception {
		if(cityList.containsKey(zip))
			return cityList.get(zip);
		else {
			throw new Exception("City not found");
		}
	}
	
	public static void main(String args[]) {
		CityList c=new CityList();
		c.addCity(1, "abc");
		
		try {
			System.out.println(c.findCity(1));
		}catch(Exception e) {
			System.out.println(" exception caught");
		}
	}
	
}

