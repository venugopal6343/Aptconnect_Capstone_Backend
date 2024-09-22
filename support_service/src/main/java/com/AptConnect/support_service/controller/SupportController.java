package com.AptConnect.support_service.controller;



import com.AptConnect.support_service.model.Support;
import com.AptConnect.support_service.repository.SupportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/help"})
public class SupportController {
    @Autowired
    private SupportRepository supportRepository;

    public SupportController() {
    }

    @GetMapping({"/all"})
    public List<Support> getAllHelpRequests() {
        return this.supportRepository.findAll();
    }

    @PostMapping({"/create"})
    public ResponseEntity<Support> createHelpRequest(@RequestBody Support supportRequest) {
        Support savedRequest = (Support) this.supportRepository.save(supportRequest);
        return new ResponseEntity(savedRequest, HttpStatus.CREATED);
    }
}

