import Article.Article;

import java.time.LocalDate;

public class Main {
    Article article = Article.builder().id(1L).title("Buenos Diaz").content("LOREM IPSUMAHJFKS JAJDJA").publicationDate(LocalDate.now()).build();
}
