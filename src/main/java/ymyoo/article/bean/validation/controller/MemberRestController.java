package ymyoo.article.bean.validation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ymyoo.article.bean.validation.MemberRegistration;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/members")
public class MemberRestController {

    @PostMapping
    public ResponseEntity<Void> registerMember(@Valid @RequestBody final MemberRegistration registration) {
        System.out.println(registration);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
