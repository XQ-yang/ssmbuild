import com.ssm.pojo.Books;
import com.ssm.service.BooksServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: 小强
 * @date: 2021/8/14 0014
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BooksServiceImpl booksServiceImpl = (BooksServiceImpl) context.getBean("BooksServiceImpl");

        List<Books> books = booksServiceImpl.queryAllByLimit(0, 2);

        System.out.println(books);

    }
}
