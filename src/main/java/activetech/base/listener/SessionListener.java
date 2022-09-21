package activetech.base.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * 
 * <p>Title:Session监听器</p>
 * <p>Description:SessionListener</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-3-24 下午3:30:23
 *
 */
public class SessionListener implements HttpSessionAttributeListener,HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("【监听到】sessionCreated");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("【监听到】sessionDestroyed");

	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("【监听到】HttpSession对象中新增一名为" + arg0.getName() + "的属性,其属性值为" + arg0.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("【sessionlistener】HttpSession对象中一名为" + arg0.getName()+ "的属性被删除!,其属性值为" + arg0.getValue());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("【监听到】HttpSession对象中一名为" + arg0.getName() + "的属性被修改！,其属性值为" + arg0.getValue());

	}

}
