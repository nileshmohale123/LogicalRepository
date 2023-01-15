//we want to insert three (Key, Value) pair in the HashMap
public class HashMap {

	public static void main(String[] args) {

		java.util.HashMap<String, Integer> map = new java.util.HashMap<>();

		map.put("Nilesh", 1);
		map.put("Kumar", 33);
		map.put("Karktk", 44);

		map.get(1);
		System.out.println(map);

		// the formula of calculate the index is :

		// index=hashcode(key)and(n-1);
		// index=483839&(16-1)=4
		// The value 4 is the computed index value where the Key and value will store in
		// HashMap.
	}

}
