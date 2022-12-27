package com.demo.lds;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class LDSMenu {

	public static void main(String[] args) throws Exception {

		Server server = new Server(8081);
		WebAppContext webapp = new WebAppContext();
		webapp.setResourceBase("src/main/webapp");
		webapp.setContextPath("/");

		server.setHandler(webapp);
		server.start();
		server.join();

	}

}
