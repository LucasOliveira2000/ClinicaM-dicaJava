package volMedi.demo.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import volMedi.demo.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank(message = "Nome é Obrigatório")
        String nome,

        @NotBlank(message = "Email é Obrigatório")
        @Email
        String email,

        @NotBlank(message = "Telefone é Obrigatório")
        String telefone,

        @NotBlank(message = "CRM é Obrigatório")
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull(message = "Especialidade é Obrigatório")
        Especialidade especialidade,

        @NotNull(message = "Endereço é Obrigatório")
        @Valid
        DadosEndereco endereco) {
}
