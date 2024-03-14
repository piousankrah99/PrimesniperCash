package PrimesniperTechSolutions.Primesniper;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SniperCashService {

    SniperCashRepository sniperCashRepository;
    SniperRepository sniperRepository;
    public void sendCash(SniperDto sniperCash){
//        sniperCashRepository.save(sniperCash);
        SniperCash sniperCash1 = new SniperCash();
        sniperCash1.setCash(sniperCash1.getCash());
        sniperCash1.setId(sniperCash.getId());
        var sniper = sniperRepository.findById(sniperCash.getSniperId()).get();
        sniperCash1.setSniperId(sniper);
        sniperCashRepository.save(sniperCash1);

    };

    public List<SniperCash> getAllCash() {
        return sniperCashRepository.findAll();
    }
}
