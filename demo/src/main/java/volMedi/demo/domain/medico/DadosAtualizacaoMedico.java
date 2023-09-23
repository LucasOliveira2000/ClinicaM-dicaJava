package volMedi.demo.domain.medico;
import jakarta.validation.constraints.NotNull;
import volMedi.demo.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
