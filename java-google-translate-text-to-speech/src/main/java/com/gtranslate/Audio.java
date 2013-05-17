package com.gtranslate;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javazoom.jl.player.Player;

import com.gtranslate.context.Const;
import com.gtranslate.context.TranslatorEnvironmentUtil;
import com.gtranslate.utils.ConnectionUtils;

public class Audio {

	public InputStream getAudio(String text, String languageOutput)
			throws Exception {
		
		URL url = new URL(TranslatorEnvironmentUtil.getSystemProperty(Const.GOOGLE_TRANSLATE_AUDIO) + "q="+ text.replace(" ", "%20") + "&tl=" + languageOutput);
		URLConnection urlConn = ConnectionUtils.getURLConnection(url);   
		urlConn = ConnectionUtils.addRequestProperty(urlConn);
		InputStream audioSrc = urlConn.getInputStream();
		return new BufferedInputStream(audioSrc);
	}

	public void play(String text, String languageOutput) throws Exception {
		InputStream audioStream = getAudio(text, languageOutput);
		if(audioStream!=null){
			Player player = new Player(audioStream);
			player.play();
			
		}
	}

}
