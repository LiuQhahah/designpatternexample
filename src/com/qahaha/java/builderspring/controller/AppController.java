package builderspring.controller;

import builderspring.builder.Contact;
import builderspring.builder.ContactBuilder;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class AppController {
    @GetMapping("presidents")
    public List<Contact> getPresidents() {
        List<Contact> contacts = new ArrayList<>();

        Contact contact = new Contact();
        contact.setFirstName("George");
        contact.setLastName("Washington");
        contacts.add(contact);

        contacts.add(new Contact("John", "Adams", null));

        contacts.add(new ContactBuilder().setFirstName("Thomas").setLastName("Jefferson").buildContact());

        return contacts;
    }
}
