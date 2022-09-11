import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println(bean1 == bean2);
        Cat beanCat1 =applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat1.getName());
        Cat beanCat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat2.getName());
        System.out.println(beanCat1 == beanCat2);
    }
}