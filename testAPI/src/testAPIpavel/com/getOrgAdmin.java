package testAPIpavel.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class getOrgAdmin {

	public static void main(String[] args) throws MalformedURLException,

    ProtocolException, IOException {

		String url = "https://dev.italam.org/lms/local/compedia_services/mainservice.php?action=getorgadmin&service_type=ums&args={\"token\":\"5981f27bd21bd4df40a38f027b0072bb\"}";

		 

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
