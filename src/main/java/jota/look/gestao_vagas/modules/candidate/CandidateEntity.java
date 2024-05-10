

package jota.look.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
    

    private UUID id;     
    private String name;
    
    @NotBlank()
    @Pattern(regexp = "^(?!\\s*$).+", message = "O campo [username] map deve conter espaco")
    private String username;


    @Email(message = "O campo [email] deve conter um e-mail valido")
    private String email;
    

    @Length(min = 10, max = 100, message = "A senha deve conter entre (10) e (100) caracteres")
    private String password;
    private String description;
    private String curriculum;

}