package blue.springframework.sfbclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//Another way of doing things.
@Controller
@RequestMapping("/owners")
public class OwnerController
{
    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners()
    {
        return "owners/index";
    }
}
