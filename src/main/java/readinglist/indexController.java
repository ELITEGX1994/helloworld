package readinglist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName indexController
 * @Description TODO
 * @Author zhangguoxian
 * @Date 2019/7/23 19:34
 * @Version 1.0
 */

@RestController
public class indexController {

    @RequestMapping(value={"/index","/"})
    String home(){
        return "hello";
    }
}
