package com.olimoli123.icraftsmp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.yaml.snakeyaml.DumperOptions.LineBreak;

public class LMTURLTFY extends JavaPlugin{

	Logger log;
	private ChatListener chatListener = null;
	private Connection connection = null;
	public void onEnable(){
		chatListener = new ChatListener(this);
		getServer().getPluginManager().registerEvents(chatListener, this);
		log = this.getLogger();
		log.info("Let me Tinyurl that for you  enabled better than ever!");
	}
 
	public void onDisable(){
		log.info("Let me Tinyurl that for you Successfully disabled.");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	    
			if (cmd.getName().equalsIgnoreCase("url")){ 
				try
				{
				if (args.length > 0) {
					
			         Connection.Connect(args[0],args[1]);
			         
			        } 
			        if (args.length < 1) {
			           sender.sendMessage(ChatColor.RED + "Please use a url!");
			           return false;
			        }
			        
				}
				  catch(Exception e)  
				  {  
					  // Caught Non Number use
			        sender.sendMessage(ChatColor.RED + "You need to use a URL");
			        return false;
				  }
			}
			
			return true;
	}

}