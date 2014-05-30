/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.propertywebapp.test.restapi;

import com.paballo.propertywebapp.domain.Company;
import java.util.Collections;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

/**
 *
 * @author donkey
 */
public class CompanyRestControllerTest {
    private RestTemplate restTemplate;
    private final static String URL = "http://localhost:8084/propertywebapp";
    
    @Test
    public void testCreate()
    {
        /*
        Company c = null;
        HttpEntity<Company> requestEntity = new HttpEntity<>(c, getContentType());
        ResponseEntity<String> responseEntity = restTemplate.exchange(URL+"api/company/create", HttpMethod.POST, requestEntity, String.class);
                */
    }
    
    @Test
    public void testRead()
    {
        /*
        HttpEntity<?> requestEntity = getHttpEntity();
        ResponseEntity<Company[]> responseEntity = restTemplate.exchange("URL",HttpMethod.GET,requestEntity, Company[].class);
        
        Company[] companies = responseEntity.getBody();
        for(Company company : companies)
        {
            
        }
        
        */
    }

    private HttpEntity<?> getHttpEntity() {
          HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setAccept(Collections.singletonList(new MediaType("application","json")));
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return requestEntity; 
    }
    
    private HttpHeaders getContentType() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(new MediaType("application", "json"));
        return requestHeaders;

    }
}
