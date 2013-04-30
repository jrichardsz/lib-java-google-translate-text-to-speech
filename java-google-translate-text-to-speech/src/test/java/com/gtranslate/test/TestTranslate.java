package com.gtranslate.test;

import org.junit.Test;

import com.gtranslate.Translator;
import com.gtranslate.context.EnvUtil;

public class TestTranslate {

	public String enableProxy = "true";
	public String proxy = "my.proxy.com";
	public String port= "8080";
	public String googleTranslateText = "http://translate.google.com.{locale}/translate_a/t?";
	public String googleTranslateAudio = "http://translate.google.com/translate_tts?";
	public String googleTranslateDetect = "http://www.google.com/uds/GlangDetect?";
	public String locale = "pe";		
	
	@Test
	public void test() throws Exception {

		EnvUtil.environmentInit(enableProxy, proxy, port, googleTranslateText, googleTranslateAudio, googleTranslateDetect, locale);
		
		Translator trans = Translator.getInstance();
		String text = "hola";
		System.out.println(trans.translateAsJsonString(text, "es", "en"));
	
	}
	


}
