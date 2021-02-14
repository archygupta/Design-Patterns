//https://www.youtube.com/watch?v=VGLjQuEQgkI&list=PLt4nG7RVVk1h9lxOYSOGI9pcP3I5oblbx&index=1

package com.codingsimplified.singleton;

class SingletonEager{
	private static SingletonEager singeton_instance= new SingletonEager();
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstance() {
		return singeton_instance;
	}
}

public class SingletonEagerInitiaization {
	public static void main(String args[]) {
		SingletonEager s =  SingletonEager.getInstance();
		System.out.println(s);
		
		SingletonEager s1 =  SingletonEager.getInstance();
		System.out.println(s1);
	}
}


