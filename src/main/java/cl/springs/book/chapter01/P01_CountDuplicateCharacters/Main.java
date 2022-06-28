package cl.springs.book.chapter01.P01_CountDuplicateCharacters;

public class Main {

    private static final java.lang.String TEXT = "Sé fuerte, no tengas miedo, sé hermosa. "
                                        + "Y cree que todo es posible cuando tienes "
                                        + "a las personas adecuadas para apoyarte.";

    private static final java.lang.String TEXT_CP = TEXT + "\uD83D\uDE0D ¡Te amo \uD83D\uDC95 tanto \uD83D\uDC95 \uD83D\uDE0D \uD83C\uDFBC\uD83C\uDFBC\uD83C\uDFBC!";


    public static void main(String[] args) {
        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("Input text: \n" + TEXT_CP + "\n");
    }
}
