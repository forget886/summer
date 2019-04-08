import com.xinwu.Application;
import com.xinwu.common.dal.dao.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: 张辉
 * @create: 2019-04-08
 **/
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void selectByIdTest(){
        System.out.println(studentDao.selectById(1));
    }

}
