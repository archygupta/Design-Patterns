//https://www.youtube.com/watch?v=VGLjQuEQgkI&list=PLt4nG7RVVk1h9lxOYSOGI9pcP3I5oblbx&index=1

package com.codingsimplified.singleton;

class SingletonLazy{
	private static SingletonLazy singeton_instance;
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstance() {
		if(singeton_instance == null) {
			singeton_instance = new SingletonLazy();
		}
		return singeton_instance;
	}
}

public class SingletonLazyInitialization {
	public static void main(String args[]) {
		SingletonLazy s =  SingletonLazy.getInstance();
		System.out.println(s);
		
		SingletonLazy s1 =  SingletonLazy.getInstance();
		System.out.println(s1);
	}
}
