package testAPIpavel.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class createOrganziation {

	public static void main(String[] args) throws MalformedURLException,

    ProtocolException, IOException {
		String url = "https://dev.italam.org/lms/local/compedia_services/mainservice.php?action=createOrganization&service_type=ums&args={\"name\":\"pavelhome\",\"idnumber\":\"121212\",\"country\":\"IL\",\"city\":\"TLV\",\"email\":\"pavelhome@test.me\",\"timezone\":\"America/New_York\",\"phone\":\"05458/34461\",\"description\":\"\",\"curriculum\":{\"curriculum_name\":\"Liberal%20North\",\"bundles\":[{\"bundleid\":\"3\",\"licenses\":\"57\",\"courses\":[{\"courseid\":\"29\"}]}]}}";

		 

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
