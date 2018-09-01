package rpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class RpcHelper {
    
    private final static String TYPE = "application/json";
    private final static String ALLOWED = "Access-Control-Allow-Origin";
    
	// Writes a JSONArray to http response.
	public static void writeJsonArray(HttpServletResponse response, JSONArray array) throws IOException {
        PrintWriter out = response.getWriter(); 
        response.setContentType(TYPE);
        response.addHeader(ALLOWED, "*");
        out.print(array);
        out.close();
	}

    // Writes a JSONObject to http response.
	public static void writeJsonObject(HttpServletResponse response, JSONObject obj) throws IOException {		
        PrintWriter out = response.getWriter(); 
        response.setContentType(TYPE);
        response.addHeader(ALLOWED, "*");
        out.print(obj);
        out.close();
	}

}
