package com.Controller;

import com.solarenergychad.model.Company;
import com.solarenergychad.model.Product;
import com.solarenergychad.model.Employee;
import com.solarenergychad.repository.CompanyRepository;
import com.solarenergychad.repository.ProductRepository;
import com.solarenergychad.repository.EmployeeRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final CompanyRepository companyRepo;
    private final ProductRepository productRepo;
    private final EmployeeRepository employeeRepo;

    public HomeController(CompanyRepository companyRepo, ProductRepository productRepo, EmployeeRepository employeeRepo) {
        this.companyRepo = companyRepo;
        this.productRepo = productRepo;
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/")
    public String home(Model model) {
        Company company = companyRepo.findAll().stream().findFirst().orElse(null);
        List<Product> products = productRepo.findAll();
        List<Employee> employees = employeeRepo.findAll();

        model.addAttribute("company", company);
        model.addAttribute("products", products);
        model.addAttribute("employees", employees);

        return "home"; // maps to home.html in templates
    }
}
