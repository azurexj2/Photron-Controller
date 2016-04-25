package io.orches.photron.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ApiController {


    public ApiController () {
    }

    @RequestMapping (value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String index (){

        return "index";
    }
}
