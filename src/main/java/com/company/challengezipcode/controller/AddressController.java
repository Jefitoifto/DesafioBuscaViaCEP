package com.company.desafiobuscacep.controller;


import com.company.desafiobuscacep.model.ZipCodeReceived;
import com.company.desafiobuscacep.service.ReturnZipCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class AddressController {
    @RequestMapping(value = "v1/consult-address", method = RequestMethod.POST)
    public String Post(@RequestBody ZipCodeReceived zipCode) {
        String URI = "https://viacep.com.br/ws/" + zipCode.getZipCode() + "/json/";

        RestTemplate restTemplate = new RestTemplate();

        ReturnZipCode returnZipCode = restTemplate.getForEntity(URI, ReturnZipCode.class).getBody();

        return returnZipCode.toString();
    }
}
