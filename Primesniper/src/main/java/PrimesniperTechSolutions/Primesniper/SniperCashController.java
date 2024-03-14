package PrimesniperTechSolutions.Primesniper;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8082")

@Controller
@AllArgsConstructor
@RequestMapping(path = "api/v1/Cash")
public class SniperCashController {

    SniperCashService sniperCashService;

    @PostMapping(path = "/sendCash")
    ResponseEntity<Object> sendCash(@RequestBody SniperDto sniperDto){

         sniperCashService.sendCash(sniperDto);

         return ResponseEntity.ok("Cash Sent!!!");
    }

    @GetMapping(path = "getAllCash")
    @ResponseBody
    List<SniperCash> getAllSniperCash(){
        return sniperCashService.getAllCash();

    }

}
