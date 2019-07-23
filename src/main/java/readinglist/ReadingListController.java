package readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/r")
public class ReadingListController {

    private final ReadingListRepository readingListRepository;

    @Autowired
    public ReadingListController(
            ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }

    @RequestMapping(value="/b/{reader}", method= RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        List<Book> readingList =
                readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }
    /*
    @RequestMapping(value="/b/{reader}", method=RequestMethod.POST)
    public String addToReadingList(
            @PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/r/b/{reader}";
    }
*/
    @RequestMapping(value="/b/{reader}", method=RequestMethod.POST)
    public Book addToReadingList(
            @PathVariable("reader") String reader,
            @RequestParam("isbn") String isbn, @RequestParam("title") String title,@RequestParam("description") String description,@RequestParam("author") String author ) {
        Book book=new Book();
        book.setAuthor(author);
        book.setDescription(description);
        book.setIsbn(isbn);
        book.setTitle(title);
        book.setReader(reader);
        return readingListRepository.save(book);
       // return "redirect:/r/b/{reader}";
    }

}

