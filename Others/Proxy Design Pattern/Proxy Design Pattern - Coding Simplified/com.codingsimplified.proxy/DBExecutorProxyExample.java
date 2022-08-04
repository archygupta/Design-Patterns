/*
 * Improves structure of the java code
 * work with interfaces, gives u a good interface
 */
 
 //https://www.youtube.com/watch?v=AB0gaAg9jwI&list=PLt4nG7RVVk1h9lxOYSOGI9pcP3I5oblbx&index=5

package com.codingsimplified.proxy;

interface DBExecutor {
	public void executeQuery(String query) throws Exception;
}

class DBxecutorImpl implements DBExecutor {

	@Override
	public void executeQuery(String query) throws Exception {
		System.out.println("Executing the query: " + query);
	}
}

class DBExecutorProxy implements DBExecutor {

	boolean isAdmin;
	DBxecutorImpl dbExecutor;

	public DBExecutorProxy(String user, String password) {
		if (user.equals("admin")) {
			isAdmin = true;
		}
		dbExecutor = new DBxecutorImpl();
	}

	@Override
	public void executeQuery(String query) throws Exception {
		if (isAdmin) {
			dbExecutor.executeQuery(query);
		} else {
			if (query.equals("DELETE")) {
				throw new Exception("Non-admin users can't execute query: " + query);
			} else {
				dbExecutor.executeQuery(query);
			}
		}
	}

}

public class DBExecutorProxyExample {
	public static void main(String args[]) throws Exception {
		DBExecutorProxy dbProxy = new DBExecutorProxy("admin", "12345");
		System.out.println("Admin: ");
		dbProxy.executeQuery("DELETE");
		dbProxy.executeQuery("INSERT");
		DBExecutorProxy dbProxy2 = new DBExecutorProxy("non-admin", "12345");
		System.out.println("Non-admin: ");
		dbProxy2.executeQuery("INSERT");
		dbProxy2.executeQuery("DELETE");
	}
}
