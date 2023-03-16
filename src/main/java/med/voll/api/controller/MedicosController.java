package med.voll.api.controller;
//2-passo - DTO (Data Tranfer Object)
import med.voll.api.medicos.DadosCadastroMedicos;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicosController {
        @PostMapping
    //criando um metodo() {
    public void cadastrar(@RequestBody DadosCadastroMedicos dados) {
            System.out.println(dados);

        }

}
