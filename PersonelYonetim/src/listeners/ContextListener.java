package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import util.Util;

@WebListener
public class ContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent sce) {
//ama� sunucu aya�a kalkt���nda bunu anlamak ve parametreli y�kliyen kodu �al��t�rmak
		// ilk bu class �al��yor
	}

	public void contextInitialized(ServletContextEvent sce) {
		Util.init();
	}

}
