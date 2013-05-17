package com.gtranslate.test;

import org.junit.Test;

import com.gtranslate.Audio;
import com.gtranslate.Translator;
import com.gtranslate.context.TranslatorEnvironmentUtil;

public class TestTranslate {

	public String enableProxy = "true";
	public String proxy = "chqprx05.cngfinancial.com";
	public String port= "8080";
	public String googleTranslateText = "http://translate.google.com.{locale}/translate_a/t?";
	public String googleTranslateAudio = "http://translate.google.com/translate_tts?";
	public String googleTranslateDetect = "http://www.google.com/uds/GlangDetect?";
	public String locale = "pe";		
	
	@Test
	public void testTranslateAsJsonString() throws Exception {

		TranslatorEnvironmentUtil.initialize(enableProxy, proxy, port, googleTranslateText, googleTranslateAudio, googleTranslateDetect, locale);
		
		Translator trans = new Translator();
		String text = "hola";
		System.out.println(trans.translateAsJsonString(text, "es", "en"));
	
	}
	
	@Test
	public void testTranslate() throws Exception {

		TranslatorEnvironmentUtil.initialize(enableProxy, proxy, port, googleTranslateText, googleTranslateAudio, googleTranslateDetect, locale);
		
		Translator trans = new Translator();
		String text = "hola";
		System.out.println(trans.translate(text, "es", "en"));
	
	}	
	
	@Test
	public void testAudioTranslate() throws Exception {

		TranslatorEnvironmentUtil.initialize(enableProxy, proxy, port, googleTranslateText, googleTranslateAudio, googleTranslateDetect, locale);
		
		Audio audio = new Audio();
		audio.play("hola, como estas Richard?", "es");
		
	
	}		
	


}
