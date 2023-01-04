package com.codewithcaleb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers")
public class Main {

    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @GetMapping()
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    //Shortcut of creating a class with these properties
    record NewCustomerRequest( String name, String email,Integer age) {}

    //My request Body is mapped into NewCustomerRequest
    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request){
        Customer customer = new Customer();
        customer.setName(request.name);
        customer.setEmail(request.email);
        customer.setAge(String.valueOf(request.age));
        customerRepository.save(customer);

    }
    @DeleteMapping("{customerId}")
    public void deleteCustomer( @PathVariable("customerId") Integer id){
        customerRepository.deleteById(Long.valueOf(id));
    }

    @PutMapping("{customerId}" +
            "")
    public void  updateCustomer(@PathVariable("customerId") Integer id ,@RequestBody NewCustomerRequest request){
        //get customer
        Optional<Customer> customer = customerRepository.findById(Long.valueOf(id));

        customer.get().setEmail(request.email);
        customer.get().setAge(String.valueOf(request.age));
        customer.get().setName(request.name);

        customer.ifPresent(c ->customerRepository.save(c));

    }

    @GetMapping("/greet")
    public GreetResponse greet(){
        return new GreetResponse("ONE",
                                 List.of("Java","GoLang","Java Script"),
                                 new Person("Caleb",27,30_000));
    }



    //keys and their types
    //When i call it i add the values

    record Person (String name,int age, double savings){

    }
    record GreetResponse(String greet,
                         List<String> favouriteProgrammingLanguages,
                         Person person
          ){}


//
//    class GreetResponse{
//        private final String greet;
//
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(greet);
//        }
//    }
}
