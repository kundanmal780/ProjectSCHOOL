import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;

public class ProjectSCHOOL {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("studentBean");
        System.out.println(JSON.toJSONString(student));
    }
}
