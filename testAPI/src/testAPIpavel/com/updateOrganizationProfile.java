package testAPIpavel.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class updateOrganizationProfile {

	public static void main(String[] args) throws MalformedURLException,

    ProtocolException, IOException {
		
		String url = "https://dev.italam.org/lms/local/compedia_services/mainservice.php?action=updateOrganizationProfile&service_type=ums&args={\"token\":\"71d130b5cbdbbc84717ca9c4a20c91bf\",\"id\":\"279\",\"name\":\"matanddd123\",\"country\":\"IL\",\"city\":\"sfdsfe\",\"email\":\"matancom\",\"timezone\":\"Africa/Algiers\",\"description\":\"123\"}";

		 

        HttpURLConnection con = null;
		try {



            URL myurl = new URL(url);

            con = (HttpURLConnection) myurl.openConnection();



            con.setRequestMethod("GET");



            StringBuilder content;



            try (BufferedReader in = new BufferedReader(

                    new InputStreamReader(con.getInputStream()))) {



                String line;

                content = new StringBuilder();



                while ((line = in.readLine()) != null) {

                    content.append(line);

                    content.append(System.lineSeparator());

                }

            }



            System.out.println(content.toString());



        } finally {

           

            con.disconnect();

        }


	}

}