package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int total = 0;
		for(String s : eggs){
			if(s.equals("cracked")){
				return total;
			}
			total++;
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters){
		int total = 0;
		for(Boolean b : oysters){
			if(b){
				total++;
			}
		}
		
		return total;
	}
	
	public static Double findTallest(List<Double> peeps){
		double tallest = 0;
		for(Double d : peeps){
			if(d > tallest){
				tallest = d;
			}
		}
		
		return tallest;
	}
	
	public static String findLongestWord(List<String> words){
		String l = "";
		for(String s : words){
			if(s.length() > l.length()){
				l = s;
			}
		}
		
		return l;
	}
	
	public static boolean containsSOS(List<String> message){
		for(String s : message){
			if(message.contains(" ... --- ... ")){
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> scores){
		for(int i = 0 ; i < scores.size(); i++){
			for(int j = i + 1; j < scores.size(); j++){
				if(scores.get(i) > scores.get(j)){
					double temp = scores.get(j);
					scores.set(j, scores.get(i));
					scores.set(i, temp);
				}
			}
		}
		return scores;
	}
	
	public static List<String> sortDNA(List<String> dna){
		for(int i = 0 ; i < dna.size(); i++){
			for(int j = i + 1; j < dna.size(); j++){
				if(dna.get(i).length() > dna.get(j).length()){
					String temp = dna.get(j);
					dna.set(j, dna.get(i));
					dna.set(i, temp);
				}
			}
		}
		return dna;
	}
	
	public static List<String> sortWords(List<String> words){
		for(int i = 0 ; i < words.size(); i++){
			for(int j = i + 1; j < words.size(); j++){
				if(words.get(i).compareTo(words.get(j)) > 0){
					String temp = words.get(j);
					words.set(j, words.get(i));
					words.set(i, temp);
				}
			}
		}
		return words;
	}
}