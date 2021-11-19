// package lab2_4.frases;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.*;

// @RestController
// public class QuotesController {

//     @GetMapping("/quotes")
//     public Quotes quotess(@RequestParam(value= "show", defaultValue = "1") int mid){
//         DB db = DB.getInstance();
//         ArrayList<Quotes> alq = db.spQuotes(mid);
//         int rnd = new Random().nextInt(alq.size());
//         return alq.get(rnd);
//     }
    
// }
