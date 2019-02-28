import Article.Article;
import Camel.Camel;
import Camel.Gender;
import Camel.Fur;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import Article.Tag;
import Article.Category;

public class Main {


    Article article = Article.builder()
            .id(1L)
            .title("Śmierć polskiego aktora")
            .content("W dniu 11 marca doszło do tragiczneog wypadku")
            .publicationDate(LocalDate.now())
            .build();

    Article article2 = Article.builder().id(1L)
            .title("Śmierć polskiego aktora")
            .content("W dniu 11 marca doszło do tragiczneog wypadku")
            .publicationDate(LocalDate.now())
            .autor("Marcin Stankiewicz")
            .category(Category.KULTURA_I_SZTUKA)
            .tag(new ArrayList<>(Arrays.asList(new Tag("POLISH"), new Tag("DEAD"), new Tag("ACTOR"))))
            .build();

    Camel camel = Camel
            .builder()
            .id(2L)
            .name("Maciek")
            .age(6)
            .gender(Gender.MALE)
            .build();
    Camel camel2 = Camel
            .builder()
            .id(2L)
            .name("Maciek")
            .age(23)
            .gender(Gender.MALE)
            .weight(32.5)
            .height(202.1)
            .fur(Fur.BLACK)
            .build();

}
