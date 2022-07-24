package algorithms;

/**
 * �հ� �˰��� : �־��� ������ �־��� ���ǿ� �ش��ϴ� �ڷ���� �հ�
 * 	n���� ���� ���� �߿��� 80�� �̻��� ������ �հ�
 * @author PPOPP
 *
 */
public class SumAlgorithgm {

	public static void main(String[] args) {
		// Input - n���� ���� ����
		int[] scores = {100, 75, 50, 37, 90, 95};
		int sum = 0;
		
		// Process - �հ� �˰��� ���� : �־��� ������ �־��� ����(���͸�)
		for(int i=0; i<scores.length; i++) {
			if(scores[i] >= 80) {
				sum += scores[i]; // SUM
			}
		}
		
		// Output
		System.out.println(scores.length + "���� ���� �� 80�� �̻��� ���� : " + sum);
	}
}
