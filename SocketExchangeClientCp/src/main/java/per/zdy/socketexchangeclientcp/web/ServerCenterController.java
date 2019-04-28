package per.zdy.socketexchangeclientcp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * web管理界面controller
 * @author ZDY
 * */
@Controller
public class ServerCenterController {

    @RequestMapping("/")
    public String indexHtml() {
        return "/index.html";
    }

}
