import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author SaMaili
 * @version 1.0
 * 
 */

public class Calculator {
	public static Scanner read = new Scanner(System.in);
	public static boolean mingames;
	static int startwahl1;
	static String startwahl1String;
	
	public static void pressAnyKeyToContinue(){ 
		//need for nice exit
	       System.out.println("Do you want to exit? (Y/N)");
	       try {
	    	   String str = read.next();
	    	   if (str.contains("Y")) {
	    		   read.close();
	    		   System.exit(0);
	    	   }
	    	   else if (str.contains("y")) {
	    		   read.close();
	    		   System.exit(0);
	    	   }
	    	   else if (str.contains("exit")) {
	    		   read.close();
	    		   System.exit(0);
	    	   }
	    	   else if(str.contains("J")) {
	    		   read.close();
	    		   System.exit(0);
	    	   }
	    	   else if(str.contains("j")) {
	    		   read.close();
	    		   System.exit(0);
	    	   }else {
			for(int i = 0; i < 80; i++) {
				System.out.println();
			}
	    		   start();
	    	   }
	       }
	       catch(Exception e){
	    	   
	       }  
	}
	public static void start() {
//here is the start
		int flushcount = 0;
		while(flushcount < 5) {
			System.out.println("Welcome to Brawlhalla-Calculator!");
			System.out.println();
			System.out.println("choose action");
			System.out.println("1) Elo-Squash-Calculator");
			System.out.println("2) Glory-Calculator");
			System.out.println("3) list 'Rank-elo-list'");
			System.out.println();
			System.out.println("4) exit");
			System.out.println();
	//choose of mode or exit		
			do {
				System.out.print(">>> ");
				startwahl1 = 0;
				startwahl1String = read.next();
				//input variants for elo
				if(startwahl1String.contains("elo")) {
					startwahl1 = 1;
				}
				if(startwahl1String.contains("elO")) {
					startwahl1 = 1;
				}
				if(startwahl1String.contains("eLo")) {
					startwahl1 = 1;
				}
				if(startwahl1String.contains("eLO")) {
					startwahl1 = 1;
				}
				if(startwahl1String.contains("ELO")) {
					startwahl1 = 1;
				}
				if(startwahl1String.contains("ELo")) {
					startwahl1 = 1;
				}
				if(startwahl1String.contains("ElO")) {
					startwahl1 = 1;
				}
				if(startwahl1String.contains("Elo")) {
					startwahl1 = 1;
				}
				//now for Glory
				if(startwahl1String.contains("glo")) {
					startwahl1 = 2;
				}
				if(startwahl1String.contains("glO")) {
					startwahl1 = 2;
				}
				if(startwahl1String.contains("gLo")) {
					startwahl1 = 2;
				}
				if(startwahl1String.contains("gLO")) {
					startwahl1 = 2;
				}
				if(startwahl1String.contains("GLO")) {
					startwahl1 = 2;
				}
				if(startwahl1String.contains("GLo")) {
					startwahl1 = 2;
				}
				if(startwahl1String.contains("GlO")) {
					startwahl1 = 2;
				}
				if(startwahl1String.contains("Glo")) {
					startwahl1 = 2;
				}
				//for Ranklist
				if(startwahl1String.contains("lis")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("liS")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("lIs")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("lIS")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("LIS")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("LIs")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("LiS")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("Lis")) {
					startwahl1 = 3;
				//other solutions
				}
				if(startwahl1String.contains("ran")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("raN")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("rAn")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("rAN")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("RAN")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("RAn")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("RaN")) {
					startwahl1 = 3;
				}
				if(startwahl1String.contains("Ran")) {
					startwahl1 = 3;
				}
				//for exit...
				if(startwahl1String.contains("ex")) {
					startwahl1 = 4;
				}
				if(startwahl1String.contains("leave")) {
					startwahl1 = 4;
				}
				if(startwahl1String.contains("verp")) {
					startwahl1 = 4;
				}
				if(startwahl1String.contains("verl")) {
					startwahl1 = 4;
				}
				//last but no least: input with numbers
				if (startwahl1String.equals("1")) {
					startwahl1 = 1;
				}
				if (startwahl1String.equals("2")) {
					startwahl1 = 2;
				}
				if (startwahl1String.equals("3")) {
					startwahl1 = 3;
				}
				if (startwahl1String.equals("4")) {
					startwahl1 = 4;
				}
				if(startwahl1 == 0){
					System.out.println("Try again.");
					flushcount++;
						if(flushcount == 5) {
							for(int i=0; i<80;i++) {
								System.out.println();
							}
							start();
						}
					}
				}while(startwahl1 == 0);
	//run selected mode
			if(startwahl1 == 1) {
				for(int i = 0; i < 80; i++) {
					System.out.println();
				}
				EloCalculator();
			}
			if(startwahl1 == 2) {	
				for(int i = 0; i < 80; i++) {
					System.out.println();
				}
				GloryCalculator();
			}
			if(startwahl1 == 3) {
				for(int i = 0; i < 80; i++) {
					System.out.println();
				}
				printRanklist();
				System.out.println();
				pressAnyKeyToContinue();
			}
			if(startwahl1 == 4) {
				System.out.println();
				pressAnyKeyToContinue();
			}
		}//while
	}	
	
