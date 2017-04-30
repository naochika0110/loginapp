package loginapp.app.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {
	@RequestMapping("top")
	String EntryForm() {
		return "login/top";
	}
}