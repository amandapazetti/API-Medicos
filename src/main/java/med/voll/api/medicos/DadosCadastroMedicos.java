package med.voll.api.medicos;

import med.voll.api.endereco.DadosEndereco;

//3- passo
public record DadosCadastroMedicos(
        String nome,
        String email,
        String crm,

        Especialidade especialidade,

        DadosEndereco endereco) {
}
