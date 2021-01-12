package com.java.dp.proxy;

import java.util.ArrayList;
import java.util.List;
import com.java.dp.model.Internet;
import com.java.dp.model.RealInternet;

public class ProxyInternet implements Internet {

	private Internet internet = new RealInternet(); 
    private static List<String> bannedSites; 
    
    static{ 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("abc.com"); 
        bannedSites.add("def.com"); 
        bannedSites.add("ijk.com"); 
        bannedSites.add("lnm.com"); 
    } 
    
	public void connectTo(String serverhost) throws Exception {
		if(bannedSites.contains(serverhost.toLowerCase())) { 
            throw new Exception("Access Denied"); 
        } 
        internet.connectTo(serverhost); 
	}
}
