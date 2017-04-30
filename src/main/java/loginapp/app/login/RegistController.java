package loginapp.app.login;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import loginapp.domain.service.user.ReservationUserDetailsService;

@Controller
public class RegistController {
	
	@Autowired
	ReservationUserDetailsService reservationUserDetailsService;
	
	@RequestMapping("UserEntry")
	String loginForm(Model model, @Valid EntryForm entryForm, BindingResult bindingResult, HttpServletRequest request) {
		reservationUserDetailsService.registerUser(entryForm.getUsername(), entryForm.getPassword());
        return "login/Success";
    }
}