import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

class A{
	private String LastName;
	private String PhoneNo;
	private String EMail;
	private String Company;
	
	public A(String a,String b,String c,String d){
		this.LastName = a;
		this.PhoneNo = b;
		this.EMail = c;
		this.Company = d;
	}
	
	public String toString(){
		return String.format("Last Name: %s \n Phone: %s \n Email: %s \n Company: %s \n",LastName,PhoneNo,EMail,Company);
		
	}
	
}



public class PhoneBook {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name = input.next();
		String line = null;

		try{
			BufferedReader Br = new BufferedReader(new FileReader("contacts.csv"));
			
			while((line = Br.readLine()) != null){
			String[] item = line.split(",");
			HashMap<String,A>hm = new HashMap<String,A>();
			hm.put(item[1],new A(item[2],item[3],item[4],item[5]));
			
			Iterator<String> read = hm.keySet().iterator();
			while(read.hasNext()){
				if(read.next().equals(name)){
					
					A var = (A)hm.get(name);
					System.out.println("First Name: " + name);
					System.out.println(var);
					
				}
			}
			
			
		}
			
		} catch(Exception e){
			System.out.println(e);
		}
		
		
	}
}

