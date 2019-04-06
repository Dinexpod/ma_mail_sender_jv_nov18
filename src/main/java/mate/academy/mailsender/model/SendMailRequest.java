package mate.academy.mailsender.model;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class SendMailRequest {

    @Valid
    @Size(min = 2, max = 120)
    private String title;
    @Email
    private String sendTo;
    private String message;
}
