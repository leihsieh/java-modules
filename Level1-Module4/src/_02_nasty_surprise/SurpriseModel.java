package _02_nasty_surprise;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class SurpriseModel {
		String treat = "https://images-na.ssl-images-amazon.com/images/I/71oXv%2BkZHML._SL1100_.jpg";
		String trick = "https://media2.s-nbcnews.com/j/newscms/2018_20/1339477/puppy-cute-today-180515-main_a936531048fdb698635dd1b418abdee9.fit-760w.jpg";
	
	
	public Icon getTreatIcon()	{
		return getPictureFromTheInternet(treat);
	}

	public Icon getTrickIcon()	{
		return getPictureFromTheInternet(trick);
	}	
	
	   private Icon getPictureFromTheInternet(String imageUrl) {
	        Icon icon = null;
	        try {
	            URL url = new URL(imageUrl);
	            icon = new ImageIcon(url);
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        }
	        return icon;
	    }
}
