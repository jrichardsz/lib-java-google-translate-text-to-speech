/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gtranslate.utils;

/**
 *
 * @author http://code.google.com/p/java-google-translate-text-to-speech/
 * Modification by : Richard Osmar Leon Ingaruca - RNASystems
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;


public class WebUtils {

        public static String source(String urlSite) throws Exception {
                StringBuilder result = new StringBuilder();

                URL url;
                URLConnection urlConn;

                try {
                        url = new URL(urlSite);
                        urlConn = ConnectionUtils.getURLConnection(url);                     
                        urlConn = ConnectionUtils.addRequestProperty(urlConn);
                        Reader reader = new InputStreamReader(urlConn.getInputStream(),"utf-8");
                        BufferedReader br = new BufferedReader(reader);

                        int byteRead;
                        while ((byteRead = br.read()) != -1)
                                result.append((char) byteRead);

					}catch (Exception e) {
						throw new Exception("Error when try to read stream from ["+urlSite+"]",e);
					}
                return result.toString();
        }
        
           

}


