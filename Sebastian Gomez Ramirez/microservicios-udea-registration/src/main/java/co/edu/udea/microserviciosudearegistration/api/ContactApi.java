package co.edu.udea.microserviciosudearegistration.api;

import co.edu.udea.microserviciosudearegistration.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping(value="/contact")
    public Contact contactRequest()
    {
        return new Contact(1045026756L, "Sebastián", "Gómez", "+57 311 744 29 53", "sebastian.gomez35@udea.edu.co");
    }
}
