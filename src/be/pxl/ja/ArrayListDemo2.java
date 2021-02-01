package be.pxl.ja;

import be.pxl.ja.streamingservice.model.Content;
import be.pxl.ja.streamingservice.model.Documentary;
import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import be.pxl.ja.streamingservice.model.TVShow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Content> contentList = new ContentRepository().getContentList();

		System.out.println("Eigen kweek: " + contentList.contains(new TVShow("Eigen kweek", Rating.TEENS, 3)));
		System.out.println("Iron fist: " + contentList.contains(new Movie("Iron Fist", Rating.MATURE)));
		System.out.println("Rambo: " + contentList.contains(new Movie("Rambo", Rating.TEENS)));

		//Wordt vergeleken op basis van de equals en hashcode in de Content klasse
	}


}
