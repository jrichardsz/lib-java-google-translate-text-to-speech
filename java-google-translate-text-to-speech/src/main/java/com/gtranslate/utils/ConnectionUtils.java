package com.gtranslate.utils;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

import com.gtranslate.context.Const;
import com.gtranslate.context.TranslatorEnvironmentUtil;

public class ConnectionUtils {
	
	 // method that enables the use of proxies in the Google Translate API  
    public static URLConnection getURLConnection(URL url) throws Exception{
       
        try{            
                   
	        if(Boolean.valueOf(TranslatorEnvironmentUtil.getSystemProperty(Const.ENABLE_PROXY))){
	        	
	             Proxy prox = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(TranslatorEnvironmentUtil.getSystemProperty(Const.PROXY),Integer.parseInt(TranslatorEnvironmentUtil.getSystemProperty(Const.PORT))));           
	             return url.openConnection(prox);
	        	             
	        }else {
	        	return url.openConnection();
	        }
	        
        }catch(Exception e){
            throw new Exception("Error when try to stabilish conection to : ["+url.getPath()+"]",e);
        } 
    }
    
    public static URLConnection addRequestProperty(URLConnection urlConnection) throws Exception{
    	
    	//Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)
    	urlConnection.addRequestProperty("User-Agent","Mozilla/5.0 (X11; U; Linux x86_64; en-GB; rv:1.8.1.6) Gecko/20070723 Iceweasel/2.0.0.6 (Debian-2.0.0.6-0etch1)");
    	
    	return urlConnection;
    }

}
