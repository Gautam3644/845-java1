package Service;

import java.util.HashMap;

public class InMemoryLoginService {
	
	private HashMap<String, String> users = new HashMap<String, String>();
	
    public InMemoryLoginService(){
           users.put("gautam", "123");
           users.put("puspesh", "456");
           users.put("anurag", "789");
    }
    
    
	public boolean authenticate(String uname, String pwd) {
	if(users.containsKey(uname))
		if(users.get(uname).equals(pwd))
		    return true;
	 return false;
}
}
