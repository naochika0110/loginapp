package loginapp.app.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuccessController {
	@RequestMapping("Success")
	String EntryForm() {
		return "login/Success";
	}
}