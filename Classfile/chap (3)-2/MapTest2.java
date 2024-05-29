import java.util.*;

class MapTest2 
{
	public static void main(String[] args) 
	{
		Map<String, String> favoriteFruits = new HashMap<String, String> ();
		favoriteFruits.put("Apple", "High");
		favoriteFruits.put("Orange","Medium");
		favoriteFruits.put("Grape","High");
		favoriteFruits.put("Banana","Low");

		Set<String> keySet = favoriteFruits.keySet();
		System.out.println("Key  " + " : " + "value");
		for (String key : keySet )
		{
			String value = favoriteFruits.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
