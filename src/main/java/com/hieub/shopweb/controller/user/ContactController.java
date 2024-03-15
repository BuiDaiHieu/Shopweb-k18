package com.hieub.shopweb.controller.user;

import com.hieub.shopweb.dto.Contact;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Controller
public class ContactController extends BaseController{
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String Contact(){
        return "user/contact";
    }

//    @RequestMapping(value = "/contact", method = RequestMethod.POST)
//    public String saveContact(@RequestParam(value = "name") String name,
//                              @RequestParam(value = "email") String email,
//                              @RequestParam(value = "subject") String subject,
//                              @RequestParam(value = "message") String message,
//                              Model model){
//        System.out.println("Name: " + name);
//        System.out.println("Email: " + email);
//        System.out.println("Subject: " + subject);
//        System.out.println("Message: " + message);
//        model.addAttribute("message", "Cảm ơn bạn " + email + " đã gửi liên hệ");
//        return "user/contact";
//    }

    @RequestMapping(value = "/contact-ajax", method = RequestMethod.POST)
    public ResponseEntity<Map<String, Object>> contactAjax(final @RequestBody Contact contact) {
        Map<String, Object> jsonResult = new HashMap<>();
        jsonResult.put("code", 200); //200: success, 500:
        jsonResult.put("successMessage", "Thank you for your message, " + contact.getEmail());
        return ResponseEntity.ok(jsonResult);
    }
}


