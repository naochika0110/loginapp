package loginapp.app.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntryController {
	@RequestMapping("EntryForm")
	String EntryForm() {
		return "login/EntryForm";
	}
}