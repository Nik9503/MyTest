package StringMethods;

public class StringMethodsUse {

	public static void main(String[] args) 
	{
		String name = "Velocity";
		System.out.println("*********length() method use*************");
		System.out.println(name.length());
		
		int ST = name.length(); //Memory assigning to length
		System.out.println(ST);
		
		//toUpperCase() method use
		
		System.out.println(name);
		
		System.out.println("**********toUpperCase() method use***************");
		System.out.println(name.toUpperCase());
		String S = name.toUpperCase();
		System.out.println(S);
		
		
		////toLowerCase() method use
		System.out.println("**********toLowerCase() method use***************");
		System.out.println(name.toLowerCase());
		String B = name.toLowerCase();
		System.out.println(B);
		
		//equal() method use
		
		String a="Amravati";
		String b="Amravati";
		String c= new String("Amravati");
		String d= new String("Amravati");
		String e= new String("AMRAVATI");
		
		// === compares memory locations of two operands
		// equals method compare character sequence of two objects
		
		System.out.println("**********equal() method use***************");
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a.equals(b));
		System.out.println(a.equals(e));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		
		boolean result = a.equals(c);
		System.out.println("a and c are equal =="+ result);
		System.out.println(d.equals(e)); // checking character sequence along with case sensitivity
		
		//equalsIgnoreCase() method use
		
		String city="Pune";
		String locality="Pune";
		String dist="pune";
		
		System.out.println("**********equalsIgnoreCase() method use***************");
		System.out.println(city.equals(locality));
		System.out.println(city.equalsIgnoreCase(dist));
		
		//contains() method use
		String s =" Pune";
		
		System.out.println("**********contains() method use***************");
		System.out.println(s.contains("Pu"));
		System.out.println(s.contains("Pe"));
		
		//isEmpty() method use
		System.out.println("**********isEmpty()***************");
		
		String p="Test";
		String q=" ";
	    //String r=null;
		String f="";
		
		System.out.println(q.length());
		System.out.println(p.length());
		System.out.println(f.length());
		//System.out.println(r.length());
		
		System.out.println(p.isEmpty());
		System.out.println(q.isEmpty());
		System.out.println(f.isEmpty());
		//System.out.println(r.isEmpty());
		
		System.out.println("**********isBlank()***************");
		
		System.out.println(p.isBlank());
		System.out.println(q.isBlank());
		System.out.println(f.isBlank());
		//System.out.println(r.isBlank());
		
		//charAt method use
		System.out.println("**********charAt()***************");
		String country = "INDIA";
		System.out.println(country.charAt(0));
		System.out.println(country.charAt(4));
		System.out.println(country.charAt(2));
		
		char requiredChar = country.charAt(1);
		System.out.println(requiredChar);
		
		//End with method use
		System.out.println("**********End with method use()***************");
		
		System.out.println(country.endsWith("IN"));
		System.out.println(country.endsWith("IA"));
		System.out.println(country.endsWith("a"));
		
		//Start with method use
		System.out.println("**********Start with method use()***************");
		
		//string prefix
		System.out.println(country.startsWith("IN"));
		System.out.println(country.startsWith("N"));
		System.out.println(country.startsWith("DI"));
		
		System.out.println(country.startsWith("I", 0));
		System.out.println(country.startsWith("A", 4));
		
		//substring method use
		
		String testing="VELOCITY CORPORATE TRAINING CENTER";
		System.out.println("**********//substring method use()***************");
		
		String resultSrting = testing.substring(29);
		String resultSrting1 = testing.substring(12);
		System.out.println(resultSrting);
		System.out.println(resultSrting1);
		
		System.out.println(testing.substring(9, 15));
		System.out.println(testing.substring(14, 21));
		
		//concat method study
		System.out.println("**********//concat method study()***************");
		
		String x="Pune";
		String y=" City";
		String g=" Katraj";
		
		System.out.println(x.concat(y).concat(g));
		
		//indexOf method use
		System.out.println("**********//indexOf method use***************");
		
		String state = "Maharashtr";
		
		System.out.println(state.indexOf('a'));
		System.out.println(state.indexOf('s'));
		System.out.println(state.indexOf('a', 2));
		System.out.println(state.lastIndexOf('a'));
		
		//replace method use
		System.out.println("**********//replace method use***************");
		
		String city1 = "Nagpur Amravati wardha ";
		
		System.out.println(city1.replace('N', 'P'));
		System.out.println(city1.replace("Am", "Ku"));
		System.out.println(city1.replaceAll(" ", "x"));
		
		
		
	}

}
