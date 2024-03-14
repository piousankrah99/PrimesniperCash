package PrimesniperTechSolutions.Primesniper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import java.time.Month;


@Service
@AllArgsConstructor
public class SniperCashService {

    SniperCashRepository sniperCashRepository;
    SniperRepository sniperRepository;
    public void sendCash(SniperCashDto sniperCashDto) {
        SniperCash sniperCash = new SniperCash();
        sniperCash.setCash(sniperCashDto.getCash());
        sniperCash.setMonth(Month.valueOf(sniperCashDto.getMonth().toUpperCase()));
        sniperCash.setSniperId(sniperRepository.findById(sniperCashDto.getSniperId()).orElse(null)); // Fetching Sniper by ID

        sniperCashRepository.save(sniperCash);
    }
    public List<SniperCash> getAllCash() {
        return sniperCashRepository.findAll();
    }
}
