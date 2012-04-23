package com.olimoli123.icraftsmp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

public class Connection implements Listener {

	public Connection(LMTURLTFY plugin)
	{
	}
	public static void Connect(String website, String Alias)
	{
		 try {
		        // Construct data
		        String data = URLEncoder.encode("url", "UTF-8") + "=" + URLEncoder.encode(website, "UTF-8");
		        data += "&" + URLEncoder.encode("alias", "UTF-8") + "=" + URLEncoder.encode(Alias, "UTF-8");
		 
		        // Send data
		        URL url = new URL("http://tinyurl.com/create.php");
		        URLConnection conn = url.openConnection();
		        conn.setDoOutput(true);
		        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
		        wr.write(data);
		        wr.flush();
		 
		        // Get the response
		        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		        wr.close();
		        rd.close();
		    } catch (Exception e) {
		    }
	}
	
}
