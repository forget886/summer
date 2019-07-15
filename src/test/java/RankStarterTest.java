import com.shanghai.RankService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: 张辉
 * @create: 2019-07-15
 **/
public class RankStarterTest extends BaseTest{

    @Autowired
    private RankService rankService;

    @Test
    public void showTest(){
        System.out.println(rankService.showRank());
    }

}
