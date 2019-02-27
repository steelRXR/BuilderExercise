package Article;

import java.time.LocalDate;
import java.util.List;

public class Article {
    Long id;
    String title;
    String content;
    LocalDate publicationDate;
    List<Tag> tag;
    Category category;
    String autor;

    public static NeedId builder(){
        return new Builder();
    }

    public static class Builder implements NeedId, NeedContent, NeedPublicationDate, NeedTitle, CanBeBuild {
        private Long id;
        private String title;
        private String content;
        private LocalDate publicationDate;
        private List<Tag> tag;
        private Category category;
        private String autor;

        public Article build() {
            Article article = new Article();
            article.id = this.id;
            article.title = this.title;
            article.content = this.content;
            article.publicationDate = this.publicationDate;
            article.tag = this.tag;
            article.category = this.category;
            article.autor = this.autor;
            return article;
        }

        @Override
        public Builder tag(List<Tag> tag) {
            this.tag = tag;
            return this;
        }

        @Override
        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        @Override
        public Builder autor(String autor) {
            this.autor = autor;
            return this;
        }


        @Override
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        @Override
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        @Override
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        @Override
        public CanBeBuild publicationDate(LocalDate publicationDate) {
            return null;
        }

        @Override
        public Builder and() {
            return this;
        }
    }

    public interface NeedId {
        public NeedTitle id(Long id);
    }

    public interface NeedTitle {
        NeedContent title(String title);
    }

    public interface NeedContent {
        NeedPublicationDate content(String content);
    }

    public interface NeedPublicationDate {
        CanBeBuild publicationDate(LocalDate publicationDate);
        CanBeBuild and();
    }

   public interface CanBeBuild {
        CanBeBuild tag(List<Tag> tag);

        CanBeBuild category(Category category);

        CanBeBuild autor(String autor);

        Article build();
    }


}
