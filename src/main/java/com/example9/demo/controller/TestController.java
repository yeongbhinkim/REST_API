package com.example9.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test") //리소스
public class TestController {

//  @GetMapping("/testResponseEntity")
//  public ResponseEntity<?> testControllerResponseEntity() {
//    List<String> list = new ArrayList<>();
//    list.add("Hello World! I'm ResponseEntity. And you got 400!");
//    ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
//    return ResponseEntity.badRequest().body(response);
//  }

//  @GetMapping("/testResponseBody")
//  public ResponseDTO<String> testControllerResponseBody(){
//    List<String> list = new ArrayList<>();
//    list.add("Hello World! I'm ResponseDTO");
//    ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
//    return response;
//  }

//  @GetMapping("/testRequestBody")
//  public String testControllerRequestBody(@RequestBody TestRequestBodyDTO testRequestBodyDTO) {
//    return "Hello World ID " + testRequestBodyDTO.getId() + " Message : " + testRequestBodyDTO.getMessage();
//  }

//  @GetMapping("testGetMapping")
//  public String testController(){
//    return "Hello world! testGetMapping";
//  }
//
//  @GetMapping("/{id}")
//  public String testControllerWithPathVariables(@PathVariable(required = false) int id){
//    return "Hello world! ID" + id;
//  }
//
//  @GetMapping("/testRequestParam")
//  public String testControllerRequestParam(@RequestParam(required = false) int id){
//    return "Hello world! ID" + id;
//  }
}
