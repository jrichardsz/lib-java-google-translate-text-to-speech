#fork-java-google-translate-text-to-speech

A fork and improvement of proyect java-google-translate-text-to-speech TTS. http://code.google.com/p/java-google-translate-text-to-speech/

## Description

Because the library google was not very usable, I decided to improve it!

## Characteristics

  * Use google engine.

##Features
The api currently provides the following functionality,

  * Simple and fast text translation.
  * Simple and fast text to speech (play sound or save to file)
  
The application in the future will provide the following functions

   * Support commandline arguments.

## Usage


```java
//imports
import com.gtranslate.Translator;
import com.gtranslate.context.TranslateEnvironment;

//required values
String enableProxy = "false";
String proxy = "my.proxy.com";
String port= "8080";
String googleTranslateText = "http://translate.google.com.{locale}/translate_a/t?";
String googleTranslateAudio = "http://translate.google.com/translate_tts?";
String googleTranslateDetect = "http://www.google.com/uds/GlangDetect?";
String locale = "pe";	

//initializing
TranslateEnvironment.init(enableProxy, proxy, port, googleTranslateText, googleTranslateAudio, googleTranslateDetect, locale);

//do it!
Translator trans = Translator.getInstance();
String text = "hola";
System.out.println(trans.translateAsJsonString(text, "es", "en"));

// console output
[[["hi there","hola","",""]],[["interjección",["Hello!","Hi!","Hey!","Hullo!","Hallo!","Hoy!","Hail!"],[["Hello!",["¡Hola!","¡Caramba!","¡Oiga!","¡Diga!","¡Bueno!","¡Vale!"],,0.39160562],["Hi!",["¡Hola!"],,0.24506053],["Hey!",["¡Hola!","¡Eh!"],,0.038173068],["Hullo!",["¡Hola!","¡Caramba!","¡Oiga!","¡Diga!","¡Bueno!","¡Aló!"]],["Hallo!",["¡Hola!","¡Caramba!","¡Oiga!","¡Bueno!"]],["Hoy!",["¡Eh!","¡Hola!"]],["Hail!",["¡Salve!","¡Hola!"]]],"¡Hola!",9]],"es",,[["hi there",[1],true,false,634,0,2,0]],[["hola",1,[["hi there",634,true,false],["hello there",261,true,false],["Hey there",103,true,false],["hello",0,true,false],["hi",0,true,false]],[[0,4]],"hola"]],,,[],2]

//or
		
Translator trans = Translator.getInstance();
String text = "hola";
System.out.println(trans.translate(text, "es", "en"));

// console output
hi there
```


##Changelog
See CHANGELOG.markdown for Version History/Changelog

##Credits
See CREDITS.markdown for Credits
