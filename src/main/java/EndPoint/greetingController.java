package EndPoint;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {

    @GetMapping(path="greeting1")
    public String getGreeting1()
    {
        return "Hello ludziu";
    }

    @GetMapping(path="greeting2")
        public String getGreeting2(@PathParam("name") String name, @PathParam("surname") String surname){
            return "Hello " + name + " " + surname;
        }
}
