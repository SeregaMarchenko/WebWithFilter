package listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Приложение запущено");
    }
}
