package com.data;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import javax.sound.sampled.AudioFormat.Encoding;
import org.apache.commons.io.FileUtils;
import org.asynchttpclient.netty.util.Utf8ByteBufCharsetDecoder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
class DataReader {
public List<HashMap<String, String>> getJsonDatafromdatareader() throws IOException
{
	String jsonContent=FileUtils.readFileToString( new File("\"C:\\Users\\akmac\\eclipse-workspace\\first\\src\\test\\java\\com\\data\\Errorvalidation.json\""),
			StandardCharsets.UTF_8);
	
	   ObjectMapper mapper= new ObjectMapper();
	 List<HashMap<String, String>>  data =mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>(){ });
	 return data;
	}
	   
	
	
}
