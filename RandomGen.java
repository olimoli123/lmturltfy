package com.olimoli123.icraftsmp;

import java.util.Random;

public final class RandomGen {
	static int aStart = 1;
	static int aEnd = 100000; 
    static Random aRandom = new Random(System.currentTimeMillis());
    static long range = (long)aEnd - (long)aStart + 1;
    static long fraction = (long)(range * aRandom.nextDouble());
    static int randomNumber = (int)(fraction + aStart);  
    public String FinalNumb = "ic" + randomNumber;
	public RandomGen(LMTURLTFY plugin) {
    }
    public static String getNextNumb()
    {
    	int aEnd = 10000; 
        Random aRandom = new Random(System.currentTimeMillis());
        long range = (long)aEnd - (long)aStart + 1;
        long fraction = (long)(range * aRandom.nextDouble());
        int randomNumber = (int)(fraction + aStart);  
        String FinalNumb = "lm" + randomNumber;
		return FinalNumb;    
    }
public static String getLetterHash()
{
    final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final int N = alphabet.length();
    Random aRandoma = new Random(3);
    char hashAlphabet = alphabet.charAt(aRandoma.nextInt(N));
    String hashAlphabett = Character.toString(hashAlphabet);
   return hashAlphabett;
}
	  
{

	    log("Generated : " + FinalNumb);
	    log(getLetterHash());
	  }
	  private static void log(String aMessage){
	    System.out.println(aMessage);
    
	    
	  }
	} 

