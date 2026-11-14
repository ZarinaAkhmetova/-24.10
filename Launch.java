package base;

public class Launch {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(new int[][] {{2, 3, 7}, {4, 5, 1}});
        matrix.print();
        System.out.println(matrix.rows() + " " + matrix.cols() + " " + matrix.isSquare());
        Matrix transMatrix = new Matrix(matrix.transpose());
        transMatrix.print();

        Sentence sentence = new Sentence("В лесу родилась ёлочка");
        String[] words = sentence.words();
        for(int i = 0; i < words.length; ++i) {
            System.out.println(words[i]);
        }
        System.out.println(sentence.shortestWords());
        System.out.println(sentence.containsWords("лесу"));
        System.out.println(sentence.containsWords("ель"));
    }
}
