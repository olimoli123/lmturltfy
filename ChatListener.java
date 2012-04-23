package com.olimoli123.icraftsmp;


import java.io.Console;
import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import com.mysql.jdbc.log.Log;
import com.olimoli123.icraftsmp.*;

public class ChatListener implements Listener {
    public ChatListener(LMTURLTFY plugin) {

    }
@EventHandler
	public void onChat(PlayerChatEvent event)
	{
	    String[] words = event.getMessage().split(" ");
        for (String word: words){
        	String hash = RandomGen.getNextNumb() + RandomGen.getLetterHash();
        	if(word.startsWith("http://") &&(word.length() > 13)){
        		 event.getPlayer().sendMessage(ChatColor.RED + "Let me shorten that for you.");
                 String URL = word.replace("http://", "");
                 event.setMessage(event.getMessage().replace(URL, "www.tinyurl.com/" + hash));
         		 Connection.Connect(word,hash);
         	     
	                                      }       

                                }
	}

	
	
	
}
