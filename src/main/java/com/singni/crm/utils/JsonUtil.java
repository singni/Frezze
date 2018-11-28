package com.singni.crm.utils;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.StringWriter;

public class JsonUtil {
    private static ObjectMapper mapper = new ObjectMapper();

    public static String bean2Json(Object obj){
        try{
            StringWriter sw = new StringWriter();
            JsonGenerator gen = new JsonFactory().createJsonGenerator(sw);
            mapper.writeValue(gen, obj);
            gen.close();
            return sw.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
      return null;
    }

    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        try{

            return mapper.readValue(jsonStr, objClass);
        }catch (Exception e){
        e.printStackTrace();
        }
        return null;
    }

}
