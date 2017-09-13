package demo.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * Created by owen on 2017/8/13.
 */
public class HelloSpring {

    public static void main(String[] args) throws IOException {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanTest.xml"));
        Hello hello = (Hello) factory.getBean("Hello");
      //  Car car = (Car) factory.getBean("Car");


        System.out.println(hello.getName());
        System.out.println(hello.getHeight());
        StringBuilder a = new StringBuilder();
        a.toString();
       /* System.out.println(car.getName());
        System.out.println(car.getPrice());
*/
        /*BeanFactory factory1 = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory)factory1);
        reader.loadBeanDefinitions(new ClassPathResource("beanTest.xml"));

        InputStreamSource resource = new ClassPathResource("beanTest.xml");
        InputStream inputStream = resource.getInputStream();*/

    }

}
