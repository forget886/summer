import com.xinwu.Application;
import com.xinwu.common.dal.dao.StudentDao;
import com.xinwu.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: 张辉
 * @create: 2019-04-08
 **/

public class ApplicationTest extends BaseTest{

    @Autowired
    private StudentDao studentDao;
    @Autowired
    private StudentService studentService;

    @Test
    public void selectByIdTest() {
        System.out.println(studentDao.selectById(1));
    }

    @Test
    public void insertTest(){
        try {
            studentService.insertTest();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
