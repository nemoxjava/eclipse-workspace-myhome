package testAPIpavel.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class updateOrgAdmin {

	public static void main(String[] args) throws MalformedURLException,

    ProtocolException, IOException {
		
		String url = "https://dev.italam.org/lms/local/compedia_services/mainservice.php?action=updateOrgAdmin&service_type=ums&args={\"token\":\"920918713be7ad2851d2e196e37f2182\",\"username\":\"pavelhome@test.me\",\"oldpassword\":\"4DwSgO\",\"newpassword\":\"123456\",\"newpasswordverify\":\"123456\"}";

		 

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