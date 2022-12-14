package activetech.base.listener;

import activetech.netty.server.RfidServer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class RfidListener implements ServletContextListener {

    private RfidServer rfidServer;

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("netty启动");
		if(null == rfidServer){
            rfidServer = new RfidServer(11456);
            rfidServer.start();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("netty关闭");
        rfidServer.close();
    }

}
