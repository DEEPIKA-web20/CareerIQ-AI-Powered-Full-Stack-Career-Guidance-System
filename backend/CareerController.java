import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CareerController {

    @PostMapping("/career")
    public Map<String, Object> getCareer(@RequestBody Map<String, String> req) {

        String skill = req.get("skills").toLowerCase();

        Map<String, Object> res = new HashMap<>();

        res.put("careers", CareerService.getCareers(skill));
        res.put("score", CareerService.getScore(skill));

        return res;
    }
}
