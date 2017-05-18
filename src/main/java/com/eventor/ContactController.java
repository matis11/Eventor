package com.eventor;

import java.util.Map;
import com.eventor.model.entity.Event;
import com.eventor.model.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * A class for getting the contact.html
 */
@Controller
public class ContactController {


    /**
     * Function for displaying .html content.
     * @return String containing the name of .html file to display.
     */
    @RequestMapping("/contact")
    public String contact() {

        return "contact";
    }

}