package com.example.rest.client;

import java.util.Iterator;

import org.junit.Test;

import com.example.rest.model.Albums;
import com.example.rest.model.Comments;
import com.example.rest.model.Photos;
import com.example.rest.model.Posts;
import com.example.rest.model.Todos;

public class RestClientPostsIntegrationTest {

	@Test
	public void url() {

		RestClient restClient = new RestClient(
				"http://jsonplaceholder.typicode.com/");

		Albums[] listAlbums = restClient.listAlbums();
		
		
		for (Albums albums : listAlbums) {
			System.out.println(albums.getId());
		}
		
	}

}
