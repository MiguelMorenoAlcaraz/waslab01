package asw01cs;


import org.apache.http.client.fluent.Request;
//This code uses the Fluent API
import org.apache.http.client.fluent.Form;


public class SimpleFluentClient {

	private static String URI = "http://localhost:8080/waslab01_ss/";

	public final static void main(String[] args) throws Exception {
    	
    	/* Insert code for Task #4 here */
		
    	
		String id = Request.Post(URI)
			    .bodyForm(Form.form().add("author",  "Haopeng").add("tweet_text",  "Hi,hola estoy utilizando eclipse ").build())
			    .addHeader("Accept", "text/plain").execute().returnContent().asString();
		System.out.println(id);

		    	System.out.println(Request.Get(URI).addHeader("Accept", "text/plain").execute().returnContent());
		 
    	/* Insert code for Task #5 here */
	    Request.Post(URI).addHeader("Accept", "delete")
		        .bodyForm(Form.form().add("id", id).build())
		        .execute();
    }
}

