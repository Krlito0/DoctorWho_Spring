    package com.wildschool.DoctorProject.controller;

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.ResponseBody;

    @Controller
    public class DoctorController {

        @GetMapping("/doctor/1")
        @ResponseBody
        public String index() {
            return "Some Details about <a href='https://fr.wikipedia.org/wiki/William_Hartnell'>William Hartnell</a>";
        }

        @GetMapping("/doctor/10")
        @ResponseBody
        public String doctor2() {
            return "Some Details about <a href='https://fr.wikipedia.org/wiki/David_Tennant'>David Tennant</a>";
        }

        @GetMapping("/doctor/13")
        @ResponseBody
        public String doctor3() {
            return "Some details about <a href='https://fr.wikipedia.org/wiki/Jodie_Whittaker'>Jodie Whittaker</a>";
        }
        
    }

