package com.instagram.models.explore;

import com.instagram.models.commerce.Product;
import com.instagram.models.share.Post;
import com.instagram.models.share.Reels;

public class Explore {

	private Post[] posts;
	private Reels[] reels;
	private Product[] products;

	public Explore(Post[] posts, Reels[] reels, Product[] products) {
		this.posts = posts;
		this.reels = reels;
		this.products = products;
	}

	public void setPosts(Post[] posts) {
		this.posts = posts;
	}

	public void setReels(Reels[] reels) {
		this.reels = reels;
	}
//
	public void setProducts(Product[] products) {
		this.products = products;
	}

}
