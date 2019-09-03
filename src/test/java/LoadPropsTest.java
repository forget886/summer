import com.xinwu.config.School;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: 张辉
 * @create: 2019-07-15
 **/
public class LoadPropsTest extends BaseTest {

    @Autowired
    private School school;

    @Test
    public void loadTest(){
        System.out.println(school);
    }
}
