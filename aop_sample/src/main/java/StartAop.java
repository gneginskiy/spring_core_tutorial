import aop.SampleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        SampleService service = context.getBean("sampleService",SampleService.class);
        System.out.println(service.getIntValue());

    }
}
