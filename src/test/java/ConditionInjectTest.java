import com.xinwu.bean.Computer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: 张辉
 * @create: 2019-07-15
 **/
public class ConditionInjectTest extends BaseTest {

    @Autowired
    private Computer computer;

    @Test
    public void conditionTest(){
        System.out.println(computer);
    }
}
