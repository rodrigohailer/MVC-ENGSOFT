package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Aparelho;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class AparelhoController {

    private static final List<Aparelho> aparelhos = new ArrayList<Aparelho>();

    public AparelhoController() {

        aparelhos.add(new Aparelho("1","Supino reto", "Peito"));
        aparelhos.add(new Aparelho("2","Supino declinado", "Peito"));
        aparelhos.add(new Aparelho("3","Supino inclinado", "Peito"));
        aparelhos.add(new Aparelho("4","FLY (Peck Deck)", "Peito"));
        aparelhos.add(new Aparelho("5","Pararela", "Peito"));
        aparelhos.add(new Aparelho("6","Smith", "Perna"));
        aparelhos.add(new Aparelho("7","Leg Press 45'", "Perna"));
        aparelhos.add(new Aparelho("8","Hack 45'", "Perna"));
        aparelhos.add(new Aparelho("9","Scott Unilateral", "Braço"));
        aparelhos.add(new Aparelho("10","Scott Máquina", "Braço"));
        aparelhos.add(new Aparelho("11","Esteira", "Aeróbico"));
        aparelhos.add(new Aparelho("12","Elíptico", "Aeróbico"));
        aparelhos.add(new Aparelho("13","Bike", "Aeróbico"));
        aparelhos.add(new Aparelho("14","ABS Máquina", "ABS"));
        aparelhos.add(new Aparelho("15","Lombar Máquina", "Lombar"));
        aparelhos.add(new Aparelho("16","Escada", "Aeróbico"));
        aparelhos.add(new Aparelho("17","Glúteos Máquina", "Perna"));
        aparelhos.add(new Aparelho("18","Remada Alta Máquina", "Costas"));
        aparelhos.add(new Aparelho("19","Remada Baixa Máquina", "Costas"));
        aparelhos.add(new Aparelho("20","Cadeira extensora", "Perna"));
        aparelhos.add(new Aparelho("21","Cadeira Flexora", "Perna"));
        aparelhos.add(new Aparelho("22","Gêmeos sentado", "Perna"));
        aparelhos.add(new Aparelho("23","Panturrilha em pé Máquina", "Perna"));

    }

    @GetMapping
    public String getAparelhos(Model model)
    {
        model.addAttribute("aparelhos", aparelhos);
        return "aparelhos";

    }
}