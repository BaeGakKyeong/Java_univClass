package class03;

public class Ex09 {
    public static void main(String[] args){
        double[][] score = {
            {3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}
        };

        double sum = 0;
        int count = 0;

        for(int i = 0; i < score.length; i++){
            for(int j = 0; j < score[i].length; j++){
                sum += score[i][j];
                count++;
            }
        }

        System.out.println("4학년 전체 평점 평균은" + sum / count);
    }
}
