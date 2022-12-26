public class HelloUniverse {

    public static void main(String[] args) {
        int planetNumber = 8;

        String sentence1 = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est : ";
        String sentence2 = "Il y a quelques années cependant, elles étaient au nombre de : ";

        System.out.println(sentence1 + planetNumber);
        System.out.println(sentence2 + (planetNumber+1));
    }
}
