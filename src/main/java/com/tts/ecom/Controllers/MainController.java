package com.tts.ecom.Controllers;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.tts.ecom.Models.Product;
import com.tts.ecom.Services.ProductService;

@Controller
@ControllerAdvice // This makes the `@ModelAttribute`s of this controller available to all
                  // controllers, for the navbar.
public class MainController {
    @Autowired
    ProductService productService;

    // public Product(int quantity, float price, String description,
    // String name, String brand, String category,String image) {

    public void addNew() {
        List<Product> allProducts = productService.findAll();

        if (allProducts.isEmpty()) {

            List<Product> newProducts = new ArrayList<Product>();

            newProducts.add(new Product(4, (float) 3.99, "Aries Avatar", "Aries",
                    "images/Aries.png","Aries"));
            
            newProducts.add(new Product(4, (float) 3.99, "Taurus Avatar", "Taurus",
                    "images/Taurus.png","Taurus"));
            
            newProducts.add(new Product(4, (float) 3.99, "Gemini Avatar", "Gemini",
                    "images/Gemini.png","Gemini"));
            
            newProducts.add(new Product(4, (float) 3.99, "Cancer Avatar", "Cancer",
                    "images/Cancer.png","Cancer"));
            
            newProducts.add(new Product(4, (float) 3.99, "Leo Avatar", "Leo",
                    "images/Leo.png","Leo"));
            
            newProducts.add(new Product(4, (float) 3.99, "Virgo Avatar", "Virgo",
                    "images/Virgo.png","Virgo"));
            
            newProducts.add(new Product(4, (float) 3.99, "Libra Avatar", "Libra",
                    "images/Libra.png","Libra"));
            
            newProducts.add(new Product(4, (float) 3.99, "Scorpio Avatar", "Scorpio",
                    "images/Scorpio.png","Scorpio"));
            
            newProducts.add(new Product(4, (float) 3.99, "Sagittarius Avatar", "Sagittarius",
                    "images/Sagittarius.png","Sagittarius"));
            
            newProducts.add(new Product(4, (float) 3.99, "Capricorn Avatar", "Capricorn",
                    "images/Capricorn.png","Capricorn"));
            
            newProducts.add(new Product(4, (float) 3.99, "Aquarius Avatar", "Aquarius",
                    "images/Aquarius.png","Aquarius"));
            
            newProducts.add(new Product(4, (float) 3.99, "Pisces Avatar", "Pisces",
                    "images/Pisces.png","Pisces"));

            newProducts.add(new Product(4, (float) 3.99, "Aries Mask", "Mask",
                    "images/Aries Mask.png","Aries"));

            newProducts.add(new Product(4, (float) 9.99, "Aries Shorts", "Shorts",
                    "images/Aries Shorts.png","Aries"));

            newProducts.add(new Product(4, (float) 19.99, "Aries Shirt 1", "T-Shirt",
                    "images/Aries Shirt 1.png","Aries"));

            newProducts.add(new Product(4, (float) 19.99, "Aries Shirt 2", "T-Shirt",
                    "images/Aries Shirt 2.png","Aries"));

            newProducts.add(new Product(4, (float) 19.99, "Aries Shirt 3", "T-Shirt",
                    "images/Aries Shirt 3.png","Aries"));

            newProducts.add(new Product(4, (float) 3.99, "Taurus Mask", "Mask",
                    "images/Taurus Mask.png","Taurus"));

            newProducts.add(new Product(4, (float) 9.99, "Taurus Shorts", "Shorts",
                    "images/Taurus Shorts.png","Taurus"));

            newProducts.add(new Product(4, (float) 19.99, "Taurus Shirt 1", "T-Shirt",
                    "images/Taurus Shirt 1.png","Taurus"));

            newProducts.add(new Product(4, (float) 19.99, "Taurus Shirt 2", "T-Shirt",
                    "images/Taurus Shirt 2.png","Taurus"));

            newProducts.add(new Product(4, (float) 19.99, "Taurus Shirt 3", "T-Shirt",
                    "images/Taurus Shirt 3.png","Taurus"));

            newProducts.add(new Product(4, (float) 3.99, "Gemini Mask", "Mask",
                    "images/Gemini Mask.png","Gemini"));

            newProducts.add(new Product(4, (float) 9.99, "Gemini Shorts", "Shorts",
                    "images/Gemini Shorts.png","Gemini"));

            newProducts.add(new Product(4, (float) 19.99, "Gemini Shirt 1", "T-Shirt",
                    "images/Gemini Shirt 1.png","Gemini"));

            newProducts.add(new Product(4, (float) 19.99, "Gemini Shirt 2", "T-Shirt",
                    "images/Gemini Shirt 2.png","Gemini"));

            newProducts.add(new Product(4, (float) 19.99, "Gemini Shirt 3", "T-Shirt",
                    "images/Gemini Shirt 3.png","Gemini"));

            newProducts.add(new Product(4, (float) 3.99, "Cancer Mask", "Mask",
                    "images/Cancer Mask.png","Cancer"));

            newProducts.add(new Product(4, (float) 9.99, "Cancer Shorts", "Shorts",
                    "images/Cancer Shorts.png","Cancer"));

            newProducts.add(new Product(4, (float) 19.99, "Cancer Shirt 1", "T-Shirt",
                    "images/Cancer Shirt 1.png","Cancer"));

            newProducts.add(new Product(4, (float) 19.99, "Cancer Shirt 2", "T-Shirt",
                    "images/Cancer Shirt 2.png","Cancer"));

            newProducts.add(new Product(4, (float) 19.99, "Cancer Shirt 3", "T-Shirt",
                    "images/Cancer Shirt 3.png","Cancer"));

            newProducts.add(new Product(4, (float) 3.99, "Leo Mask", "Mask",
                    "images/Leo Mask.png","Leo"));

            newProducts.add(new Product(4, (float) 9.99, "Leo Shorts", "Shorts",
                    "images/Leo Shorts.png","Leo"));

            newProducts.add(new Product(4, (float) 19.99, "Leo Shirt 1", "T-Shirt",
                    "images/Leo Shirt 1.png","Leo"));

            newProducts.add(new Product(4, (float) 19.99, "Leo Shirt 2", "T-Shirt",
                    "images/Leo Shirt 2.png","Leo"));

            newProducts.add(new Product(4, (float) 19.99, "Leo Shirt 3", "T-Shirt",
                    "images/Leo Shirt 3.png","Leo"));

            newProducts.add(new Product(4, (float) 3.99, "Virgo Mask", "Mask",
                    "images/Virgo Mask.png","Virgo"));

            newProducts.add(new Product(4, (float) 9.99, "Virgo Shorts", "Shorts",
                    "images/Virgo Shorts.png","Virgo"));

            newProducts.add(new Product(4, (float) 19.99, "Virgo Shirt 1", "T-Shirt",
                    "images/Virgo Shirt 1.png","Virgo"));

            newProducts.add(new Product(4, (float) 19.99, "Virgo Shirt 2", "T-Shirt",
                    "images/Virgo Shirt 2.png","Virgo"));

            newProducts.add(new Product(4, (float) 19.99, "Virgo Shirt 3", "T-Shirt",
                    "images/Virgo Shirt 3.png","Virgo"));

            newProducts.add(new Product(4, (float) 3.99, "Libra Mask", "Mask",
                    "images/Libra Mask.png","Libra"));

            newProducts.add(new Product(4, (float) 9.99, "Libra Shorts", "Shorts",
                    "images/Libra Shorts.png","Libra"));

            newProducts.add(new Product(4, (float) 19.99, "Libra Shirt 1", "T-Shirt",
                    "images/Libra Shirt 1.png","Libra"));

            newProducts.add(new Product(4, (float) 19.99, "Libra Shirt 2", "T-Shirt",
                    "images/Libra Shirt 2.png","Libra"));

            newProducts.add(new Product(4, (float) 19.99, "Libra Shirt 3", "T-Shirt",
                    "images/Libra Shirt 3.png","Libra"));

            newProducts.add(new Product(4, (float) 3.99, "Scorpio Mask", "Mask",
                    "images/Scorpio Mask.png","Scorpio"));

            newProducts.add(new Product(4, (float) 9.99, "Scorpio Shorts", "Shorts",
                    "images/Scorpio Shorts.png","Scorpio"));

            newProducts.add(new Product(4, (float) 19.99, "Scorpio Shirt 1", "T-Shirt",
                    "images/Scorpio Shirt 1.png","Scorpio"));

            newProducts.add(new Product(4, (float) 19.99, "Scorpio Shirt 2", "T-Shirt",
                    "images/Scorpio Shirt 2.png","Scorpio"));

            newProducts.add(new Product(4, (float) 19.99, "Scorpio Shirt 3", "T-Shirt",
                    "images/Scorpio Shirt 3.png","Scorpio"));

            newProducts.add(new Product(4, (float) 3.99, "Sagittarius Mask", "Mask",
                    "images/Sagittarius Mask.png","Sagittarius"));

            newProducts.add(new Product(4, (float) 9.99, "Sagittarius Shorts", "Shorts",
                    "images/Sagittarius Shorts.png","Sagittarius"));

            newProducts.add(new Product(4, (float) 19.99, "Sagittarius Shirt 1", "T-Shirt",
                    "images/Sagittarius Shirt 1.png","Sagittarius"));

            newProducts.add(new Product(4, (float) 19.99, "Sagittarius Shirt 2", "T-Shirt",
                    "images/Sagittarius Shirt 2.png","Sagittarius"));

            newProducts.add(new Product(4, (float) 19.99, "Sagittarius Shirt 3", "T-Shirt",
                    "images/Sagittarius Shirt 3.png","Sagittarius"));

            newProducts.add(new Product(4, (float) 3.99, "Capricorn Mask", "Mask",
                    "images/Capricorn Mask.png","Capricorn"));

            newProducts.add(new Product(4, (float) 9.99, "Capricorn Shorts", "Shorts",
                    "images/Capricorn Shorts.png","Capricorn"));

            newProducts.add(new Product(4, (float) 19.99, "Capricorn Shirt 1", "T-Shirt",
                    "images/Capricorn Shirt 1.png","Capricorn"));

            newProducts.add(new Product(4, (float) 19.99, "Capricorn Shirt 2", "T-Shirt",
                    "images/Capricorn Shirt 2.png","Capricorn"));

            newProducts.add(new Product(4, (float) 19.99, "Capricorn Shirt 3", "T-Shirt",
                    "images/Capricorn Shirt 3.png","Capricorn"));

            newProducts.add(new Product(4, (float) 3.99, "Aquarius Mask", "Mask",
                    "images/Aquarius Mask.png","Aquarius"));

            newProducts.add(new Product(4, (float) 9.99, "Aquarius Shorts", "Shorts",
                    "images/Aquarius Shorts.png","Aquarius"));

            newProducts.add(new Product(4, (float) 19.99, "Aquarius Shirt 1", "T-Shirt",
                    "images/Aquarius Shirt 1.png","Aquarius"));

            newProducts.add(new Product(4, (float) 19.99, "Aquarius Shirt 2", "T-Shirt",
                    "images/Aquarius Shirt 2.png","Aquarius"));

            newProducts.add(new Product(4, (float) 19.99, "Aquarius Shirt 3", "T-Shirt",
                    "images/Aquarius Shirt 3.png","Aquarius"));

            newProducts.add(new Product(4, (float) 3.99, "Pisces Mask", "Mask",
                    "images/Pisces Mask.png","Pisces"));

            newProducts.add(new Product(4, (float) 9.99, "Pisces Shorts", "Shorts",
                    "images/Pisces Shorts.png","Pisces"));

            newProducts.add(new Product(4, (float) 19.99, "Pisces Shirt 1", "T-Shirt",
                    "images/Pisces Shirt 1.png","Pisces"));

            newProducts.add(new Product(4, (float) 19.99, "Pisces Shirt 2", "T-Shirt",
                    "images/Pisces Shirt 2.png","Pisces"));

            newProducts.add(new Product(4, (float) 19.99, "Pisces Shirt 3", "T-Shirt",
                    "images/Pisces Shirt 3.png","Pisces"));
        

            for (Product product : newProducts) {
                productService.save(product);
            }
        } else {

            System.out.println("You don't need more items!");
        }
   }

    @GetMapping("/")
    public String main() {
        addNew();
        return "main";
    }

    @ModelAttribute("products")
    public List<Product> products() {
        return productService.findAll();
    }

    @ModelAttribute("categories")
    public List<String> categories() {
        return productService.findDistinctCategories();
    }

    @ModelAttribute("sign")
    public List<String> sign() {
        return productService.findDistinctSign();
    }

    @GetMapping("/filter")
    public String filter(@RequestParam(required = false) String category, @RequestParam(required = false) String sign,
            Model model) {
        List<Product> filtered = productService.findBySignAndOrCategory(sign, category);
        model.addAttribute("products", filtered); // Overrides the @ModelAttribute above.
        return "main";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}