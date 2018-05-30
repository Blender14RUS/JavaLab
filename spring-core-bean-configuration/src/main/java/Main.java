import domain.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        BeanA beanA = context.getBean("beanA", BeanA.class);
        System.out.println("\n" +beanA + "\n");

        BeanB beanB = context.getBean("beanB", BeanB.class);
        System.out.println(beanB + "\n");

        BeanC beanC = context.getBean("beanC", BeanC.class);
        System.out.println(beanC + "\n");

        BeanD beanD1 = beanC.getBeanD();
        System.out.println(beanD1);
        BeanD beanD2 = beanC.getBeanD();
        System.out.println(beanD2 + "\n");

        BeanE beanE = context.getBean("beanE", BeanE.class);
        System.out.println(beanE);
        beanE.printName();

        BeanF beanF = context.getBean("beanF", BeanF.class);
        System.out.println(beanF);
        context.registerShutdownHook();
    }

}