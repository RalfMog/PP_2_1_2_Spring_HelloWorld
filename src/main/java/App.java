import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat catBeanFirst = applicationContext.getBean("cat", Cat.class);
        Cat catBeanSecond = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBeanFirst == catBeanSecond);


    }
}