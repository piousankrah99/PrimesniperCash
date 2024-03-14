package PrimesniperTechSolutions.Primesniper;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Month;
import java.util.UUID;

@Entity
@Table(name = "snipercash")
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class SniperCash {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name="sniper_id")
    private Sniper sniperId;

    private Month month;

    private float cash;


}