	public static int check() {
		int elo = -1;
		while(elo < 0) {
			try {
				elo = read.nextInt();
			}catch (InputMismatchException ex) {
				System.err.println("Hey! Don't do that! Try again.");
				backlistener(read.next());
			}	
		}
		return elo;
	}
	static void backlistener(String String) {
	//this method is for going back to Main-menu
		if (String.equals("exit")) {	
			for(int i = 0 ;i<120;i++) {
				System.out.println();
			}
			start();
		}
		else if (String.equals("back")) {		
			for(int i = 0 ;i<120;i++) {
				System.out.println();
			}
			start();
		}
		else if (String.equals("menu")) {		
			for(int i = 0 ;i<120;i++) {
				System.out.println();
			}
			start();
		}
		else if (String.equals("Menü")) {
			for(int i = 0 ;i<120;i++) {
				System.out.println();
			}
			start();
		}
		else if (String.equals("menü")) {
			for(int i = 0 ;i<120;i++) {
				System.out.println();
			}
			start();
		}
	}
	public static void printRanklist() {
		System.out.println("--------------------");
		System.out.println("RANK:	ELO:");
		System.out.println();
		System.out.println("TIN");
		System.out.println();
		System.out.println("Tin 0: 200-719");
		System.out.println("Tin 1: 720-757");
		System.out.println("Tin 2: 758-795");
		System.out.println("Tin 3: 796-833");
		System.out.println("Tin 4: 834-371");
		System.out.println("Tin 5: 872-909");	
		System.out.println();
		System.out.println("BRONZE");
		System.out.println();
		System.out.println("Bronze 0: 872-909");
		System.out.println("Bronze 1: 910-953");
		System.out.println("Bronze 2: 954-997");
		System.out.println("Bronze 3: 998-1041");
		System.out.println("Bronze 4: 1042-1085");
		System.out.println("Bronze 5: 1086-1129");
		System.out.println();
		System.out.println("SILVER");
		System.out.println();
		System.out.println("Silver 0: 1086-1129");
		System.out.println("Silver 1: 1130-1181");
		System.out.println("Silver 2: 1182-1233");
		System.out.println("Silver 3: 1234-1285");
		System.out.println("Silver 4: 1286-1337");
		System.out.println("Silver 5: 1338-1389");
		System.out.println();
		System.out.println("GOLD");
		System.out.println();
		System.out.println("Gold 0: 1338-1389");
		System.out.println("Gold 1: 1390-1447");
		System.out.println("Gold 2: 1448-1505");
		System.out.println("Gold 3: 1506-1563");
		System.out.println("Gold 4: 1564-1621");
		System.out.println("Gold 5: 1622-1679");
		System.out.println();
		System.out.println("PLATINIUM");
		System.out.println();
		System.out.println("Platin 0: 1622-1679");
		System.out.println("Platin 1: 1680-1743");
		System.out.println("Platin 2: 1744-1807");
		System.out.println("Platin 3: 1808-1871");
		System.out.println("Platin 4: 1872-1935");
		System.out.println("Platin 5: 1936-1999");
		System.out.println();
		System.out.println("DIAMOND");
		System.out.println();
		System.out.println("Diamond: 2000+");
	}

