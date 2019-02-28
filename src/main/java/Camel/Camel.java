package Camel;

import Article.Article;

public class Camel{
    private Long id;
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    private Fur furColor;

    public static NeedId builder(){
      return new Builder();
    }

    public static class Builder implements NeedId, NeedName, NeedAge, NeedGender, CanBeBuild {
        private Long id;
        private String name;
        private int age;
        private Gender gender;
        private double weight;
        private double height;
        private Fur furColor;

        @Override
        public NeedName id(Long id) {
            this.id = id;
            return this;
        }

        @Override
        public NeedAge name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public NeedGender age(int age) {
            this.age = age;
            return this;
        }

        @Override
        public CanBeBuild gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        @Override
        public CanBeBuild height(double height) {
            this.height = height;
            return this;
        }

        @Override
        public CanBeBuild weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public CanBeBuild fur(Fur furColor) {
            this.furColor = furColor;
            return this;
        }

        public Camel build(){
            Camel camel = new Camel();
            camel.id = this.id;
            camel.name = this.name;
            camel.age = this.age;
            camel.furColor = this.furColor;
            camel.gender = this.gender;
            camel.height = this.height;
            camel.weight = this.weight;
            return camel;
        }
    }

    public interface NeedId{
        NeedName id(Long id);
    }

    public interface NeedName{
        NeedAge name(String name);
    }

    public interface NeedAge{
        NeedGender age(int age);
    }

    public interface NeedGender{
        CanBeBuild gender(Gender gender);
    }

    public interface CanBeBuild {
        CanBeBuild height(double height);
        CanBeBuild fur(Fur furColor);
        CanBeBuild weight(double weight);
        Camel build();
    }


}