	public static double GetGloryFromWins(int totalwins){
		if(totalwins<=150)
		return 20*totalwins;return Math.floor((10*(45*Math.pow(Math.log10(totalwins*2),2)))+245);
	}
	public static double GetGloryFromBestRating(int bestrating){
		double retval=0;if(bestrating<1200)
		retval=250;if(bestrating>=1200&&bestrating<1286)
		retval=10*(25+((0.872093023)*(86-(1286-bestrating))));if(bestrating>=1286&&bestrating<1390)
		retval=10*(100+((0.721153846)*(104-(1390-bestrating))));if(bestrating>=1390&&bestrating<1680)
		retval=10*(187+((0.389655172)*(290-(1680-bestrating))));if(bestrating>=1680&&bestrating<2000)
		retval=10*(300+((0.428125)*(320-(2000-bestrating))));if(bestrating>=2000&&bestrating<2300)
		retval=10*(437+((0.143333333)*(300-(2300-bestrating))));if(bestrating>=2300)
		retval=10*(480+((0.05)*(400-(2700-bestrating))));
		return Math.floor(retval);
	}
	public static void GloryCalculator(){
		
		System.out.println("Calculator for the Glory wich you will get in the next season");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Did you play 10 ranked games?(Y/N)");
		String str;
		str = read.next();
		backlistener(str);
		if(str.contains("y")) {
		}
		else if(str.contains("j")) {
		}
		else if(str.contains("J")) {
		}
		else if(str.contains("Y")) {
		}
		else{
			for(int i = 0; i<120;i++ ) {
				System.out.println();
			}
			System.out.println("Sorry, gotta play min. 10 games!");
			System.out.println();
			start();
		}
		System.out.println();
		System.out.print("Best Elorating: ");
		int bestRating= check();
		System.out.println();
		System.out.print("Total wins: ");
		int wins = check();
		double gloryFromBest=GetGloryFromBestRating(bestRating);
		double gloryFromWins=GetGloryFromWins(wins);
		double gloryTotal=(gloryFromBest+gloryFromWins);
		System.out.println();
		System.out.println("Glory from Wins: "+(int)gloryFromWins);
		System.out.println("Glory from best rating: "+(int) gloryFromBest);
		System.out.println("Total Glory this Season: "+ (int)gloryTotal);
		System.out.println();
		pressAnyKeyToContinue();
	}

	public static double GetHeroEloFromOldElo(int elo){
		if(elo<2000)
		return Math.floor((elo+375)/1.5);return Math.floor(1583+(elo-2000)/10);
	}
	public static double GetPersonalEloFromOldElo(int elo){
			if (elo >= 1400)
				return Math.floor(1400 + (elo - 1400.0) / (3.0 - (3000 - elo)/800.0));return elo;
		}
	public static void EloCalculator(){
		System.out.println("Calculator for your next season elo");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("Personal rating:");
		var personalRating = check();
		System.out.println();
		System.out.print("Hero/Team rating (just type 0 to skip):");
		var heroRating = check();
		System.out.println();
		var outPersonal = GetPersonalEloFromOldElo(personalRating);
		var outHero = GetHeroEloFromOldElo(heroRating);
		if(personalRating >= 2000) {
			if (heroRating >= 2000) {
				System.out.println("Sorry, but both elos are to high.");
				System.out.println("Your elo is going down to:");
				System.out.println("");
				System.out.println("HIGH GOLD");
				System.out.println("or");
				System.out.println("LOW PLATINIUM");
				System.out.println();
				pressAnyKeyToContinue();
			}
		}
		if(heroRating >= 2000) {
			if (personalRating >= 2000) {
				System.out.println("Sorry, but both elos are to high.");
				System.out.println("Your elo is going down to:");
				System.out.println("");
				System.out.println("HIGH GOLD");
				System.out.println("or");
				System.out.println("LOW PLATINIUM");
				System.out.println();
				pressAnyKeyToContinue();
			}
		}
		System.out.println("New personal: " + (int)outPersonal);
		if(personalRating >= 2000) {
			System.out.println();
			System.out.println("(doesn't count, because its diamond)");
			System.out.println("Your elo is going down to:");
			System.out.println("HIGH GOLD");
			System.out.println("or");
			System.out.println("LOW PLATINIUM");
			System.out.println();
		}
		if(heroRating != 0) {
			System.out.println();
			System.out.println("New Hero/Team: " + (int)outHero);
			if(heroRating >= 2000) {
				System.out.println();
				System.out.println("(doesn't count, because its diamond)");
				System.out.println("Your elo is going down to:");
				System.out.println("HIGH GOLD");
				System.out.println("or");
				System.out.println("LOW PLATINIUM");
				System.out.println();
			}
		}

		System.out.println();
		pressAnyKeyToContinue();
	}
	
	public static void main(String [] args) {
		for(int i = 0 ; i< 120; i++) {
			System.out.println();
		}
		start();
	}
}